public class Cubo {
    static Mono<Integer> sumarMono (){
        return ReactorFluxGenerator
                .fluxStream()
                .flatMap(v -> Mono.just(v*v*v))
                .filter(v -> v < 50)
                .reduce(0, Integer::sum);
    }

    public static void main (String[] args){

        Mono<Integer> mi = Cubo.sumarMono();
        Integer i = Cubo.sumar();

        System.out.println("Mono:" +mi.block());
        System.out.println("Integer :" +i);
}
 
