package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appferias.model.service.PlanejamentoFeriasService;

@Controller
public class PlanejamentoFeriasController {
	
	@Autowired
	private PlanejamentoFeriasService planejamentoFeriasService;
	
	@GetMapping(value = "/planejamentoferias/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", planejamentoFeriasService.obterLista());
		
		return "planejamentoFerias/lista";
	}
	
	@GetMapping(value = "/planejamentoferias/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		planejamentoFeriasService.excluir(id);
		
		return "redirect:/planejamentoferias/lista";
	}
}
