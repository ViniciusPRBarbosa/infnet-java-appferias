package br.edu.infnet.appferias.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Turista;

@Controller
public class TuristaController {
	
	private static Map<Integer, Turista> mapa = new HashMap<Integer, Turista>();
	private static Integer id = 1;
	
	public static void incluir(Turista turista) {
		turista.setId(id++);
		mapa.put(turista.getId(), turista);
	}

	public static Collection<Turista> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/turista/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "turista/lista";
	}
}

