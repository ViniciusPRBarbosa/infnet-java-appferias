package br.edu.infnet.appferias.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Turista;

@Controller
public class TuristaController {
	
	private static List<Turista> turistas = new ArrayList<Turista>();
	
	public static void incluir(Turista turista) {
		turistas.add(turista);
	}
	
	@GetMapping(value = "/turista/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", turistas);
		
		return "turista/lista";
	}
}

