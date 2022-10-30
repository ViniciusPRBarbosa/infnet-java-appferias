package br.edu.infnet.appferias.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Passeio;

@Controller
public class PasseioController {
	
	@GetMapping(value = "/passeio/lista")
	public String telaLista(Model model) {
		
		List<Passeio> passeios = new ArrayList<Passeio>();
		
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
		
		Passeio p2 = new Passeio();
		
		p2.setTitulo("Primeiro dia em Liverpool");
		p2.setObjetivo("Conhecer a cidade");
		p2.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 17, 8, 0, 0));
		p2.setEmGrupo(true);
		p2.setLocalOrigem("Casa de parente");
		p2.setLocalDestino("World Museum");
		p2.setPossuiPontosDeParada(true);
		
		p2.setPontosDeParada(new ArrayList<String>());
		p2.getPontosDeParada().add("Royal Albert Dock");
		p2.getPontosDeParada().add("Museum of Liverpool");
		p2.getPontosDeParada().add("Kaspa's Liverpool");
		
		Passeio p3 = new Passeio();
		
		p3.setTitulo("Segundo dia em Liverpool");
		p3.setObjetivo("Conhecer a cidade");
		p3.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 18, 8, 0, 0));
		p3.setEmGrupo(true);
		p3.setLocalOrigem("Casa de parente");
		p3.setLocalDestino("Cavern Club");
		p3.setPossuiPontosDeParada(false);
		
		passeios.add(p1);
		passeios.add(p2);
		passeios.add(p3);
		
		model.addAttribute("listagem", passeios);
		
		return "passeio/lista";
	}
}
