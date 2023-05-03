    private static void obtenerSuma(Stream<Integer> ids) {
    LocalTime inicio = LocalTime.now(); 
    double suma = ids.mapToDouble(id -> new CadenaRestaurantes()
                    .obtenerGananciasFranquicia(id))
            .sum();
    System.out.printf("Ganancias totales: $%5.2f%n", suma);
    Duration tiempo = Duration.between(inicio, LocalTime.now());    
    System.out.println((Math.round(suma * 100.) / 100.) + " en " + tiempo.toMillis() + "ms"); 

    public static void main (String [] args){
        List<Integer> ids = IntStream.range(0, 1000)
            .boxed()
            .collect(Collectors.toList());
        obtenerSuma(ids.parallelStream());
    }
}

