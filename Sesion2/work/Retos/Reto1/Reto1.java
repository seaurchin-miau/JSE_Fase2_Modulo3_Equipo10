package src.main.java;

import java.util.concurrent.TimeUnit;

public class MiHilo1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hilo1: " + i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MiHilo2 extends Thread {
	@Override
	public void run() {
		while(true){
			System.out.println("Hilo2: Sigo en ejecución...");
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public static void main (String [] args) {
        Thread t1 = new Thread(new MiHilo1());
        Thread t2 = new Thread(new MiHilo2());
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
