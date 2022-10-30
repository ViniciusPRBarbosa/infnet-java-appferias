package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.controller.VisitaController;
import br.edu.infnet.appferias.model.domain.Visita;

@Order(3)
@Component
public class VisitaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE VISITAS ========");
		
		Visita v1 = new Visita();
		
		v1.setTitulo("Primeira visita na Europa");
		v1.setObjetivo("Visitar a prima");
		v1.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 3, 8, 0, 0));
		v1.setEmGrupo(true);
		v1.setEndereco("Studio Tour Dr, Leavesden, Watford WD25 7LR, United Kingdom");
		v1.setEhPontoTuristico(true);
		
		v1.setPontosDeInteresse(new ArrayList<String>());
		v1.getPontosDeInteresse().add("Tirar fotos");
		v1.getPontosDeInteresse().add("Provar cerveja amateigada");
		v1.getPontosDeInteresse().add("Comprar brides");
		
		VisitaController.incluir(v1);
		System.out.println(v1.toString());
		
		Visita v2 = new Visita();
		
		v2.setTitulo("Visita a Keukenhof");
		v2.setObjetivo("Conhecer o parque das tulipas");
		v2.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 15, 8, 0, 0));
		v2.setEmGrupo(false);
		v2.setEndereco("Lisse, Netherlands");
		v2.setEhPontoTuristico(true);
		
		v2.setPontosDeInteresse(new ArrayList<String>());
		v2.getPontosDeInteresse().add("Tirar fotos");
		v2.getPontosDeInteresse().add("Provar achocolatado e croissants");
		v2.getPontosDeInteresse().add("Entrar em labirintos");
		
		VisitaController.incluir(v2);
		System.out.println(v2.toString());
		
		Visita v3 = new Visita();
		
		v3.setTitulo("Visitar a prima");
		v3.setObjetivo("Conhecer a prima");
		v3.setDataExecucao(LocalDateTime.of(2022, Month.MAY, 15, 8, 0, 0));
		v3.setEmGrupo(true);
		v3.setEndereco("Reimenhof 41, 3530 Houthalen-Helchteren");
		v3.setEhPontoTuristico(false);
		
		v3.setPontosDeInteresse(new ArrayList<String>());
		v3.getPontosDeInteresse().add("Almoçar em família");
		
		VisitaController.incluir(v3);
		System.out.println(v3.toString());
		
		System.out.println("\n");
	}

}