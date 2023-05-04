package Reto3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Reto3Test {

    @Test
    @DisplayName("Problemáticos")
    void reto2(){
        List<? extends Number> numberList;

        List<Integer> integerList = List.of(1,2,3);

        numberList = integerList;

        assertNotNull(numberList);
    }

}