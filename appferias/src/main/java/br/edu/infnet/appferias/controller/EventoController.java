package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.service.EventoService;

@Controller
public class EventoController {
	
	@Autowired
	private EventoService eventoService;
	
	@GetMapping(value = "/evento/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", eventoService.obterLista());
		
		return "evento/lista";
	}
	
	@GetMapping(value = "/evento")
	public String telaCadastro() {
		return "evento/cadastro";
	}
	
	@PostMapping(value = "/evento/incluir")
	public String incluir(Evento evento) {
		eventoService.incluir(evento);
		
		return "redirect:/evento/lista";
	}
	
	@GetMapping(value = "/evento/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		eventoService.excluir(id);
		
		return "redirect:/evento/lista";
	}
}
