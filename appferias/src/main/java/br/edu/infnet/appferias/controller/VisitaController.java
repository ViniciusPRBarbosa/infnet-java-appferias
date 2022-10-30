package br.edu.infnet.appferias.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Visita;

@Controller
public class VisitaController {
	
	@GetMapping(value = "/visita/lista")
	public String telaLista(Model model) {
		
		List<Visita> visitas = new ArrayList<Visita>();
		
		Visita v1 = new Visita();
		
		v1.setTitulo("Primeira visita na Europa");
		v1.setObjetivo("Visitar a prima");
		v1.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 3, 8, 0, 0));
		v1.setEmGrupo(true);
		v1.setEndereco("Studio Tour Dr, Leavesden, Watford WD25 7LR, United Kingdom");
		v1.setEhPontoTuristico(true);
		
		v1.setPontosDeInteresse(new ArrayList<String>());
		v1.getPontosDeInteresse().add("Tirar fotos");
		v1.getPontosDeInteresse().add("Provar cerveja amateigada");
		v1.getPontosDeInteresse().add("Comprar brides");
		
		Visita v2 = new Visita();
		
		v2.setTitulo("Visita a Keukenhof");
		v2.setObjetivo("Conhecer o parque das tulipas");
		v2.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 15, 8, 0, 0));
		v2.setEmGrupo(false);
		v2.setEndereco("Lisse, Netherlands");
		v2.setEhPontoTuristico(true);
		
		v2.setPontosDeInteresse(new ArrayList<String>());
		v2.getPontosDeInteresse().add("Tirar fotos");
		v2.getPontosDeInteresse().add("Provar achocolatado e croissants");
		v2.getPontosDeInteresse().add("Entrar em labirintos");
		
		Visita v3 = new Visita();
		
		v3.setTitulo("Visitar a prima");
		v3.setObjetivo("Conhecer a prima");
		v3.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 15, 8, 0, 0));
		v3.setEmGrupo(true);
		v3.setEndereco("Reimenhof 41, 3530 Houthalen-Helchteren");
		v3.setEhPontoTuristico(false);
		
		v3.setPontosDeInteresse(new ArrayList<String>());
		v3.getPontosDeInteresse().add("Almoçar em família");
		
		visitas.add(v1);
		visitas.add(v2);
		visitas.add(v3);
		
		model.addAttribute("listagem", visitas);
		
		return "visita/lista";
	}
}
