package Ejemplo2;
import Generator.ReactorFluxGenerator;

import io.reactivex.Single;
import reactor.core.publisher.Mono;

public class UsoMono {

    static Mono<Integer> sumarMono (){
        return ReactorFluxGenerator
                .fluxStream()
                .reduce(0,(a,b)-> a+b);
    }

    static Integer sumar(){
        return ReactorFluxGenerator
                .fluxStream()
                .reduce(0,(a,b)-> a+b)
                .block();
    }

    public static void main (String[] args){

        Mono<Integer> mi = UsoMono.sumarMono();
        Integer i = UsoMono.sumar();

        System.out.println("Mono:" +mi.block());
        System.out.println("Integer :" +i);


    }
}
