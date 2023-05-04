package Reto2;

import Ejemplo2.EchoClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reto2Test {

    @Test
    void echoString(){
        Integer input = 222;
        assertEquals("222", Reto2.echoString(input));
    }

}