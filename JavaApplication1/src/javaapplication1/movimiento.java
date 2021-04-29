package javaapplication1;

import java.util.Stack;
import java.util.concurrent.Semaphore;
import javax.swing.Icon;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ferna
 */
public class movimiento {

    private int posicion;//este indica en que carril se empieza.
    private static Semaphore mutex = new Semaphore(1, true);
    JLabel jLabelA1,jLabelA2,jLabelA3,jLabelA4,jLabelB1,jLabelB2,jLabelB3,jLabelB4,
            jLabelC1,jLabelC2,jLabelC3,jLabelC4,jLabelD1,jLabelD2,jLabelD3,jLabelD4;
    JFrame frame;

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    Hilo carril1 = new Hilo(0);//aqui declaramos los carriles que iremos a utilizar
    Hilo carril2 = new Hilo(1);
    Hilo carril3 = new Hilo(2);
    Hilo carril4 = new Hilo(3);
    private int tiempo = 3600;//El tiempo de los semaforos

    public movimiento() {
        posicion = 0;//empezamos en el primer carril
        carril1.start();
        carril2.start();
        carril3.start();
        carril4.start();
    }

    public JLabel getjLabelA1() {
        return jLabelA1;
    }

    public void setjLabelA1(JLabel jLabelA1) {
        this.jLabelA1 = jLabelA1;
    }

    public JLabel getjLabelA2() {
        return jLabelA2;
    }

    public void setjLabelA2(JLabel jLabelA2) {
        this.jLabelA2 = jLabelA2;
    }

    public JLabel getjLabelA3() {
        return jLabelA3;
    }

    public void setjLabelA3(JLabel jLabelA3) {
        this.jLabelA3 = jLabelA3;
    }

    public JLabel getjLabelA4() {
        return jLabelA4;
    }

    public void setjLabelA4(JLabel jLabelA4) {
        this.jLabelA4 = jLabelA4;
    }

    public JLabel getjLabelB1() {
        return jLabelB1;
    }

    public void setjLabelB1(JLabel jLabelB1) {
        this.jLabelB1 = jLabelB1;
    }

    public JLabel getjLabelB2() {
        return jLabelB2;
    }

    public void setjLabelB2(JLabel jLabelB2) {
        this.jLabelB2 = jLabelB2;
    }

    public JLabel getjLabelB3() {
        return jLabelB3;
    }

    public void setjLabelB3(JLabel jLabelB3) {
        this.jLabelB3 = jLabelB3;
    }

    public JLabel getjLabelB4() {
        return jLabelB4;
    }

    public void setjLabelB4(JLabel jLabelB4) {
        this.jLabelB4 = jLabelB4;
    }

    public JLabel getjLabelC1() {
        return jLabelC1;
    }

    public void setjLabelC1(JLabel jLabelC1) {
        this.jLabelC1 = jLabelC1;
    }

    public JLabel getjLabelC2() {
        return jLabelC2;
    }

    public void setjLabelC2(JLabel jLabelC2) {
        this.jLabelC2 = jLabelC2;
    }

    public JLabel getjLabelC3() {
        return jLabelC3;
    }

    public void setjLabelC3(JLabel jLabelC3) {
        this.jLabelC3 = jLabelC3;
    }

    public JLabel getjLabelC4() {
        return jLabelC4;
    }

    public void setjLabelC4(JLabel jLabelC4) {
        this.jLabelC4 = jLabelC4;
    }

    public JLabel getjLabelD1() {
        return jLabelD1;
    }

    public void setjLabelD1(JLabel jLabelD1) {
        this.jLabelD1 = jLabelD1;
    }

    public JLabel getjLabelD2() {
        return jLabelD2;
    }

    public void setjLabelD2(JLabel jLabelD2) {
        this.jLabelD2 = jLabelD2;
    }

    public JLabel getjLabelD3() {
        return jLabelD3;
    }

    public void setjLabelD3(JLabel jLabelD3) {
        this.jLabelD3 = jLabelD3;
    }

    public JLabel getjLabelD4() {
        return jLabelD4;
    }

    public void setjLabelD4(JLabel jLabelD4) {
        this.jLabelD4 = jLabelD4;
    }
     
    
    public void cambiarCarril() throws InterruptedException {
        if (posicion == 0) {//aqui aplicamos el algoritmo circular
            posicion = 1;
            carril1.setUsando(true);
            try {
                //mutex.acquire();//entrando a la region critica  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril1.setUsando(false);
            //mutex.release();//saliendo de la region critica
        } else if (posicion == 1) {
            posicion = 2;
            carril2.setUsando(true);
            try {
                //   mutex.acquire();  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril2.setUsando(false);
            //mutex.release();
        } else if (posicion == 2) {
            posicion = 3;
            carril3.setUsando(true);
            try {
                // mutex.acquire();  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril3.setUsando(false);
            //mutex.release();
        } else if (posicion == 3) {
            posicion = 0;
            carril4.setUsando(true);
            try {
                //  mutex.acquire();  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril4.setUsando(false);
            //mutex.release();
        }
    }

    
      public void carrilesposiciones(int posi) throws InterruptedException {
        if (posi == 0) {//aqui aplicamos el algoritmo circular
            carril1.setUsando(true);
            try {
                //mutex.acquire();//entrando a la region critica  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril1.setUsando(false);
            //mutex.release();//saliendo de la region critica
        } else if (posi == 1) {
          
            carril2.setUsando(true);
            try {
                //   mutex.acquire();  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril2.setUsando(false);
            //mutex.release();
        } else if (posi == 2) {
            
            carril3.setUsando(true);
            try {
                // mutex.acquire();  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
            } catch (InterruptedException e) {
            }
            carril3.setUsando(false);
            //mutex.release();
        } else if (posi == 3) {
            
            carril4.setUsando(true);
            try {
                //  mutex.acquire();  
                Thread.sleep(2500);//Tiempo habilitado el semaforo
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
                       
                        if (nombre == 0) {
                            //jLabel1.setIcon(icono1);
                            for (int i = 0; i < 34; i++) {
                                int x = jLabelA1.getX() +i;
                                int y = jLabelA1.getY();
                                jLabelA1.setLocation(x, y);
                                jLabelA1.setVisible(true);
                                //System.out.println(" si entra al for");
                                Thread.sleep(800);
                            }

                        } else if (nombre == 1) {
                            //jLabel2.setIcon(icono2);
                             for (int i = 0; i < 31; i++) {
                                int x = jLabelB1.getX() -i;
                                int y = jLabelB1.getY();
                                jLabelB1.setLocation(x, y);
                                jLabelB1.setVisible(true);
                                //System.out.println(" si entra al for");
                                Thread.sleep(800);
                            }
                        } else if (nombre == 2) {
                             for (int i = 0; i < 23; i++) {
                                int y = jLabelC1.getY() -i;
                                int x = jLabelC1.getX();
                                jLabelC1.setLocation(x, y);
                                jLabelC1.setVisible(true);
                                //System.out.println(" si entra al for");
                                Thread.sleep(800);
                            }
                            //jLabel3.setIcon(icono3);
                        } else if (nombre == 3) {
                            //jLabel4.setIcon(icono4);
                            for (int i = 0; i < 18; i++) {
                                int y = jLabelD1.getY() +i;
                                int x = jLabelD1.getX();
                                jLabelD1.setLocation(x, y);
                                jLabelD1.setVisible(true);
                                //System.out.println(" si entra al for");
                                Thread.sleep(800);
                            }
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
