package br.edu.infnet.apiturista.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.apiturista.model.domain.Turista;
import br.edu.infnet.apiturista.model.repository.TuristaRepository;

@Service
public class TuristaService {
	
	@Autowired
	private TuristaRepository turistaRepository;
	
	public void incluir(Turista turista) {
		turistaRepository.save(turista);
	}
	
	public void excluir(Integer id) {
		turistaRepository.deleteById(id);
	}
	
	public List<Turista> obterLista(Integer id){
		return turistaRepository.obterLista(id);
	}
	
	public List<Turista> obterLista(){
		return (List<Turista>) turistaRepository.findAll();
	}
}
