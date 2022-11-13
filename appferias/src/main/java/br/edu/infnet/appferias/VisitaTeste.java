package br.edu.infnet.appferias;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.domain.Visita;
import br.edu.infnet.appferias.model.service.VisitaService;

@Order(5)
@Component
public class VisitaTeste implements ApplicationRunner {

	@Autowired
	private VisitaService visitaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE VISITAS ========");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Visita v1 = new Visita();
		
		v1.setTitulo("Primeira visita na Europa");
		v1.setObjetivo("Visitar a prima");
		v1.setDataExecucao("2022-03-03");
		v1.setEmGrupo(true);
		v1.setEndereco("Studio Tour Dr, Leavesden, Watford WD25 7LR, United Kingdom");
		v1.setEhPontoTuristico(true);
		v1.setUsuario(usuario);
		
		v1.setPontosDeInteresse(new ArrayList<String>());
		v1.getPontosDeInteresse().add("Tirar fotos");
		v1.getPontosDeInteresse().add("Provar cerveja amateigada");
		v1.getPontosDeInteresse().add("Comprar brides");
		
		visitaService.incluir(v1);
		System.out.println(v1.toString());
		
		Visita v2 = new Visita();
		
		v2.setTitulo("Visita a Bruge");
		v2.setObjetivo("Fazer passeio de barco");
		v2.setDataExecucao("2022-03-15");
		v2.setEmGrupo(false);
		v2.setEndereco("Bruge, Belgium");
		v2.setEhPontoTuristico(true);
		v2.setUsuario(usuario);
		
		v2.setPontosDeInteresse(new ArrayList<String>());
		v2.getPontosDeInteresse().add("Tirar fotos");
		
		visitaService.incluir(v2);
		System.out.println(v2.toString());
		
		Visita v3 = new Visita();
		
		v3.setTitulo("Visitar a prima");
		v3.setObjetivo("Conhecer a prima");
		v3.setDataExecucao("2022-03-15");
		v3.setEmGrupo(true);
		v3.setEndereco("Reimenhof 41, 3530 Houthalen-Helchteren");
		v3.setEhPontoTuristico(false);
		v3.setUsuario(usuario);
		
		v3.setPontosDeInteresse(new ArrayList<String>());
		v3.getPontosDeInteresse().add("Almoçar em família");
		
		visitaService.incluir(v3);
		System.out.println(v3.toString());
		
		System.out.println("\n");
	}

}