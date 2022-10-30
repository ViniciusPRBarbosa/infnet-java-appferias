package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.Visita;

@Order(6)
@Component
public class PlanoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE PLANOS ========");
		
		Passeio p1 = new Passeio();
		
		p1.titulo = "Primeiro dia em Londres";
		p1.objetivo = "Conhecer a cidade";
		p1.dataExecucao = LocalDateTime.of(2022, Month.MAY, 3, 8, 0, 0);
		p1.emGrupo = false;
		p1.localOrigem = "Apartamento de amigo";
		p1.localDestino = "Piccadilly Circus";
		p1.possuiPontosDeParada = true;
		
		p1.pontosDeParada = new ArrayList<String>();
		p1.pontosDeParada.add("Big Ben");
		p1.pontosDeParada.add("Palacio de Buckingham");
		p1.pontosDeParada.add("London Eye");
		
		System.out.println(p1.toString());
		
		Visita v1 = new Visita();
		
		v1.titulo = "Visita a Keukenhof";
		v1.objetivo = "Conhecer o parque das tulipas";
		v1.dataExecucao = LocalDateTime.of(2022, Month.MAY, 15, 8, 0, 0);
		v1.emGrupo = false;
		v1.endereco = "Lisse, Netherlands";
		v1.ehPontoTuristico = true;
		
		v1.pontosDeInteresse = new ArrayList<String>();
		v1.pontosDeInteresse.add("Tirar fotos");
		v1.pontosDeInteresse.add("Provar achocolatado e croissants");
		v1.pontosDeInteresse.add("Entrar em labirintos");
		
		System.out.println(v1.toString());
		
		Evento e1 = new Evento();
		
		e1.titulo = "Pontos turísticos de Londres - London Eye";
		e1.objetivo = "Tirar fotos";
		e1.dataExecucao = LocalDateTime.of(2022, Month.MAY, 4, 8, 0, 0);
		e1.emGrupo = true;
		e1.descricao = "Volta do London Eye";
		e1.endereco = "Riverside Building, County Hall, Londres";
		e1.ehPago = true;
		e1.custoIngresso = 450;
		
		System.out.println(e1.toString());
	}

}
