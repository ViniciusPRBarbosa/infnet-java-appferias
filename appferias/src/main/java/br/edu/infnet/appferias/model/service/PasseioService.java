package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.Passeio;

@Service
public class PasseioService {
	private static Map<Integer, Passeio> mapa = new HashMap<Integer, Passeio>();
	private static Integer id = 1;
	
	public void incluir(Passeio passeio) {
		passeio.setId(id++);
		mapa.put(passeio.getId(), passeio);
	}

	public Collection<Passeio> obterLista(){
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

}
