package br.edu.infnet.appferias.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appferias.model.domain.Visita;

@FeignClient(url = "http://localhost:8083/api/visita", name = "visitaClient")
public interface IVisitaClient {
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Visita visita);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Visita> obterLista(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Visita> obterLista();
}