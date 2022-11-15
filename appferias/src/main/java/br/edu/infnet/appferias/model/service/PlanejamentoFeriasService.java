package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.IPlanejamentoFeriasClient;
import br.edu.infnet.appferias.model.domain.PlanejamentoFerias;
import br.edu.infnet.appferias.model.domain.Usuario;

@Service
public class PlanejamentoFeriasService {

	@Autowired
	private IPlanejamentoFeriasClient planejamentoFeriasClient;

	public void incluir(PlanejamentoFerias planejamentoFerias) {
		planejamentoFeriasClient.incluir(planejamentoFerias);
	}

	public Collection<PlanejamentoFerias> obterLista(Usuario usuario) {
		return (Collection<PlanejamentoFerias>) planejamentoFeriasClient.obterLista(usuario.getId());
	}

	public Collection<PlanejamentoFerias> obterLista() {
		return (Collection<PlanejamentoFerias>) planejamentoFeriasClient.obterLista();
	}

	public void excluir(Integer id) {
		planejamentoFeriasClient.excluir(id);
	}
}
