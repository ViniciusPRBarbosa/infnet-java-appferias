package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.service.UsuarioService;

@Controller
public class AppController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.validar(email, senha);
		
		if(usuario != null) {
			model.addAttribute("user", usuario);
			
			return "home";
		}
		
		return "login";
	}
}
