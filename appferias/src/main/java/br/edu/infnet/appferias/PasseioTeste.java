package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;
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
		
		System.out.println(p1.toString());
		
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
		
		System.out.println(p2.toString());
		
		Passeio p3 = new Passeio();
		
		p3.setTitulo("Segundo dia em Liverpool");
		p3.setObjetivo("Conhecer a cidade");
		p3.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 18, 8, 0, 0));
		p3.setEmGrupo(true);
		p3.setLocalOrigem("Casa de parente");
		p3.setLocalDestino("Cavern Club");
		p3.setPossuiPontosDeParada(false);
		
		System.out.println(p3.toString());
		
		System.out.println("\n");
	}
}
