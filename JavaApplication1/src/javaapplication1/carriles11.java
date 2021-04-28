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
        JLabel x, y, z;

        mihilo(String nombre, int numero, JLabel x, JLabel y, JLabel z) {
            this.nombre = nombre;
            this.numero = numero;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void run() {
            try {
                int t = 200;
                System.out.println(nombre + " : sipermitodss" + numero);
                semaforo.acquire();// Entra a la región crítica
                try {
                    if (numero == 0) {
                        for (int i = 0; i < 60; i++) {
                            int zx = z.getX() + i;
                            int zy = z.getY();
                            int yx = y.getX() + i-2;
                            int Yy = y.getY();
                            int xx = x.getX() + i;
                            int yy = x.getY();                       
                            
                            z.setLocation(zx, zy);
                            y.setLocation(yx, Yy);
                            x.setLocation(xx, yy);
                            z.setVisible(true);
                            y.setVisible(true);
                            x.setVisible(true);

                            Thread.sleep(t);
                        }
                    } else if (numero == 1) {

                        for (int i = 0; i < 60; i++) {
                            int xx = x.getX() - i;
                            int yy = x.getY();
                            int yx = y.getX() - i;
                            int Yy = y.getY();
                            int zx = z.getX() - i;
                            int zy = z.getY();
                            z.setLocation(zx, zy);
                            y.setLocation(yx, Yy);
                            x.setLocation(xx, yy);
                            z.setVisible(true);
                            y.setVisible(true);
                            x.setVisible(true);
                            Thread.sleep(t);
                        }

                    } else if (numero == 2) {

                        for (int i = 0; i < 40; i++) {
                            int xx = x.getX();
                            int yy = x.getY() + i;
                            int yx = y.getX();
                            int Yy = y.getY() + i;
                            int zx = z.getX();
                            int zy = z.getY() +2+ i;
                            z.setLocation(zx, zy);
                            y.setLocation(yx, Yy);
                            x.setLocation(xx, yy);
                            z.setVisible(true);
                            y.setVisible(true);
                            x.setVisible(true);
                            Thread.sleep(t);
                        }
                    } else if (numero == 3) {
                        for (int i = 0; i < 40; i++) {
                            int xx = x.getX();
                            int yy = x.getY() - 2-i;
                            int yx = y.getX();
                            int Yy = y.getY() - i;
                            int zx = z.getX();
                            int zy = z.getY() - i;
                            z.setLocation(zx, zy);
                            y.setLocation(yx, Yy);
                            x.setLocation(xx, yy);
                            z.setVisible(true);
                            y.setVisible(true);
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
