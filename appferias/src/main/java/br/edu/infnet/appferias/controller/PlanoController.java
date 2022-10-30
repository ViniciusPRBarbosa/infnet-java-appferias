package br.edu.infnet.appferias.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.Plano;
import br.edu.infnet.appferias.model.domain.Visita;

@Controller
public class PlanoController {
	
	@GetMapping(value = "/plano/lista")
	public String telaLista(Model model) {
		
		List<Plano> planos = new ArrayList<Plano>();
		
		Passeio p1 = new Passeio();
		
		p1.setTitulo("Primeiro dia em Londres");
		p1.setObjetivo("Conhecer a cidade");
		p1.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 3, 8, 0, 0));
		p1.setEmGrupo(false);
		p1.setLocalOrigem("Apartamento de amigo");
		p1.setLocalDestino("Piccadilly Circus");
		p1.setPossuiPontosDeParada(true);
		
		p1.setPontosDeParada(new ArrayList<String>());
		p1.getPontosDeParada().add("Big Ben");
		p1.getPontosDeParada().add("Palacio de Buckingham");
		p1.getPontosDeParada().add("London Eye");
		
		Visita v1 = new Visita();
		
		v1.setTitulo("Visita a Keukenhof");
		v1.setObjetivo("Conhecer o parque das tulipas");
		v1.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 15, 8, 0, 0));
		v1.setEmGrupo(false);
		v1.setEndereco("Lisse, Netherlands");
		v1.setEhPontoTuristico(true);
		
		v1.setPontosDeInteresse(new ArrayList<String>());
		v1.getPontosDeInteresse().add("Tirar fotos");
		v1.getPontosDeInteresse().add("Provar achocolatado e croissants");
		v1.getPontosDeInteresse().add("Entrar em labirintos");
		
		Evento e1 = new Evento();
		
		e1.setTitulo("Pontos turísticos de Londres - London Eye");
		e1.setObjetivo("Tirar fotos");
		e1.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 4, 8, 0, 0));
		e1.setEmGrupo(true);
		e1.setDescricao("Volta do London Eye");
		e1.setEndereco("Riverside Building, County Hall, Londres");
		e1.setEhPago(true);
		e1.setCustoIngresso(450);

		planos.add(p1);
		planos.add(v1);
		planos.add(e1);
		
		model.addAttribute("listagem", planos);
		
		return "plano/lista";
	}
}
