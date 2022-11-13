package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.ITuristaClient;
import br.edu.infnet.appferias.model.domain.Turista;
import br.edu.infnet.appferias.model.domain.Usuario;

@Service
public class TuristaService {
	
	@Autowired
	private ITuristaClient turistaClient;
	
	public void incluir(Turista turista) {
		turistaClient.incluir(turista);
	}

	public Collection<Turista> obterLista(){
		return turistaClient.obterLista();
	}
	
	public Collection<Turista> obterLista(Usuario usuario){
		return (Collection<Turista>) turistaClient.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		turistaClient.excluir(id);
	}
}
