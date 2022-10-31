package br.edu.infnet.appferias.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appferias.model.domain.Visita;

@Controller
public class VisitaController {
	
	private static Map<Integer, Visita> mapa = new HashMap<Integer, Visita>();
	private static Integer id = 1;
	
	public static void incluir(Visita visita) {
		visita.setId(id++);
		mapa.put(visita.getId(), visita);
	}

	public static Collection<Visita> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value = "/visita/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "visita/lista";
	}
	
	@GetMapping(value = "/visita/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/visita/lista";
	}
}
