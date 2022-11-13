package br.edu.infnet.appferias.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appferias.model.domain.Usuario;

@FeignClient(url = "http://localhost:8081/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {
	
	@PostMapping(value = "/incluir")
	void incluir(@RequestBody Usuario usuario);
	
	@DeleteMapping(value = "/{id}/excluir")
	void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	List<Usuario> obterLista();
	
	@PostMapping(value = "/validar")
	Usuario validar(@RequestParam String email, @RequestParam String senha);
}