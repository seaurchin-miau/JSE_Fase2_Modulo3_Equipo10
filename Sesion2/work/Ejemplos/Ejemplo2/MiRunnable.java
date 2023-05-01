package src.main.java;

import java.util.concurrent.TimeUnit;

public class MiRunnable implements Runnable{

    private String parametro, nombre;
    public MiRunnable (String nombre) {
        this.nombre = nombre;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    @Override
    public void run () {
        while (! "terminar".equals(parametro)) {
            mostrarInformacion();
            pausarUnSegundo();
        }

        mostrarInformacion();
    }

    private void mostrarInformacion(){
        System.out.println( "Hilo: " + nombre + "\t| Parametro: " + parametro);
    }

    public static void pausarUnSegundo() {
        try{ TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}

    public static void main (String [] args) {
        MiRunnable run1 = new MiRunnable("uno");
        MiRunnable run2 = new MiRunnable("dos");

        Thread t1 = new Thread(run1 );
        t1.start();

        Thread t2 = new Thread(run2 );
        t2.setDaemon(true);

        MiRunnable.pausarUnSegundo();

    }
}
