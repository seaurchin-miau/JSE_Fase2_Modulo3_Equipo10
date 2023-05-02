import java.util.List;
import java.util.function.IntUnaryOperator;

public class Lambda {

    Integer manipular(List<Integer> conjunto, IntUnaryOperator trans){
        return conjunto.stream().mapToInt(s -> s).map(trans).sum();
    }
}
