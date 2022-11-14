package br.edu.infnet.apiplano.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiplano.model.domain.Evento;
import br.edu.infnet.apiplano.model.repository.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eventoRepository;
	
	public void incluir(Evento evento) {
		eventoRepository.save(evento);
	}

	public List<Evento> obterLista(){
		return (List<Evento>) eventoRepository.findAll();
	}
	
	public List<Evento> obterLista(Integer id){
		return eventoRepository.obterLista(id);
	}
	
	public void excluir(Integer id) {
		eventoRepository.deleteById(id);
	}
}
