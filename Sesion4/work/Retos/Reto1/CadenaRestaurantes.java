package Reto1;
import Ejemplo1.SistemaMedicion;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CadenaRestaurantes {

    private Random rnd = new Random();

        public double obtenerGananciasFranquicia(int id){
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return rnd.nextInt(40000) + 10000;
  }
