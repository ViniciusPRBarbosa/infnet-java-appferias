package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appferias.model.service.PlanoService;

@Controller
public class PlanoController {
	
	@Autowired
	private PlanoService planoService;
	
	@GetMapping(value = "/plano/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", planoService.obterLista());
		
		return "plano/lista";
	}
	
	@GetMapping(value = "/plano/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		planoService.excluir(id);
		
		return "redirect:/plano/lista";
	}
}
