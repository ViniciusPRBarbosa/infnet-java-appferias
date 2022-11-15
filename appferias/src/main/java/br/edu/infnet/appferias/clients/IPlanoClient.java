package br.edu.infnet.appferias.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appferias.model.domain.Plano;

@FeignClient(url = "http://localhost:8083/api/plano", name = "planoClient")
public interface IPlanoClient {
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<Plano> obterLista(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Plano> obterLista();
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
}