package br.edu.infnet.appferias.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.repository.PasseioRepository;

@Service
public class PasseioService {
	
	@Autowired
	private PasseioRepository passeioRepository;
	
	public void incluir(Passeio passeio) {
		passeioRepository.save(passeio);
	}

	public Collection<Passeio> obterLista(){
		return (Collection<Passeio>) passeioRepository.findAll();
	}
	
	public Collection<Passeio> obterLista(Usuario usuario){
		return (Collection<Passeio>) passeioRepository.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		passeioRepository.deleteById(id);
	}

}
