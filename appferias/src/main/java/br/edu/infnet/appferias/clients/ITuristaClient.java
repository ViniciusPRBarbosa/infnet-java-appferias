package br.edu.infnet.appferias.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.edu.infnet.appferias.model.domain.Turista;

@FeignClient(url = "http://localhost:8084/api/turista", name = "turistaClient")
public interface ITuristaClient {
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Turista turista);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Turista> obterLista(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Turista> obterLista();
}