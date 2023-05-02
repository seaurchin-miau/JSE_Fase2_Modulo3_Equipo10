package Ejemplo1;

import Generator.RxJavaObservableGenerator;
import io.reactivex.Single;

public class ObservaSingle {


    static Integer sumar(){
            return RxJavaObservableGenerator
                    .observableStream()
                    .reduce(0,(a,b)-> a+b)
                    .blockingGet();
}

    public static void main (String[] args){

        Single<Integer> si = ObservaSingle.sumarSingle();
        Integer i = ObservaSingle.sumar();

        System.out.println("Single:" +si.blockingGet());
        System.out.println("Integer :" +i);


    }
}
