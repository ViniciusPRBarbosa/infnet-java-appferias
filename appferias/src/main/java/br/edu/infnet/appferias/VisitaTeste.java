package br.edu.infnet.appferias;

import java.util.ArrayList;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Visita;

@Order(3)
@Component
public class VisitaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE VISITAS ========");
		
		Visita v1 = new Visita();
		
		v1.endereco = "Studio Tour Dr, Leavesden, Watford WD25 7LR, United Kingdom";
		v1.ehPontoTuristico = true;
		
		v1.pontosDeInteresse = new ArrayList<String>();
		v1.pontosDeInteresse.add("Tirar fotos");
		v1.pontosDeInteresse.add("Provar cerveja amateigada");
		v1.pontosDeInteresse.add("Comprar brides");
		
		System.out.println(v1.toString());
		
		Visita v2 = new Visita();
		
		v2.endereco = "Lisse, Netherlands";
		v2.ehPontoTuristico = true;
		
		v2.pontosDeInteresse = new ArrayList<String>();
		v2.pontosDeInteresse.add("Tirar fotos");
		v2.pontosDeInteresse.add("Provar achocolatado e croissants");
		v2.pontosDeInteresse.add("Entrar em labirintos");
		
		System.out.println(v2.toString());
		
		Visita v3 = new Visita();
		
		v3.endereco = "Reimenhof 41, 3530 Houthalen-Helchteren";
		v3.ehPontoTuristico = false;
		
		v3.pontosDeInteresse = new ArrayList<String>();
		v3.pontosDeInteresse.add("Visitar familia");
		
		System.out.println(v3.toString());
		
		System.out.println("\n");
	}

}