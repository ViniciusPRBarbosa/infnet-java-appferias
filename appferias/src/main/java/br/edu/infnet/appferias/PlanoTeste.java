package br.edu.infnet.appferias;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.domain.Visita;
import br.edu.infnet.appferias.model.service.PlanoService;

@Order(6)
@Component
public class PlanoTeste implements ApplicationRunner {

	@Autowired
	private PlanoService planoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE PLANOS ========");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Passeio p1 = new Passeio();
		
		p1.setTitulo("Primeiro dia em Londres");
		p1.setObjetivo("Conhecer a cidade");
		p1.setDataExecucao(LocalDate.now());
		p1.setEmGrupo(false);
		p1.setLocalOrigem("Apartamento de amigo");
		p1.setLocalDestino("Piccadilly Circus");
		p1.setPossuiPontosDeParada(true);
		p1.setUsuario(usuario);
		
		p1.setPontosDeParada(new ArrayList<String>());
		p1.getPontosDeParada().add("Big Ben");
		p1.getPontosDeParada().add("Palacio de Buckingham");
		p1.getPontosDeParada().add("London Eye");
		
		planoService.incluir(p1);
		System.out.println(p1.toString());
		
		Visita v1 = new Visita();
		
		v1.setTitulo("Visita a Keukenhof");
		v1.setObjetivo("Conhecer o parque das tulipas");
		v1.setDataExecucao(LocalDate.now());
		v1.setEmGrupo(false);
		v1.setEndereco("Lisse, Netherlands");
		v1.setEhPontoTuristico(true);
		v1.setUsuario(usuario);
		v1.setPontosDeInteresse(new ArrayList<String>());
		v1.getPontosDeInteresse().add("Tirar fotos");
		v1.getPontosDeInteresse().add("Provar achocolatado e croissants");
		v1.getPontosDeInteresse().add("Entrar em labirintos");
		
		planoService.incluir(v1);
		System.out.println(v1.toString());
		
		Evento e1 = new Evento();
		
		e1.setTitulo("Pontos turísticos de Londres - London Eye");
		e1.setObjetivo("Tirar fotos");
		e1.setDataExecucao(LocalDate.now());
		e1.setEmGrupo(true);
		e1.setDescricao("Volta do London Eye");
		e1.setEndereco("Riverside Building, County Hall, Londres");
		e1.setEhPago(true);
		e1.setCustoIngresso(450);
		e1.setUsuario(usuario);
		
		planoService.incluir(e1);
		System.out.println(e1.toString());
	}

}
