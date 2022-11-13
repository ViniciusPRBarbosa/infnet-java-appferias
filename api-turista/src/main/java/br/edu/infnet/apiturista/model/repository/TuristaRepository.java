package br.edu.infnet.apiturista.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiturista.model.domain.Turista;

@Repository
public interface TuristaRepository extends CrudRepository<Turista, Integer>{
	
	@Query("from Turista t where t.usuario.id = :userid")
	List<Turista> obterLista(Integer userid);
}