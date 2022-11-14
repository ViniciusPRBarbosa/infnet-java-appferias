package br.edu.infnet.apiplano.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiplano.model.domain.Passeio;

@Repository
public interface PasseioRepository extends CrudRepository<Passeio, Integer>{
	
	@Query("from Passeio p where p.usuario.id = :userid")
	List<Passeio> obterLista(Integer userid);
}
