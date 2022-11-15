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

import br.edu.infnet.apiplano.model.domain.Passeio;
import br.edu.infnet.apiplano.model.services.PasseioService;

@RestController
@RequestMapping("/api/passeio")
public class PasseioController {
	
	@Autowired
	private PasseioService passeioService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Passeio passeio) {
		passeioService.incluir(passeio);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		passeioService.excluir(id);
	}
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Passeio> obterLista(@PathVariable Integer id){
		return passeioService.obterLista(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Passeio> obterLista(){
		return passeioService.obterLista();
	}
}
