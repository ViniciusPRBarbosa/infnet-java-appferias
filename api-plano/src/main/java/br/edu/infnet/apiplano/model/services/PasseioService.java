package br.edu.infnet.apiplano.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiplano.model.domain.Passeio;
import br.edu.infnet.apiplano.model.repository.PasseioRepository;

@Service
public class PasseioService {

	@Autowired
	private PasseioRepository passeioRepository;
	
	public void incluir(Passeio passeio) {
		passeioRepository.save(passeio);
	}

	public List<Passeio> obterLista(){
		return (List<Passeio>) passeioRepository.findAll();
	}
	
	public List<Passeio> obterLista(Integer id){
		return passeioRepository.obterLista(id);
	}
	
	public void excluir(Integer id) {
		passeioRepository.deleteById(id);
	}
}
