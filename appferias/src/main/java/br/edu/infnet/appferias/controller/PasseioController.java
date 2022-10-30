package br.edu.infnet.appferias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasseioController {
	
	@GetMapping(value = "/passeio/lista")
	public String telaLista() {
		return "passeio/lista";
	}
}
