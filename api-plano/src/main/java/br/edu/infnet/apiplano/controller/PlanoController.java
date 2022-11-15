package br.edu.infnet.apiplano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiplano.model.domain.Plano;
import br.edu.infnet.apiplano.model.services.PlanoService;

@RestController
@RequestMapping("/api/plano")
public class PlanoController {
	
	@Autowired
	private PlanoService planoService;
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Plano> obterLista(@PathVariable Integer id){
		return planoService.obterLista(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Plano> obterLista(){
		return planoService.obterLista();
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		planoService.excluir(id);
	}
}
