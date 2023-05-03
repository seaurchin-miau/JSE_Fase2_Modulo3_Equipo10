package Ejemplo3;

import java.util.concurrent.TimeUnit;

public class MainDeLoop {
    public static void main(String[] args) {
        EventLoopSimple eventLoop = new EventLoopSimple(evento ->{
            if (evento instanceof String){
                System.out.println("String:" + evento);
            }
            else if(evento instanceof Number){
                System.out.println("Número: "+ evento);
            }
          
            else {
              System.out.println("Objeto (volador xD) no identificado");
            }
        });

        eventLoop.iniciar();
        eventLoop.registraEvento("Holii Mundo");

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e){}

        eventLoop.registraEvento(5);
        eventLoop.registraEvento("Hasta la próxima");
        eventLoop.registraEvento(1000);

        eventLoop.detener();
    }
}
