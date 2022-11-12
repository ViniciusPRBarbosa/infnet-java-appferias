package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appferias.model.service.PasseioService;

@Controller
public class PasseioController {
	
	@Autowired
	private PasseioService passeioService; 
	
	@GetMapping(value = "/passeio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", passeioService.obterLista());
		
		return "passeio/lista";
	}
	
	@GetMapping(value = "/passeio/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		passeioService.excluir(id);
		
		return "redirect:/passeio/lista";
	}
}
