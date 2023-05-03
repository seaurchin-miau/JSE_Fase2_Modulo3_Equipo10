package Ejemplo2;
import Ejemplo1.SistemaMedicion;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
     static void obtenerPromedio (Stream<Integer> ids){
        LocalTime inicio = LocalTime.now();
        double promedio = ids.mapToDouble(id -> new SistemaMedicion().leer(id))
                .average()
                .orElse(0);
        Duration tiempo = Duration.between(inicio, LocalTime.now());
        System.out.println(Math.round(promedio)+ "en" +tiempo.toMillis()+"ms");
    }
    public static void main (String [] args){
        List<Integer> ids = IntStream.range(1,101)
                .mapToObj(i->i)
                .collect(Collectors.toList());

        obtenerPromedio(ids.stream()); //secuencial porque va uno por uno

        List<CompletableFuture<Double>> futuros = ids.stream()
            .map(id -> CompletableFuture.supplyAsync(() -> new CadenaRestaurantes().obtenerGananciasFranquicia(id)))
            .collect(Collectors.toList());

        LocalTime inicio = LocalTime.now();
        double promedio = futuros.stream()
                .mapToDouble(cf->cf.join())
                .average()
                .orElse(0);

        Duration tiempo = Duration.between(inicio,LocalTime.now());
        System.out.println(Math.round(promedio));

    }
}
