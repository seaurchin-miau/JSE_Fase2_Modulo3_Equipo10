public class Convertir {

    private final StringtoInt parser = s-> Integer.parseInt(s);

    Integer sumar(String a, String b){
        return parser.convertir(a) + parser.convertir(b);
    }
}
