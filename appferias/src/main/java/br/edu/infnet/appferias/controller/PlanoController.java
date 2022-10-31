package br.edu.infnet.appferias.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Plano;

@Controller
public class PlanoController {
	
	private static Map<Integer, Plano> mapa = new HashMap<Integer, Plano>();
	private static Integer id = 1;
	
	public static void incluir(Plano plano) {
		plano.setId(id++);
		mapa.put(plano.getId(), plano);
	}

	public static Collection<Plano> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/plano/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "plano/lista";
	}
}
