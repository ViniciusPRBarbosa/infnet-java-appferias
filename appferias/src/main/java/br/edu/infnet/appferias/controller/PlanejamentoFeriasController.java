package br.edu.infnet.appferias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanejamentoFeriasController {
	
	@GetMapping(value = "/planejamentoferias/lista")
	public String telaLista() {
		return "planejamentoFerias/lista";
	}
}
