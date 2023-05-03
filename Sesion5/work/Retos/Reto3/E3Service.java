package org.bedu.jse2.ejemplo3;

import reactor.core.publisher.Flux;

public class E3Service {
    private static final E3Repo REPOSITORY = new E3Repo();

    public Flux<String> getListaNombre(){
        return null;
    }

    public Mono <Agenda> buscarPorNom (String nombre){
      return REPOSITORY.getPersonas()
        .filter (s-> filterFunction (s->nombre))
        .map (this::personToAgenda)
        .next();
    }
   
   private Boolean filterFunction(PersonaEntity s, String nombre) {
   return s.getNombre().contains(nombre) || s.getPrimerApellido().contains(nombre) || s.getSegundoApellido().contains(nombre);
   }

   private Agenda personToAgenda(PersonaEntity s) {
   return new Agenda(String.format("%s %s %s", s.getNombre(), s.getPrimerApellido(), s.getSegundoApellido()), s.getTelefono());
   }

}
