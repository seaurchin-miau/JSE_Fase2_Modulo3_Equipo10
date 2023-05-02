static void obtenerPromedio (Stream<Integer> ids){
        LocalTime inicio = LocalTime.now();
        double promedio = ids.mapToDouble(id -> new SistemaMedicion().leer(id))
                .average()
                .orElse(0);
        Duration tiempo = Duration.between(inicio, LocalTime.now());
        System.out.println(Math.round(promedio)+ "en" +tiempo.toMillis()+"ms");
    }
    public static void main (String [] args){
        List<Integer> ids = IntStream.range(1,11)
                .boxed()
                .collect(Collectors.toList());

        obtenerPromedio(ids.stream()); //secuencial porque va uno por uno
        obtenerPromedio(ids.parallelStream()); //paralelo todo al mismo tiempo y no se puede usar si son procesos dependientes
    }
}
