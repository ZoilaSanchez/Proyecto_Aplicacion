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
    JLabel jLabel1;
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
     public JLabel getjLabel() {
        return jLabel1;
    }

    public void setjLabel(JLabel jLabel) {
        this.jLabel1 = jLabel;
    }
    
    public void cambiarCarril() throws InterruptedException{
        Icon icono1;
        if(posicion == 0){//aqui aplicamos el algoritmo circular
            posicion = 1;
            carril1.setUsando(true);
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/F1.jpg"));
                /*casino.*/jLabel1.setIcon(icono1);
            try {
                mutex.acquire();//entrando a la region critica  
                Thread.sleep(6000);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }          
            carril1.setUsando(false);
            mutex.release();//saliendo de la region critica
        }else if(posicion == 1){
            posicion = 2;
            carril2.setUsando(true);
            try {
                mutex.acquire();  
                Thread.sleep(6000);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }          
            carril2.setUsando(false);
            mutex.release();
        }else if(posicion == 2){
            posicion = 3;
            carril3.setUsando(true);
            try {
                mutex.acquire();  
                Thread.sleep(6000);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }          
            carril3.setUsando(false);
            mutex.release();
        }else{
            posicion = 0;
            carril3.setUsando(true);
            try {
                mutex.acquire();  
                Thread.sleep(6000);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }          
            carril3.setUsando(false);
            mutex.release();
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
        public void run(){
            while(true){//aqui iremos metiendo carros a los carriles
                if(usando == true){
                    System.out.println("Carril usandose " + nombre);//aqui habilitamos el carril
                    try {//velocidad a la que se van los carros
                        Thread.sleep(2500);
                       System.out.println("carro llendose "+carros.pop());
                    //  jLabel.setText(String.valueOf(carros.pop()));
                    } catch (InterruptedException e) {
                    }
                }
                try {
                    Thread.sleep(1500);//velocidad a la que ingresan a la cola los carros
                    carros.add("carro"+carros.size());
                    //jLabel.setText(String.valueOf(carros.size()));
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
