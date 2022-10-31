package br.edu.infnet.appferias.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appferias.model.domain.Passeio;

@Controller
public class PasseioController {
	
	private static Map<Integer, Passeio> mapa = new HashMap<Integer, Passeio>();
	private static Integer id = 1;
	
	public static void incluir(Passeio passeio) {
		passeio.setId(id++);
		mapa.put(passeio.getId(), passeio);
	}

	public static Collection<Passeio> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value = "/passeio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "passeio/lista";
	}
	
	@GetMapping(value = "/passeio/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/passeio/lista";
	}
}
