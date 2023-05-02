package Generator;

import io.reactivex.Observable;
import reactor.core.publisher.Flux;

public class ReactorFluxGenerator {

    private static final Integer [] LISTA = {1,2,3,4,5,6};

    static public Flux<Integer> fluxStream(){
        return Flux.fromArray(LISTA);
    }
}
