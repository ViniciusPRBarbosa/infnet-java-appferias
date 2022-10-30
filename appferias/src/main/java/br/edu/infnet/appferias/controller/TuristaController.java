package br.edu.infnet.appferias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TuristaController {
	
	@GetMapping(value = "/turista/lista")
	public String telaLista() {
		return "turista/lista";
	}
}

