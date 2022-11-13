package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.domain.Visita;
import br.edu.infnet.appferias.model.repository.VisitaRepository;

@Service
public class VisitaService {
	
	@Autowired
	private VisitaRepository visitaRepository;
	
	public void incluir(Visita visita) {
		visitaRepository.save(visita);
	}

	public Collection<Visita> obterLista(){
		return (Collection<Visita>) visitaRepository.findAll();
	}
	
	public Collection<Visita> obterLista(Usuario usuario){
		return (Collection<Visita>) visitaRepository.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		visitaRepository.deleteById(id);
	}
}
