package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Turista;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.repository.TuristaRepository;

@Service
public class TuristaService {
	
	@Autowired
	private TuristaRepository turistaRepository;
	
	public void incluir(Turista turista) {
		turistaRepository.save(turista);
	}

	public Collection<Turista> obterLista(){
		return (Collection<Turista>) turistaRepository.findAll();
	}
	
	public Collection<Turista> obterLista(Usuario usuario){
		return (Collection<Turista>) turistaRepository.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		turistaRepository.deleteById(id);
	}
}
