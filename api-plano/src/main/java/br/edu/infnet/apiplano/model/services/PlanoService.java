package br.edu.infnet.apiplano.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiplano.model.domain.Plano;
import br.edu.infnet.apiplano.model.repository.PlanoRepository;

@Service
public class PlanoService {

	@Autowired
	private PlanoRepository planoRepository;
	
	public List<Plano> obterLista(){
		return (List<Plano>) planoRepository.findAll();
	}
	
	public List<Plano> obterLista(Integer id){
		return planoRepository.obterLista(id);
	}
	
	public void excluir(Integer id) {
		planoRepository.deleteById(id);
	}
}
