package org.bedu.javase2.ejemplo2.repositories;

import org.bedu.javase2.ejemplo2.models.Equipo;
import org.springframework.data.repository.CrudRepository;

public interface EquipoRepo extends CrudRepository<Equipo, Long> {
  Iterable<Equipo> findAllbyName (String nombre);
}
