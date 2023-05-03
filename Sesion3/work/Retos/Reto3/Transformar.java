import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Transformar {
  
  Integer filtrarTransformarYSumar(List<Integer> conjunto, Predicate<Integer> filtro, IntUnaryOperator funcion) {
    return conjunto.stream().filter(filtro).mapToInt(s -> s).map(funcion).sum();
}
