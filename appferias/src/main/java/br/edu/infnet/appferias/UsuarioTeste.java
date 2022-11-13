package br.edu.infnet.appferias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE USUÁRIOS ========");

		Usuario u1 = new Usuario();

		u1.setNome("Usuário 1");
		u1.setEmail("usuario1@email.com");
		u1.setSenha("123456");

		usuarioService.incluir(u1);
		System.out.println(u1.toString());
		
		Usuario u2 = new Usuario();

		u2.setNome("Usuário 2");
		u2.setEmail("usuario2@email.com");
		u2.setSenha("123456");

		usuarioService.incluir(u2);
		System.out.println(u2.toString());
		
		Usuario u3 = new Usuario();

		u3.setNome("Usuário 3");
		u3.setEmail("usuario3@email.com");
		u3.setSenha("123456");

		usuarioService.incluir(u3);
		System.out.println(u3.toString());
		
		System.out.println("\n");
	}

}