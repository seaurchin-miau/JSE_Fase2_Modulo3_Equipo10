package org.bedu.jse2.ejemplo3;

import reactor.core.publisher.Flux;

public class E3Service {
    private static final E3Repo REPOSITORY = new E3Repo();

    public Flux<String> getListaNombre(){
        return REPOSITORY
                .getPersonas()
                .map(this::formatea);
    }

    public String formatea (PersonaEntity persona){
        return String.format("%s %s, %s",
                persona.getPrimerApellido(),
                persona.getSegundoApellido(),
                persona.getNombre());
    }

}
