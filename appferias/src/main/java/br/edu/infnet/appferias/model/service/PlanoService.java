package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Plano;

@Service
public class PlanoService {
	private static Map<Integer, Plano> mapa = new HashMap<Integer, Plano>();
	private static Integer id = 1;
	
	public void incluir(Plano plano) {
		plano.setId(id++);
		mapa.put(plano.getId(), plano);
	}

	public Collection<Plano> obterLista(){
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}
