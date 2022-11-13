package br.edu.infnet.appferias.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appferias.model.domain.Plano;

@Repository
public interface PlanoRepository extends CrudRepository<Plano, Integer>{

	@Query("from Plano p where p.usuario.id = :userid")
	List<Plano> obterLista(Integer userid);
}
