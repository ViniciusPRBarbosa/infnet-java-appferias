package br.edu.infnet.appferias.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Passeio;

@Controller
public class PasseioController {
	
	private static List<Passeio> passeios = new ArrayList<Passeio>();
	
	public static void incluir(Passeio passeio) {
		passeios.add(passeio);
	}
	
	@GetMapping(value = "/passeio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", passeios);
		
		return "passeio/lista";
	}
}
