package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Plano;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.repository.PlanoRepository;

@Service
public class PlanoService {
	
	@Autowired
	private PlanoRepository planoRepository;
	
	public void incluir(Plano plano) {
		planoRepository.save(plano);
	}

	public Collection<Plano> obterLista(){
		return (Collection<Plano>) planoRepository.findAll();
	}
	
	public Collection<Plano> obterLista(Usuario usuario){
		return (Collection<Plano>) planoRepository.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		planoRepository.deleteById(id);
	}
}
