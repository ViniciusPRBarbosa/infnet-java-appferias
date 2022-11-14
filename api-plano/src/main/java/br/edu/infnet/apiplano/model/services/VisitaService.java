package br.edu.infnet.apiplano.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiplano.model.domain.Visita;
import br.edu.infnet.apiplano.model.repository.VisitaRepository;

@Service
public class VisitaService {

	@Autowired
	private VisitaRepository visitaRepository;
	
	public void incluir(Visita evento) {
		visitaRepository.save(evento);
	}

	public List<Visita> obterLista(){
		return (List<Visita>) visitaRepository.findAll();
	}
	
	public List<Visita> obterLista(Integer id){
		return visitaRepository.obterLista(id);
	}
	
	public void excluir(Integer id) {
		visitaRepository.deleteById(id);
	}
}
