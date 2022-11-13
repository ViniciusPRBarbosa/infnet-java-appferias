package br.edu.infnet.apiturista.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiturista.model.domain.Turista;

@RestController
@RequestMapping("/api/turista")
public class TuristaController {
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Turista turista) {
		System.out.println("#incluir = " + turista);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("#excluir = " + id);
	}
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Turista> obterLista(@PathVariable Integer id){
		System.out.println("#obterLista pelo usuario de id: " + id);
		
		Turista turista = new Turista();
		
		turista.setId(1);
		turista.setNome("Nome teste");
		turista.setEmail("E-mail teste");
		turista.setDataNascimento(LocalDate.of(1990, 4, 30));
		turista.setPossuiPassaporte(true);
		
		return new ArrayList<Turista>(Arrays.asList(turista));
	}
	
	@GetMapping(value = "/listar")
	public List<Turista> obterLista(){
		System.out.println("#obterLista");
		
		Turista turista = new Turista();
		
		turista.setId(1);
		turista.setNome("Nome teste");
		turista.setEmail("E-mail teste");
		turista.setDataNascimento(LocalDate.of(1990, 4, 30));
		turista.setPossuiPassaporte(true);
		
		return new ArrayList<Turista>(Arrays.asList(turista));
	}
}
