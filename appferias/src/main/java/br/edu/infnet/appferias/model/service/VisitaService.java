package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Visita;

@Service
public class VisitaService {
	private static Map<Integer, Visita> mapa = new HashMap<Integer, Visita>();
	private static Integer id = 1;
	
	public void incluir(Visita visita) {
		visita.setId(id++);
		mapa.put(visita.getId(), visita);
	}

	public Collection<Visita> obterLista(){
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}
