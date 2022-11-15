package br.edu.infnet.apiplano.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiplano.model.domain.Visita;

@Repository
public interface VisitaRepository extends CrudRepository<Visita, Integer>{
	
	@Query("from Visita v where v.usuario.id = :userid")
	List<Visita> obterLista(Integer userid);
}
