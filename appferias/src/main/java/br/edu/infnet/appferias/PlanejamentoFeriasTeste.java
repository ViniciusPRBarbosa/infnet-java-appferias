package br.edu.infnet.appferias;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appferias.model.domain.Evento;
import br.edu.infnet.appferias.model.domain.Passeio;
import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;
import br.edu.infnet.appferias.model.domain.Plano;
import br.edu.infnet.appferias.model.domain.Turista;
import br.edu.infnet.appferias.model.domain.Visita;
import br.edu.infnet.appferias.model.service.PlanejamentoFeriasService;
import br.edu.infnet.appferias.model.service.PlanoService;
import br.edu.infnet.appferias.model.service.TuristaService;

@Order(7)
@Component
public class PlanejamentoFeriasTeste implements ApplicationRunner {

	@Autowired
	private PlanejamentoFeriasService planejamentoFeriasService;
	
	@Autowired
	private TuristaService turistaService;
	
	@Autowired
	private PlanoService planoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("======== TESTANDO IMPRESSÃO DE PLANEJAMENTOS DE FÉRIAS ========");

		PlanejamentoFerias p1 = new PlanejamentoFerias();
		
		Passeio pa1 = new Passeio();
		
		pa1.setTitulo("Primeiro dia em Londres");
		pa1.setObjetivo("Conhecer a cidade");
		pa1.setDataExecucao("2022-03-03");
		pa1.setEmGrupo(false);
		pa1.setLocalOrigem("Apartamento de amigo");
		pa1.setLocalDestino("Piccadilly Circus");
		pa1.setPossuiPontosDeParada(true);
		
		pa1.setPontosDeParada(new ArrayList<String>());
		pa1.getPontosDeParada().add("Big Ben");
		pa1.getPontosDeParada().add("Palacio de Buckingham");
		pa1.getPontosDeParada().add("London Eye");

		Visita v1 = new Visita();
		
		v1.setTitulo("Visita a Keukenhof");
		v1.setObjetivo("Conhecer o parque das tulipas");
		v1.setDataExecucao("2022-03-15");
		v1.setEmGrupo(false);
		v1.setEndereco("Lisse, Netherlands");
		v1.setEhPontoTuristico(true);
		
		v1.setPontosDeInteresse(new ArrayList<String>());
		v1.getPontosDeInteresse().add("Tirar fotos");
		v1.getPontosDeInteresse().add("Provar achocolatado e croissants");
		v1.getPontosDeInteresse().add("Entrar em labirintos");
		
		Evento e1 = new Evento();
		
		e1.setTitulo("Pontos turísticos de Londres - London Eye");
		e1.setObjetivo("Tirar fotos");
		e1.setDataExecucao("2022-03-04");
		e1.setEmGrupo(true);
		e1.setDescricao("Volta do London Eye");
		e1.setEndereco("Riverside Building, County Hall, Londres");
		e1.setEhPago(true);
		e1.setCustoIngresso(450);
		
		List<Plano> planosDoPrimeiroPlanejamento = new ArrayList<Plano>();
		
		planosDoPrimeiroPlanejamento.add(e1);
		planosDoPrimeiroPlanejamento.add(v1);
		planosDoPrimeiroPlanejamento.add(pa1);
		
		for (Plano plano : planosDoPrimeiroPlanejamento) {
			planoService.incluir(plano);
		}
		
		List<Plano> planosDoSegundoPlanejamento = new ArrayList<Plano>();
		
		planosDoSegundoPlanejamento.add(pa1);
		planosDoSegundoPlanejamento.add(e1);
		
		for (Plano plano : planosDoSegundoPlanejamento) {
			planoService.incluir(plano);
		}
		
		List<Plano> planosDoTerceiroPlanejamento = new ArrayList<Plano>();
		
		Turista t1 = new Turista();
		
		t1.setNome("Vinícius Pereira Reis Barbosa");
		t1.setEmail("vinicius.barbosa@emailteste.com");
		t1.setPossuiPassaporte(true);
		t1.setDataNascimento("1990-04-30");
		
		turistaService.incluir(t1);

		p1.setTitulo("Primeira viagem para a Europa");
		p1.setDescricao("Viagem para a Europa, com visita a parentes e a locais turisticos.");
		p1.setDataInicio(LocalDateTime.of(2022, Month.MAY, 1, 8, 0, 0));
		p1.setDataFim(LocalDateTime.of(2022, Month.MAY, 30, 23, 59, 0));
		p1.setTurista(t1);		
		p1.setPlanos(planosDoPrimeiroPlanejamento);
		
		planejamentoFeriasService.incluir(p1);
		System.out.println(p1.toString());
		
		Turista t2 = new Turista();

		t2.setNome("Bernard Pereira dos Reis Barbosa");
		t2.setEmail("bernard.barbosa@emailteste.com");
		t2.setPossuiPassaporte(false);
		t2.setDataNascimento("1996-12-23");
		
		turistaService.incluir(t2);
		
		PlanejamentoFerias p2 = new PlanejamentoFerias(t2);
		
		p2.setTitulo("Primeira viagem para a Asia");
		p2.setDescricao("Viagem para ao Japão, com visita a locais turisticos.");
		p2.setDataInicio(LocalDateTime.of(2022, Month.AUGUST, 1, 8, 0, 0));
		p2.setDataFim(LocalDateTime.of(2022, Month.AUGUST, 30, 23, 59, 0));
		
		p2.setPlanos(planosDoSegundoPlanejamento);
		
		planejamentoFeriasService.incluir(p2);
		System.out.println(p2.toString());
		
		PlanejamentoFerias p3 = new PlanejamentoFerias();

		Turista t3 = new Turista();

		t3.setNome("Marina Garcia de Vechi");
		t3.setEmail("marina.vechi@emailteste.com");
		t3.setPossuiPassaporte(true);
		t3.setDataNascimento("1991-03-01");
		
		turistaService.incluir(t3);
		
		p3.setDescricao("Viagem para cidade natal, para visita a parentes e a locais de infância.");
		p3.setDataFim(LocalDateTime.of(2022, Month.DECEMBER, 27, 23, 59, 0));
		p3.setTurista(t3);
		
		p3.setPlanos(planosDoTerceiroPlanejamento);
		
		planejamentoFeriasService.incluir(p3);
		System.out.println(p3.toString());
		
		System.out.println("\n");
	}
}
