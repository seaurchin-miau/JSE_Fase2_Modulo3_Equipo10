package Reto1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertirTest {

    @Test
    @DisplayName("Convierte enteros")
    void string() {
        Integer integer = 5242;
        String expected = "5242";

        Convertir<Integer> integerConverter = new Convertir<>();

        assertEquals(expected, integerConverter.convierte(integer));
    }

    @Test
    @DisplayName("Convierte un Boolean")
    void booleano() {
        Boolean aBoolean = Boolean.TRUE;
        String expected = "true";

        Convertir<Boolean> integerConverter = new Convertir<>();

        assertEquals(expected, integerConverter.convierte(aBoolean));
    }
}