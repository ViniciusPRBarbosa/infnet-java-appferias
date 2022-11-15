package br.edu.infnet.appferias.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appferias.model.domain.Passeio;

@FeignClient(url = "http://localhost:8083/api/passeio", name = "passeioClient")
public interface IPasseioClient {
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Passeio passeio);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Passeio> obterLista(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Passeio> obterLista();
}