package br.edu.infnet.appferias.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appferias.model.domain.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Integer>{

	@Query("from Evento e where e.usuario.id = :userid")
	List<Evento> obterLista(Integer userid);
	
}
