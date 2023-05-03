import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class TransformarTest {

    private final List<Integer> CONJUNTO = Arrays.asList(1,2,3,4,5);

    @Test
    void multiplica5 (){
        Transformar ej2 = new Transformar();

        Function<Integer, Integer> foo = n -> n*5;

        List<Integer> res = ej2.transformar(CONJUNTO,foo);

        assertThat(res).containsExactly(5,10,15,20,25);
    }

    @Test
    void suma1 (){
        Transformar ej2 = new Transformar();

        List<Integer> res = ej2.transformar(CONJUNTO,n -> n + 1);

        assertThat(res).containsExactly(2,3,4,5,6);
    }
  
    @Test
    void transfysuma(){
       Transformar reto2 = new Transformar();

       Integer real = reto2.transformarYSumar(CONJUNTO, s -> 1);

       assertThat(real).isEqualTo(CONJUNTO.size());
    }

    @Test
    void filtransfysuma() {
        Transformar reto3 = new Transformar();

        List<Integer> conj = Arrays.asList(1, 4, -6, 7, 3, 5, -1);

        Integer expected = -189;

        Assertions.assertThat(reto3.filtransfysuma(conj, v -> v % 3 == 0, i -> i * i * i)).isEqualTo(expected);
    }
  
}
