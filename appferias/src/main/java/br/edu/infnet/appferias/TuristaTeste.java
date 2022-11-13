package br.edu.infnet.appferias;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Turista;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.service.TuristaService;

@Order(2)
@Component
public class TuristaTeste implements ApplicationRunner {

	@Autowired
	private TuristaService turistaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE TURISTAS ========");

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Turista t1 = new Turista();

		t1.setNome("Vinícius Pereira Reis Barbosa");
		t1.setEmail("vinicius.barbosa@email.com");
		t1.setPossuiPassaporte(true);
		t1.setDataNascimento(LocalDate.now());
		t1.setUsuario(usuario);
		
		turistaService.incluir(t1);
		System.out.println(t1.toString());
		
		Turista t2 = new Turista();

		t2.setNome("Bernard Pereira dos Reis Barbosa");
		t2.setEmail("bernard.barbosa@email.com");
		t2.setPossuiPassaporte(false);
		t2.setDataNascimento(LocalDate.now());
		t2.setUsuario(usuario);
		
		turistaService.incluir(t2);
		System.out.println(t2.toString());
		
		Turista t3 = new Turista();

		t3.setNome("Marina Garcia de Vechi");
		t3.setEmail("marina.vechi@email.com");
		t3.setPossuiPassaporte(true);
		t3.setDataNascimento(LocalDate.now());
		t3.setUsuario(usuario);
		
		turistaService.incluir(t3);
		System.out.println(t3.toString());
		
		System.out.println("\n");
	}

}