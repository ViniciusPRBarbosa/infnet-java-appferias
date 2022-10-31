package br.edu.infnet.appferias.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;

@Controller
public class PlanejamentoFeriasController {
	
	private static Map<Integer, PlanejamentoFerias> mapa = new HashMap<Integer, PlanejamentoFerias>();
	private static Integer id = 1;
	
	public static void incluir(PlanejamentoFerias planejamentoFerias) {
		planejamentoFerias.setId(id++);
		mapa.put(planejamentoFerias.getId(), planejamentoFerias);
	}

	public static Collection<PlanejamentoFerias> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value = "/planejamentoferias/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "planejamentoFerias/lista";
	}
	
	@GetMapping(value = "/planejamentoferias/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/planejamentoferias/lista";
	}
}
