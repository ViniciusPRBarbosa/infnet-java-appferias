package br.edu.infnet.apiplanejamentoferias.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiplanejamentoferias.model.domain.PlanejamentoFerias;
import br.edu.infnet.apiplanejamentoferias.model.repository.PlanejamentoFeriasRepository;

@Service
public class PlanejamentoFeriasService {

	@Autowired
	private PlanejamentoFeriasRepository planejamentoFeriasRepository;

	public void incluir(PlanejamentoFerias planejamentoFerias) {
		planejamentoFeriasRepository.save(planejamentoFerias);
	}

	public List<PlanejamentoFerias> obterLista(Integer id) {
		return planejamentoFeriasRepository.obterLista(id);
	}

	public List<PlanejamentoFerias> obterLista() {
		return (List<PlanejamentoFerias>) planejamentoFeriasRepository.findAll();
	}

	public void excluir(Integer id) {
		planejamentoFeriasRepository.deleteById(id);
	}
}
