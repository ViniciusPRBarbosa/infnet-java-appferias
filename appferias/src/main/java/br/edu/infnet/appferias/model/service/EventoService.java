package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.repository.EventoRepository;

@Service
public class EventoService {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	public void incluir(Evento evento) {
		eventoRepository.save(evento);
	}

	public Collection<Evento> obterLista(){
		return (Collection<Evento>) eventoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		eventoRepository.deleteById(id);
	}
}
