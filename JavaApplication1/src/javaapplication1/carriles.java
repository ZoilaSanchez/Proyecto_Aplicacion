package javaapplication1;

import java.util.Stack;
import java.util.concurrent.Semaphore;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ferna
 */
public class carriles {

    private int posicion;//este indica en que carril se empieza.
    private static Semaphore mutex = new Semaphore(1, true);
    JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    Hilo carril1 = new Hilo(0);//aqui declaramos los carriles que iremos a utilizar
    Hilo carril2 = new Hilo(1);
    Hilo carril3 = new Hilo(2);
    Hilo carril4 = new Hilo(3);
    private int tiempo = 3600;//El tiempo de los semaforos

    public carriles() {
        posicion = 0;//empezamos en el primer carril
        carril1.start();
        carril2.start();
        carril3.start();
        carril4.start();
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void cambiarCarril() throws InterruptedException {
        if (posicion == 0) {//aqui aplicamos el algoritmo circular
            posicion = 1;
            carril1.setUsando(true);
            try {
                //mutex.acquire();//entrando a la region critica  
                Thread.sleep(3600);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril1.setUsando(false);
            //mutex.release();//saliendo de la region critica
        } else if (posicion == 1) {
            posicion = 2;
            carril2.setUsando(true);
            try {
                //   mutex.acquire();  
                Thread.sleep(3600);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril2.setUsando(false);
            //mutex.release();
        } else if (posicion == 2) {
            posicion = 3;
            carril3.setUsando(true);
            try {
                // mutex.acquire();  
                Thread.sleep(3600);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril3.setUsando(false);
            //mutex.release();
        } else if (posicion == 3) {
            posicion = 0;
            carril4.setUsando(true);
            try {
                //  mutex.acquire();  
                Thread.sleep(3600);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril4.setUsando(false);
            //mutex.release();
        }
    }

    public class Hilo extends Thread {

        private boolean usando;

        public void setUsando(boolean usando) {
            this.usando = usando;
        }
        private Stack<String> carros = new Stack();
        private int nombre;

        public Hilo(int nombre) {//sirve para ver que carril estamos modificando
            this.nombre = nombre;
            usando = false;
        }

        public void run() {
            Icon icono1, icono2, icono3, icono4;
            while (true) {//aqui iremos metiendo carros a los carriles
                if (usando == true) {

                    System.out.println("Carril usandose " + nombre);//aqui habilitamos el carril
                    try {//velocidad a la que se van los carros
                        mutex.acquire();
                        icono1 = new ImageIcon(getClass().getResource("/Bancoimagenes/12.png"));
                        icono2 = new ImageIcon(getClass().getResource("/Bancoimagenes/9.png"));
                        icono3 = new ImageIcon(getClass().getResource("/Bancoimagenes/24.png"));
                        icono4 = new ImageIcon(getClass().getResource("/Bancoimagenes/37.png"));
                        if (nombre == 0) {
                            jLabel1.setIcon(icono1);
                            Thread.sleep(1500);
                        } else if (nombre == 1) {
                            jLabel2.setIcon(icono2);
                            Thread.sleep(1500);
                        } else if (nombre == 2) {
                            jLabel3.setIcon(icono3);
                            Thread.sleep(1500);
                        } else if (nombre == 3) {
                            jLabel4.setIcon(icono4);
                            Thread.sleep(1500);
                        }
                        Thread.sleep(1500);
                        // System.out.println("carro llendose "+carros.pop());
                    } catch (InterruptedException e) {
                    }
                }
                try {
                    Thread.sleep(500);//velocidad a la que ingresan a la cola los carros
                    carros.add("carro"/*+carros.size()*/);
                } catch (InterruptedException e) {

                }
                mutex.release();

            }
        }
    }
}
