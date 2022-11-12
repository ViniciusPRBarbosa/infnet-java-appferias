package br.edu.infnet.appferias.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appferias.model.domain.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Integer>{

}
