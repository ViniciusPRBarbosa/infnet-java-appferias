package br.edu.infnet.appferias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Turista;
import br.edu.infnet.appferias.model.service.TuristaService;

@Order(5)
@Component
public class TuristaTeste implements ApplicationRunner {

	@Autowired
	private TuristaService turistaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE TURISTAS ========");

		Turista t1 = new Turista();

		t1.setNome("Vinícius Pereira Reis Barbosa");
		t1.setEmail("vinicius.barbosa@email.com");
		t1.setPossuiPassaporte(true);
		t1.setDataNascimento("1990-04-30");

		turistaService.incluir(t1);
		System.out.println(t1.toString());
		
		Turista t2 = new Turista();

		t2.setNome("Bernard Pereira dos Reis Barbosa");
		t2.setEmail("bernard.barbosa@email.com");
		t2.setPossuiPassaporte(false);
		t2.setDataNascimento("1996-12-26");

		turistaService.incluir(t2);
		System.out.println(t2.toString());
		
		Turista t3 = new Turista();

		t3.setNome("Marina Garcia de Vechi");
		t3.setEmail("marina.vechi@email.com");
		t3.setPossuiPassaporte(true);
		t3.setDataNascimento("1991-03-01");

		turistaService.incluir(t3);
		System.out.println(t3.toString());
		
		System.out.println("\n");
	}

}