package br.edu.infnet.appferias.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Evento;

@Controller
public class EventoController {
	
	@GetMapping(value = "/evento/lista")
	public String telaLista(Model model) {
		
		List<Evento> eventos = new ArrayList<Evento>();
		
		Evento e1 = new Evento();
		
		e1.setTitulo("Primeiro dia em Londres");
		e1.setObjetivo("Conhecer a cidade");
		e1.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 3, 8, 0, 0));
		e1.setEmGrupo(false);
		e1.setDescricao("Troca da guarda da Rainha");
		e1.setEndereco("Palacio de Buckingham");
		e1.setEhPago(false);
		
		Evento e2 = new Evento();
		
		e2.setTitulo("Segundo dia em Londres");
		e2.setObjetivo("Conhecer a cidade");
		e2.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 4, 8, 0, 0));
		e2.setEmGrupo(false);
		e2.setDescricao("Volta do London Eye");
		e2.setEndereco("Riverside Building, County Hall, Londres");
		e2.setEhPago(true);
		e2.setCustoIngresso(450);
		
		Evento e3 = new Evento();
		
		e3.setTitulo("Primeiro show na Europa");
		e3.setObjetivo("Ir a um show da banda preferida");
		e3.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 8, 8, 0, 0));
		e3.setEmGrupo(true);
		e3.setDescricao("Show do Metallica");
		e3.setEndereco("Twickenham Stadium, Londres");
		e3.setEhPago(true);
		e3.setCustoIngresso(15);
		
		eventos.add(e1);
		eventos.add(e2);
		eventos.add(e3);
		
		model.addAttribute("listagem", eventos);
		
		return "evento/lista";
	}
}
