package br.edu.infnet.appferias.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;

@Controller
public class PlanejamentoFeriasController {
	
	private static List<PlanejamentoFerias> planejamentos = new ArrayList<PlanejamentoFerias>();
	
	public static void incluir(PlanejamentoFerias planejamento) {
		planejamentos.add(planejamento);
	}
	
	@GetMapping(value = "/planejamentoferias/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", planejamentos);
		
		return "planejamentoFerias/lista";
	}
}
