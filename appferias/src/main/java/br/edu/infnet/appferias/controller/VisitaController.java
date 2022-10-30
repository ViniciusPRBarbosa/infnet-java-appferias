package br.edu.infnet.appferias.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Visita;

@Controller
public class VisitaController {
	
	private static List<Visita> visitas = new ArrayList<Visita>();
	
	public static void incluir(Visita visita) {
		visitas.add(visita);
	}
	
	@GetMapping(value = "/visita/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", visitas);
		
		return "visita/lista";
	}
}
