package br.edu.infnet.apiusuario.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiusuario.model.domain.Endereco;
import br.edu.infnet.apiusuario.model.domain.Usuario;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Usuario usuario) {
		System.out.println("#incluir = " + usuario);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("#excluir = " + id);
	}
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista(){
		System.out.println("#obterLista");
		
		Endereco endereco = new Endereco();
		
		endereco.setId(1);
		endereco.setBairro("Bairo teste");
		endereco.setCep("Cep teste");
		endereco.setComplemento("Complemento teste");
		endereco.setLocalidade("Localidade teste");
		endereco.setLogradouro("Logradouro teste");
		endereco.setUf("UF teste");
		
		Usuario usuario = new Usuario();
		
		usuario.setId(1);
		usuario.setEmail("email@email.com");
		usuario.setNome("Usuario teste");
		usuario.setSenha("123456");
		usuario.setEndereco(endereco);
		
		return new ArrayList<Usuario>(Arrays.asList(usuario));
	}
	
	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha) {
		System.out.println("#validar " + email + " - " + senha);

		Endereco endereco = new Endereco();
		
		endereco.setId(1);
		endereco.setBairro("Bairo teste");
		endereco.setCep("Cep teste");
		endereco.setComplemento("Complemento teste");
		endereco.setLocalidade("Localidade teste");
		endereco.setLogradouro("Logradouro teste");
		endereco.setUf("UF teste");
		
		Usuario usuario = new Usuario();
		
		usuario.setId(1);
		usuario.setEmail("email@email.com");
		usuario.setNome("Usuario teste");
		usuario.setSenha("123456");
		usuario.setEndereco(endereco);
		
		return usuario;
	}
	
}
