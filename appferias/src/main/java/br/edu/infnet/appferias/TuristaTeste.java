package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.controller.TuristaController;
import br.edu.infnet.appferias.model.domain.Turista;

@Order(5)
@Component
public class TuristaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE TURISTAS ========");

		Turista t1 = new Turista();

		t1.setNome("Vinícius Pereira Reis Barbosa");
		t1.setEmail("vinicius.barbosa@email.com");
		t1.setPossuiPassaporte(true);
		t1.setDataNascimento(LocalDateTime.of(1990, Month.APRIL, 30, 0, 0, 0));

		TuristaController.incluir(t1);
		System.out.println(t1.toString());
		
		Turista t2 = new Turista();

		t2.setNome("Bernard Pereira dos Reis Barbosa");
		t2.setEmail("bernard.barbosa@email.com");
		t2.setPossuiPassaporte(false);
		t2.setDataNascimento(LocalDateTime.of(1996, Month.DECEMBER, 23, 0, 0, 0));

		TuristaController.incluir(t2);
		System.out.println(t2.toString());
		
		Turista t3 = new Turista();

		t3.setNome("Marina Garcia de Vechi");
		t3.setEmail("marina.vechi@email.com");
		t3.setPossuiPassaporte(true);
		t3.setDataNascimento(LocalDateTime.of(1991, Month.MARCH, 1, 0, 0, 0));

		TuristaController.incluir(t3);
		System.out.println(t3.toString());
		
		System.out.println("\n");
	}

}