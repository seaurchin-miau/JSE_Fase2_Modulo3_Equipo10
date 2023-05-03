public class Sumas {

    static Single<Integer> reto1(){
         return RxJavaObservableGenerator
            .observableStream()
            .map( v -> v*v*v)
            .filter(v -> v > 50)
            .reduce(0, Integer::sum);
    }
    

    public static void main (String[] args){

        Single<Integer> si = Sumas.sumarSingle();
        Integer i = Sumas.sumar();

        System.out.println("Single:" +si.blockingGet());
        System.out.println("Integer :" +i);


    }
}

