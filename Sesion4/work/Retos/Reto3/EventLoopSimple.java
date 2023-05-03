package Ejemplo3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class EventLoopSimple implements Runnable{
    private boolean enEjecucion = false;
    private Queue<Object> listaTareas = new LinkedList<>();
    private  final EventHandler worker;
    private static double acumulador;

    public EventLoopSimple(EventHandler worker){
        this.worker = worker;
    }

    @Override
    public void run() {
       try {
           while (enEjecucion || !listaTareas.isEmpty()){
               Object evento = listaTareas.poll();

               if ( evento == null) {
                   System.out.println("No hay eventos pendientes");
                   TimeUnit.SECONDS.sleep(1);
               }
             
             else if(evento instanceof Number) {
                  acumulador += ((Number) evento).doubleValue();
                  System.out.println("Acumulado: " + acumulador);
                }
             
               worker.procesaEvento(evento);
               TimeUnit.MILLISECONDS.sleep(100);
           }
       } catch (InterruptedException e) {
           enEjecucion = false;
           e.printStackTrace();
       }
    }

    public void iniciar(){
        acumulador = 0;
        this.enEjecucion = true;
        new Thread(this).start();
    }

    public void detener(){
        this.enEjecucion = false;
    }

    public void registraEvento(Object evento){
        listaTareas.add(evento);
    }

    public boolean isEnEjecucion(){
        return enEjecucion;
    }
}
