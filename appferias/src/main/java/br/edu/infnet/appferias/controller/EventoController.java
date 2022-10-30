package br.edu.infnet.appferias.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Evento;

@Controller
public class EventoController {
	
	private static List<Evento> eventos = new ArrayList<Evento>();
	
	public static void incluir(Evento evento) {
		eventos.add(evento);
	}
	
	@GetMapping(value = "/evento/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", eventos);
		
		return "evento/lista";
	}
}
