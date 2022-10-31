package br.edu.infnet.appferias.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Evento;

@Controller
public class EventoController {
	
	private static Map<Integer, Evento> mapa = new HashMap<Integer, Evento>();
	private static Integer id = 1;
	
	public static void incluir(Evento evento) {
		evento.setId(id++);
		mapa.put(evento.getId(), evento);
	}

	public static Collection<Evento> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/evento/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "evento/lista";
	}
}
