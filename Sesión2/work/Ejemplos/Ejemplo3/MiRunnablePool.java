package src.main.java;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MiRunnablePool implements Runnable{

    private String nombre;

    public  MiRunnablePool (String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run (){
        try {
            while (true) {
                System.out.println(nombre + "ejecutándose");
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e ) {
            Thread.currentThread().interrupt();
            System.out.println( nombre + "fue interrumpido");
        }
}

public static void main (String[] args) {
    ExecutorService pool = Executors.newCachedThreadPool();

    String[] nombres = {"uno", "dos", "tres", "cuatro"};
    for (String nombre : nombres) {
        pool.execute(new MiRunnablePool(nombre));
    }
    pool.shutdown();

    try {
        long tiempomax = 100;
        boolean isTerminado = pool.awaitTermination(tiempomax, TimeUnit.MILLISECONDS);
    if (!isTerminado){
        List<Runnable> pendientes = pool.shutdownNow();
        isTerminado = pool.awaitTermination(tiempomax, TimeUnit.MILLISECONDS);
            if (!isTerminado) {
                System.out.println( "no han terminado");
            }
        System.out.println( "Han terminado");
    }
} catch (InterruptedException e){
        e.printStackTrace();
}}}

