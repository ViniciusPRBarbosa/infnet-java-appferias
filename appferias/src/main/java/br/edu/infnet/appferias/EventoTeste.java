package br.edu.infnet.appferias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.service.EventoService;

@Order(6)
@Component
public class EventoTeste implements ApplicationRunner {

	@Autowired
	private EventoService eventoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("======== TESTANDO IMPRESSÃO DE EVENTOS ========");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Evento e1 = new Evento();
		
		e1.setTitulo("Primeiro dia em Londres");
		e1.setObjetivo("Conhecer a cidade");
		e1.setDataExecucao("2022-03-03");
		e1.setEmGrupo(false);
		e1.setDescricao("Troca da guarda da Rainha");
		e1.setEndereco("Palacio de Buckingham");
		e1.setEhPago(false);
		e1.setUsuario(usuario);
		
		eventoService.incluir(e1);
		System.out.println(e1.toString());
		
		Evento e2 = new Evento();
		
		e2.setTitulo("Terceiro dia em Londres");
		e2.setObjetivo("Assistir filme no cinema");
		e2.setDataExecucao("2022-03-04");
		e2.setEmGrupo(false);
		e2.setDescricao("Assistir a Dr Estranho no Multiverso da Loucura");
		e2.setEndereco("Riverside Building, County Hall, Londres");
		e2.setEhPago(true);
		e2.setCustoIngresso(10);
		e2.setUsuario(usuario);
		
		eventoService.incluir(e2);
		System.out.println(e2.toString());
		
		Evento e3 = new Evento();
		
		e3.setTitulo("Primeiro show na Europa");
		e3.setObjetivo("Ir a um show da banda preferida");
		e3.setDataExecucao("2022-03-08");
		e3.setEmGrupo(true);
		e3.setDescricao("Show do Metallica");
		e3.setEndereco("Twickenham Stadium, Londres");
		e3.setEhPago(true);
		e3.setCustoIngresso(15);
		e3.setUsuario(usuario);
		
		eventoService.incluir(e3);
		System.out.println(e3.toString());
		
		System.out.println("\n");
	}

}
