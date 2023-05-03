package org.bedu.jse2.ejemplo3;

import reactor.core.publisher.Flux;

public class E3Controller {
    private static final E3Service SERVICE = new E3Service();

    public Flux<String> nombresUsuarios() {
        return SERVICE.getListaNombre();
    }
    
    public Mono <Agenda> buscaPorNom (String nombre){
      return SERVICE.buscarPorNom(nombre);
    }
  
}
