package Ejemplo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimiteTest {

    @Test
    void integer(){
        Limite<Integer> lim = new Limite<>();
        assertTrue(lim.esMayorQue(7, 2));
    }

    @Test
    void doble(){
        Limite<Double> lim = new Limite<>();
        assertTrue(lim.esMayorQue(7.7, 2.45));
    }

    @Test
    void num(){
        Limite<Number> lim = new Limite<>();
        assertTrue(lim.esMayorQue(7.5, 2));
    }

}