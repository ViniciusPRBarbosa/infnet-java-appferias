package br.edu.infnet.appferias.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.IPasseioClient;
import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.Usuario;

@Service
public class PasseioService {
	
	@Autowired
	private IPasseioClient passeioClient;
	
	public void incluir(Passeio passeio) {
		passeioClient.incluir(passeio);
	}

	public Collection<Passeio> obterLista(){
		return (Collection<Passeio>) passeioClient.obterLista();
	}
	
	public Collection<Passeio> obterLista(Usuario usuario){
		return (Collection<Passeio>) passeioClient.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		passeioClient.excluir(id);
	}

}
