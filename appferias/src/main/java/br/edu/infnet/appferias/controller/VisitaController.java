package br.edu.infnet.appferias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisitaController {
	
	@GetMapping(value = "/visita/lista")
	public String telaLista() {
		return "visita/lista";
	}
}
