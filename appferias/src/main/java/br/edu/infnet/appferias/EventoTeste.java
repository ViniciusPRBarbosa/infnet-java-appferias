package br.edu.infnet.appferias;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Evento;

@Order(2)
@Component
public class EventoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE EVENTOS ========");
		
		Evento e1 = new Evento();
		
		e1.descricao = "Troca da guarda da Rainha";
		e1.endereco = "Palacio de Buckingham";
		e1.ehPago = false;
		
		System.out.println(e1.toString());
		
		Evento e2 = new Evento();
		
		e2.descricao = "Volta do London Eye";
		e2.endereco = "Riverside Building, County Hall, Londres";
		e2.ehPago = true;
		e2.custoIngresso = 450;
		
		System.out.println(e2.toString());
		
		Evento e3 = new Evento();
		
		e3.descricao = "Show do Metallica";
		e3.endereco = "Twickenham Stadium, Londres";
		e3.ehPago = true;
		e3.custoIngresso = 15;
		
		System.out.println(e3.toString());
		
		System.out.println("\n");
	}

}
