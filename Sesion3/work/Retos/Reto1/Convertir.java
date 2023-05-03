package org.bedu.jse2.sesion3;
import java.util.function.Function;
  
public class Convertir {

    private final Function<String,Integer> parser = Integer::parseInt;

    Integer sumar(String a, String b){
        return parser.capply(a) + parser.apply(b);
    }
}
