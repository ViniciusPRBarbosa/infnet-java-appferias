package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;

@Order(4)
@Component
public class PlanejamentoFeriasTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("======== TESTANDO IMPRESSÃO DE PLANEJAMENTOS DE FÉRIAS ========");

		PlanejamentoFerias p1 = new PlanejamentoFerias();

		p1.titulo = "Primeira viagem para a Europa";
		p1.descricao = "Viagem para a Europa, com visita a parentes e a locais turisticos.";
		p1.dataInicio = LocalDateTime.of(2022, Month.MAY, 1, 8, 0, 0);
		p1.dataFim = LocalDateTime.of(2022, Month.MAY, 30, 23, 59, 0);
		
		System.out.println(p1.toString());
		
		PlanejamentoFerias p2 = new PlanejamentoFerias();

		p2.titulo = "Primeira viagem para a Asia";
		p2.descricao = "Viagem para ao Japão, com visita a locais turisticos.";
		p2.dataInicio = LocalDateTime.of(2022, Month.AUGUST, 1, 8, 0, 0);
		p2.dataFim = LocalDateTime.of(2022, Month.AUGUST, 30, 23, 59, 0);
		
		System.out.println(p2.toString());
		
		PlanejamentoFerias p3 = new PlanejamentoFerias();

		p3.titulo = "Viagem a cidade de parentes";
		p3.descricao = "Viagem para cidade natal, para visita a parentes e a locais de infância.";
		p3.dataInicio = LocalDateTime.of(2022, Month.FEBRUARY, 1, 8, 0, 0);
		p3.dataFim = LocalDateTime.of(2022, Month.FEBRUARY, 27, 23, 59, 0);
		
		System.out.println(p3.toString());
		
		System.out.println("\n");
	}
}
