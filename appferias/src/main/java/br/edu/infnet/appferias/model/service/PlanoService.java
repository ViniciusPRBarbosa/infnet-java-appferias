package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.IPlanoClient;
import br.edu.infnet.appferias.model.domain.Plano;
import br.edu.infnet.appferias.model.domain.Usuario;

@Service
public class PlanoService {
	
	@Autowired
	private IPlanoClient planoClient;
	
	public Collection<Plano> obterLista(){
		return (Collection<Plano>) planoClient.obterLista();
	}
	
	public Collection<Plano> obterLista(Usuario usuario){
		return (Collection<Plano>) planoClient.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		planoClient.excluir(id);
	}
}
