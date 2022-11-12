package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Turista;

@Service
public class TuristaService {
	private static Map<Integer, Turista> mapa = new HashMap<Integer, Turista>();
	private static Integer id = 1;
	
	public void incluir(Turista turista) {
		turista.setId(id++);
		mapa.put(turista.getId(), turista);
	}

	public Collection<Turista> obterLista(){
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}
