package br.edu.infnet.appferias.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appferias.model.domain.Turista;

@Repository
public interface TuristaRepository extends CrudRepository<Turista, Integer>{
	
	@Query("from Turista t where t.usuario.id = :userid")
	List<Turista> obterLista(Integer userid);
}
