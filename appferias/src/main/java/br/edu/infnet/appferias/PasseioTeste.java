package br.edu.infnet.appferias;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.service.PasseioService;

@Order(3)
@Component
public class PasseioTeste implements ApplicationRunner {

	@Autowired
	private PasseioService passeioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE PASSEIOS ========");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Passeio p1 = new Passeio();
		
		p1.setTitulo("Primeiro dia em Bruxelas");
		p1.setObjetivo("Conhecer a cidade");
		p1.setDataExecucao(LocalDate.now());
		p1.setEmGrupo(false);
		p1.setLocalOrigem("Rodoviária da cidade");
		p1.setLocalDestino("Praça principal");
		p1.setUsuario(usuario);
		p1.setPossuiPontosDeParada(true);
		
		p1.setPontosDeParada(new ArrayList<String>());
		p1.getPontosDeParada().add("Big Ben");
		p1.getPontosDeParada().add("Palacio de Buckingham");
		p1.getPontosDeParada().add("London Eye");
		
		passeioService.incluir(p1);
		System.out.println(p1.toString());
		
		Passeio p2 = new Passeio();
		
		p2.setTitulo("Primeiro dia em Liverpool");
		p2.setObjetivo("Conhecer a cidade");
		p2.setDataExecucao(LocalDate.now());
		p2.setEmGrupo(true);
		p2.setLocalOrigem("Casa de parente");
		p2.setLocalDestino("World Museum");
		p2.setUsuario(usuario);
		p2.setPossuiPontosDeParada(true);
		
		p2.setPontosDeParada(new ArrayList<String>());
		p2.getPontosDeParada().add("Royal Albert Dock");
		p2.getPontosDeParada().add("Museum of Liverpool");
		p2.getPontosDeParada().add("Kaspa's Liverpool");
		
		passeioService.incluir(p2);
		System.out.println(p2.toString());
		
		Passeio p3 = new Passeio();
		
		p3.setTitulo("Cidades próximas a Liverpool");
		p3.setObjetivo("Conhecer cidades próximas de Liverpool");
		p3.setDataExecucao(LocalDate.now());
		p3.setEmGrupo(true);
		p3.setLocalOrigem("Casa de parente");
		p3.setLocalDestino("Cavern Club");
		p3.setUsuario(usuario);
		p3.setPossuiPontosDeParada(false);
		
		passeioService.incluir(p3);
		System.out.println(p3.toString());
		
		System.out.println("\n");
	}
}
