import java.util.function.Function;

public class Transformar {
  
  Integer transformarYSumar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
    Integer acumulador = 0;

    for(Integer v: conjunto){
        acumulador += funcion.apply(v);
    }

    return acumulador;
    }
}
