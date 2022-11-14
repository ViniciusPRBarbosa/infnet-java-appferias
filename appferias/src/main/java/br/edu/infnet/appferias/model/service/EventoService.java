package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.IEventoClient;
import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.domain.Usuario;

@Service
public class EventoService {
	
	@Autowired
	private IEventoClient eventoClient;
	
	public void incluir(Evento evento) {
		eventoClient.incluir(evento);
	}

	public Collection<Evento> obterLista(){
		return (Collection<Evento>) eventoClient.obterLista();
	}
	
	public Collection<Evento> obterLista(Usuario usuario){
		return (Collection<Evento>) eventoClient.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		eventoClient.excluir(id);
	}
}
