package br.edu.infnet.apiplanejamentoferias.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiplanejamentoferias.model.domain.PlanejamentoFerias;

@Repository
public interface PlanejamentoFeriasRepository extends CrudRepository<PlanejamentoFerias, Integer>{
	
	@Query("from PlanejamentoFerias p where p.usuario.id = :userid")
	List<PlanejamentoFerias> obterLista(Integer userid);
}
