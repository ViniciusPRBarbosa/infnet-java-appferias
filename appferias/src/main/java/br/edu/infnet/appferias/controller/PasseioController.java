package br.edu.infnet.appferias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.service.PasseioService;

@Controller
public class PasseioController {
	
	@Autowired
	private PasseioService passeioService; 
	
	@GetMapping(value = "/passeio/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", passeioService.obterLista(usuario));
		
		return "passeio/lista";
	}
	
	@GetMapping(value = "/passeio")
	public String telaCadastro() {
		return "passeio/cadastro";
	}
	
	@PostMapping(value = "/passeio/incluir")
	public String incluir(Passeio passeio, @SessionAttribute("user") Usuario usuario) {
		passeio.setUsuario(usuario);
		passeio.setPossuiPontosDeParada(passeio.getPontosDeParada().size() > 0);
		
		passeioService.incluir(passeio);
		
		return "redirect:/passeio/lista";
	}
	
	@GetMapping(value = "/passeio/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		passeioService.excluir(id);
		
		return "redirect:/passeio/lista";
	}
}
