package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.IVisitaClient;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.domain.Visita;

@Service
public class VisitaService {
	
	@Autowired
	private IVisitaClient visitaClient;
	
	public void incluir(Visita visita) {
		visitaClient.incluir(visita);
	}

	public Collection<Visita> obterLista(){
		return (Collection<Visita>) visitaClient.obterLista();
	}
	
	public Collection<Visita> obterLista(Usuario usuario){
		return (Collection<Visita>) visitaClient.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		visitaClient.excluir(id);
	}
}
