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

    static void obtenerGananciasFranquicia(Stream<Integer> ids){
        LocalTime inicio = LocalTime.now();
        double suma = ids.mapToDouble(id -> new SistemaMedicion().leer(id))
                .sum();
        Duration tiempo = Duration.between(inicio, LocalTime.now());
        System.out.println(Math.round(suma)+ "en" +tiempo.toMillis()+"ms");
    }

    public static void main (String [] args){
        List<Integer> ids = IntStream.range(0,1000)
                .boxed()
                .collect(Collectors.toList());

        obtenerGananciasFranquicia(ids.parallelStream());     }
    }
