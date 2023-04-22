public class MiHilo extends Thread {

    String parametro;
    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public MiHilo(String parametro){
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
        String tipoHilo = isDaemon() ? "daemon" : "usuario";
        System.out.println(tipoHilo + "\t| Nombre: " + getName() + "\t| ID: " + getId() + "\t| Parametro: " + parametro);
    }

    public static void pausarUnSegundo() {
       try{ TimeUnit.SECONDS.sleep(1);
       } catch (InterruptedException)
           e.printStackTrace();
    }
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo("Uno");
        hilo1.start();

        MiHilo hilo2 = new MiHilo("Dos");
        hilo2.setDaemon(true);
        hilo2.start();

        MiHilo.pausarUnSegundo();
        hilo1.setParametro("terminar"); // Demostrar qué pasa si no se pone esta línea
        System.out.println("**Fin del hilo main**");
    }
}