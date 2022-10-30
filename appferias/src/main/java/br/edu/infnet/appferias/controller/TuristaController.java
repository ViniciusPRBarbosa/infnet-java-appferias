package br.edu.infnet.appferias.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appferias.model.domain.Turista;

@Controller
public class TuristaController {
	
	@GetMapping(value = "/turista/lista")
	public String telaLista(Model model) {
		
		List<Turista> turistas = new ArrayList<Turista>();
		
		Turista t1 = new Turista();

		t1.setNome("Vinícius Pereira Reis Barbosa");
		t1.setEmail("vinicius.barbosa@emailteste.com");
		t1.setPossuiPassaporte(true);
		t1.setDataNascimento(LocalDateTime.of(1990, Month.APRIL, 30, 0, 0, 0));

		Turista t2 = new Turista();

		t2.setNome("Bernard Pereira dos Reis Barbosa");
		t2.setEmail("bernard.barbosa@emailteste.com");
		t2.setPossuiPassaporte(false);
		t2.setDataNascimento(LocalDateTime.of(1996, Month.DECEMBER, 23, 0, 0, 0));

		Turista t3 = new Turista();

		t3.setNome("Marina Garcia de Vechi");
		t3.setEmail("marina.vechi@emailteste.com");
		t3.setPossuiPassaporte(true);
		t3.setDataNascimento(LocalDateTime.of(1991, Month.MARCH, 1, 0, 0, 0));

		turistas.add(t1);
		turistas.add(t2);
		turistas.add(t3);
		
		model.addAttribute("listagem", turistas);
		
		return "turista/lista";
	}
}

