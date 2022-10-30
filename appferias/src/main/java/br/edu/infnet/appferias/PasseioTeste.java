package br.edu.infnet.appferias;

import java.util.ArrayList;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Passeio;

@Order(1)
@Component
public class PasseioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE PASSEIOS ========");
		Passeio p1 = new Passeio();
		
		p1.localOrigem = "Apartamento de amigo";
		p1.localDestino = "Piccadilly Circus";
		p1.possuiPontosDeParada = true;
		
		p1.pontosDeParada = new ArrayList<String>();
		p1.pontosDeParada.add("Big Ben");
		p1.pontosDeParada.add("Palacio de Buckingham");
		p1.pontosDeParada.add("London Eye");
		
		System.out.println(p1.toString());
		
		Passeio p2 = new Passeio();
		
		p2.localOrigem = "Casa de parente";
		p2.localDestino = "World Museum";
		p2.possuiPontosDeParada = true;
		
		p2.pontosDeParada = new ArrayList<String>();
		p2.pontosDeParada.add("Royal Albert Dock");
		p2.pontosDeParada.add("Museum of Liverpool");
		p2.pontosDeParada.add("Kaspa's Liverpool");
		
		System.out.println(p2.toString());
		
		Passeio p3 = new Passeio();
		
		p3.localOrigem = "Casa de parente";
		p3.localDestino = "Cavern Club";
		p3.possuiPontosDeParada = false;
		
		System.out.println(p3.toString());
		
		System.out.println("\n");
	}
}