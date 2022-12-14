package br.edu.infnet.appferias.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;
import br.edu.infnet.appferias.model.domain.Plano;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.service.PlanejamentoFeriasService;
import br.edu.infnet.appferias.model.service.PlanoService;
import br.edu.infnet.appferias.model.service.TuristaService;

@Controller
public class PlanejamentoFeriasController {
	
	@Autowired
	private PlanejamentoFeriasService planejamentoFeriasService;
	
	@Autowired
	private TuristaService turistaService;
	
	@Autowired
	private PlanoService planoService;
		
	@GetMapping(value = "/planejamentoferias/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", planejamentoFeriasService.obterLista(usuario));
		
		return "planejamentoferias/lista";
	}
	
	@GetMapping(value = "/planejamentoferias")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("turistas", turistaService.obterLista(usuario));
		model.addAttribute("planos", planoService.obterLista(usuario));
		
		return "planejamentoferias/cadastro";
	}
	
	@PostMapping(value = "/planejamentoferias/incluir")
	public String incluir(PlanejamentoFerias planejamentoFerias, @SessionAttribute("user") Usuario usuario) {
		
		if(planejamentoFerias.getPlanos() == null) {
			List<Plano> listaVaziaDePlanos = new ArrayList<Plano>();
			planejamentoFerias.setPlanos(listaVaziaDePlanos);
		}
		else {
			for (Plano plano : planejamentoFerias.getPlanos()) {
				plano.setPlanejamentosFerias(null);
				plano.getUsuario().setPlanejamentoFerias(null);
				plano.getUsuario().setTuristas(null);
				plano.getUsuario().setPlano(null);
			}
		}
		
		planejamentoFerias.getTurista().getUsuario().setPlanejamentoFerias(null);
		planejamentoFerias.getTurista().getUsuario().setPlano(null);
		planejamentoFerias.getTurista().getUsuario().setTuristas(null);
		
		planejamentoFerias.setUsuario(usuario);
			
		planejamentoFeriasService.incluir(planejamentoFerias);
		
		return "redirect:/planejamentoferias/lista";
	}
	
	@GetMapping(value = "/planejamentoferias/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		planejamentoFeriasService.excluir(id);
		
		return "redirect:/planejamentoferias/lista";
	}
}
