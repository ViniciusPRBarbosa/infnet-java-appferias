package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appferias.model.domain.Visita;
import br.edu.infnet.appferias.model.service.VisitaService;

@Controller
public class VisitaController {
	
	@Autowired
	private VisitaService visitaService;
	
	@GetMapping(value = "/visita/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", visitaService.obterLista());
		
		return "visita/lista";
	}
	
	@GetMapping(value = "/visita")
	public String telaCadastro() {
		return "visita/cadastro";
	}
	
	@PostMapping(value = "/visita/incluir")
	public String incluir(Visita visita) {
		visitaService.incluir(visita);
		
		return "redirect:/visita/lista";
	}
	
	@GetMapping(value = "/visita/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		visitaService.excluir(id);
		
		return "redirect:/visita/lista";
	}
}
