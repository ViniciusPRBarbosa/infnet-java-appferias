package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Turista;

@Order(5)
@Component
public class TuristaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE TURISTAS ========");

		Turista t1 = new Turista();

		t1.nome = "Vinícius Pereira Reis Barbosa";
		t1.email = "vinicius.barbosa@emailteste.com";
		t1.possuiPassaporte = true;
		t1.dataNascimento = LocalDateTime.of(1990, Month.APRIL, 30, 0, 0, 0);

		System.out.println(t1.toString());
		
		Turista t2 = new Turista();

		t2.nome = "Bernard Pereira dos Reis Barbosa";
		t2.email = "bernard.barbosa@emailteste.com";
		t2.possuiPassaporte = false;
		t2.dataNascimento = LocalDateTime.of(1996, Month.DECEMBER, 23, 0, 0, 0);

		System.out.println(t2.toString());
		
		Turista t3 = new Turista();

		t3.nome = "Marina Garcia de Vechi";
		t3.email = "marina.vechi@emailteste.com";
		t3.possuiPassaporte = true;
		t3.dataNascimento = LocalDateTime.of(1991, Month.MARCH, 1, 0, 0, 0);

		System.out.println(t3.toString());
		
		System.out.println("\n");
	}

}