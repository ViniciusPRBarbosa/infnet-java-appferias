package br.edu.infnet.appferias.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Plano;

@Controller
public class PlanoController {
	
	private static List<Plano> planos = new ArrayList<Plano>();
	
	public static void incluir(Plano plano) {
		planos.add(plano);
	}
	
	@GetMapping(value = "/plano/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", planos);
		
		return "plano/lista";
	}
}
