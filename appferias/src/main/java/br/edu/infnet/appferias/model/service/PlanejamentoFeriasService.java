package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;
import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.repository.PlanejamentoFeriasRepository;

@Service
public class PlanejamentoFeriasService {

	@Autowired
	private PlanejamentoFeriasRepository planejamentoFeriasRepository;

	public void incluir(PlanejamentoFerias planejamentoFerias) {
		planejamentoFeriasRepository.save(planejamentoFerias);
	}

	public Collection<PlanejamentoFerias> obterLista(Usuario usuario) {
		return (Collection<PlanejamentoFerias>) planejamentoFeriasRepository.obterLista(usuario.getId());
	}

	public Collection<PlanejamentoFerias> obterLista() {
		return (Collection<PlanejamentoFerias>) planejamentoFeriasRepository.findAll();
	}

	public void excluir(Integer id) {
		planejamentoFeriasRepository.deleteById(id);
	}
}
