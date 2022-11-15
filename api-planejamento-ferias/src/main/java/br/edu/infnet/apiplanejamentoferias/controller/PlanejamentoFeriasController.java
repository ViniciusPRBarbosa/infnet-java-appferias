package br.edu.infnet.apiplanejamentoferias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.infnet.apiplanejamentoferias.model.domain.PlanejamentoFerias;
import br.edu.infnet.apiplanejamentoferias.model.services.PlanejamentoFeriasService;

@RestController
@RequestMapping("/api/planejamento")
public class PlanejamentoFeriasController {
	
	@Autowired
	private PlanejamentoFeriasService planejamentoFeriasService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody PlanejamentoFerias planejamentoFerias) {
		planejamentoFeriasService.incluir(planejamentoFerias);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		planejamentoFeriasService.excluir(id);
	}
	
	@GetMapping(value = "/usuario/{id}/listar")
	public List<PlanejamentoFerias> obterLista(@PathVariable Integer id){
		return planejamentoFeriasService.obterLista(id);
	}
	
	@GetMapping(value = "/listar")
	public List<PlanejamentoFerias> obterLista(){
		return planejamentoFeriasService.obterLista();
	}
}
