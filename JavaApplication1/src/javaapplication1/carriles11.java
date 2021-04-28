package javaapplication1;

import java.util.Stack;
import java.util.concurrent.Semaphore;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lopez
 */
public class carriles11 {

    static Semaphore semaforo = new Semaphore(1);
    static class mihilo extends Thread {
        String nombre = "";
        int numero;
        JLabel x;
        mihilo(String nombre, int numero, JLabel x) {
            this.nombre = nombre;
            this.numero = numero;
            this.x = x;
        }
        public void run() {
            try {
                int t=200;
                System.out.println(nombre + " : sipermitodss"+ numero);
                semaforo.acquire();// Entra a la región crítica
                try {
                    if(numero==0){
                        for (int i = 0; i < 35; i++) {
                        int xx = x.getX() + i;
                        int yy = x.getY();
                        x.setLocation(xx, yy);
                        x.setVisible(true);
                        Thread.sleep(t);
                    }
                    }else if(numero==1){
                        for (int i = 0; i < 35; i++) {
                                int xx = x.getX() -i;
                                int yy = x.getY();
                                x.setLocation(xx, yy);
                                x.setVisible(true);
                                Thread.sleep(t);
                    }
                    }
                    else if(numero==2){
                           for (int i = 0; i < 30; i++) {
                                int yy = x.getY() +i;
                                int xx = x.getX();
                                x.setLocation(xx, yy);
                                x.setVisible(true);
                                Thread.sleep(t);
                            }
                    }else if(numero==3){
                        for (int i = 0; i < 30; i++) {
                                int yy = x.getY()-i;
                                int xx = x.getX();
                                x.setLocation(xx, yy);
                                x.setVisible(true);
                                Thread.sleep(t);
                    }
                    }
                } finally {
                    System.out.println(nombre + " : dejar para otro");
                    semaforo.release();// Sale de la región crítica
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

