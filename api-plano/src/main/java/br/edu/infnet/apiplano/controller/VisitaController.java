package br.edu.infnet.apiplano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiplano.model.domain.Visita;
import br.edu.infnet.apiplano.model.services.VisitaService;

@RestController
@RequestMapping("/api/visita")
public class VisitaController {
	
	@Autowired
	private VisitaService visitaService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Visita visita) {
		visitaService.incluir(visita);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		visitaService.excluir(id);
	}
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Visita> obterLista(@PathVariable Integer id){
		return visitaService.obterLista(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Visita> obterLista(){
		return visitaService.obterLista();
	}
}
