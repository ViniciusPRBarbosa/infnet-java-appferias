package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appferias.model.domain.Turista;
import br.edu.infnet.appferias.model.service.TuristaService;

@Controller
public class TuristaController {
	
	@Autowired
	private TuristaService turistaService;
	
	@GetMapping(value = "/turista/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", turistaService.obterLista());
		
		return "turista/lista";
	}
	
	@GetMapping(value = "/turista")
	public String telaCadastro() {
		return "turista/cadastro";
	}
	
	@PostMapping(value = "/turista/incluir")
	public String incluir(Turista turista) {
		turistaService.incluir(turista);
		
		return "redirect:/turista/lista";
	}
	
	@GetMapping(value = "/turista/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		turistaService.excluir(id);
		
		return "redirect:/turista/lista";
	}
}

