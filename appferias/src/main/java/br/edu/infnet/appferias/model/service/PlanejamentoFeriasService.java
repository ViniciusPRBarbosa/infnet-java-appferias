package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;

@Service
public class PlanejamentoFeriasService {
	
	private static Map<Integer, PlanejamentoFerias> mapa = new HashMap<Integer, PlanejamentoFerias>();
	private static Integer id = 1;
	
	public void incluir(PlanejamentoFerias planejamentoFerias) {
		planejamentoFerias.setId(id++);
		mapa.put(planejamentoFerias.getId(), planejamentoFerias);
	}

	public Collection<PlanejamentoFerias> obterLista(){
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}
