package br.edu.infnet.appferias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {
	
	@GetMapping(value = "/evento/lista")
	public String telaLista() {
		return "evento/lista";
	}
}
