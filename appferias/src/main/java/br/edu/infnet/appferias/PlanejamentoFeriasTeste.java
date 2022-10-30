package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;
import br.edu.infnet.appferias.model.domain.Turista;

@Order(4)
@Component
public class PlanejamentoFeriasTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("======== TESTANDO IMPRESSÃO DE PLANEJAMENTOS DE FÉRIAS ========");

		PlanejamentoFerias p1 = new PlanejamentoFerias();
		
		Turista t1 = new Turista();

		t1.setNome("Vinícius Pereira Reis Barbosa");
		t1.setEmail("vinicius.barbosa@emailteste.com");
		t1.setPossuiPassaporte(true);
		t1.setDataNascimento(LocalDateTime.of(1990, Month.APRIL, 30, 0, 0, 0));

		p1.setTitulo("Primeira viagem para a Europa");
		p1.setDescricao("Viagem para a Europa, com visita a parentes e a locais turisticos.");
		p1.setDataInicio(LocalDateTime.of(2022, Month.MAY, 1, 8, 0, 0));
		p1.setDataFim(LocalDateTime.of(2022, Month.MAY, 30, 23, 59, 0));
		p1.setTurista(t1);
		
		System.out.println(p1.toString());
		
		Turista t2 = new Turista();

		t2.setNome("Bernard Pereira dos Reis Barbosa");
		t2.setEmail("bernard.barbosa@emailteste.com");
		t2.setPossuiPassaporte(false);
		t2.setDataNascimento(LocalDateTime.of(1996, Month.DECEMBER, 23, 0, 0, 0));
		
		PlanejamentoFerias p2 = new PlanejamentoFerias(t2);
		
		p2.setTitulo("Primeira viagem para a Asia");
		p2.setDescricao("Viagem para ao Japão, com visita a locais turisticos.");
		p2.setDataInicio(LocalDateTime.of(2022, Month.AUGUST, 1, 8, 0, 0));
		p2.setDataFim(LocalDateTime.of(2022, Month.AUGUST, 30, 23, 59, 0));
		
		System.out.println(p2.toString());
		
		PlanejamentoFerias p3 = new PlanejamentoFerias();

		Turista t3 = new Turista();

		t3.setNome("Marina Garcia de Vechi");
		t3.setEmail("marina.vechi@emailteste.com");
		t3.setPossuiPassaporte(true);
		t3.setDataNascimento(LocalDateTime.of(1991, Month.MARCH, 1, 0, 0, 0));
		
		p3.setDescricao("Viagem para cidade natal, para visita a parentes e a locais de infância.");
		p3.setDataFim(LocalDateTime.of(2022, Month.DECEMBER, 27, 23, 59, 0));
		p3.setTurista(t3);
		
		System.out.println(p3.toString());
		
		System.out.println("\n");
	}
}
