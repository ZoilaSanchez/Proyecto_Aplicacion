/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jenif
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        jLabel10.setVisible(false);
        jLabel16.setVisible(false);
        jLabel3.setVisible(false);
        jLabel12.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel18.setVisible(false);
        jLabel11.setVisible(false);
        jLabel7.setVisible(false);
        jLabel15.setVisible(false);
        jLabel14.setVisible(false);
        jLabel13.setVisible(false);
    }

    public void transparenciButton() {
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jlbRojo3 = new javax.swing.JLabel();
        jlbRojo2 = new javax.swing.JLabel();
        jlbRojo4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlbRojo1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida (2).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 40, 40));

        jlbRojo3.setBackground(new java.awt.Color(255, 51, 51));
        jlbRojo3.setOpaque(true);
        getContentPane().add(jlbRojo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 10, 50));

        jlbRojo2.setBackground(new java.awt.Color(255, 51, 51));
        jlbRojo2.setOpaque(true);
        getContentPane().add(jlbRojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 10, 50));

        jlbRojo4.setBackground(new java.awt.Color(255, 51, 51));
        jlbRojo4.setOpaque(true);
        getContentPane().add(jlbRojo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 10, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/semafito.png"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, 80));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/semafito.png"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, 80));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cesped.png"))); // NOI18N
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/semafito.png"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coche.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/34.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 50, 90));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/33.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/18.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/27.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/30.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/16.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro-deportivo (2).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coche (2).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coche (1).png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -30, 70, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/47.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro-deportivo.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, 130, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/problema.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-encendido.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 70, 60));

        jlbRojo1.setBackground(new java.awt.Color(255, 51, 51));
        jlbRojo1.setOpaque(true);
        getContentPane().add(jlbRojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 10, 40));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/semafito.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, 80));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancoimagenes/cebra3.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 216, 390, 270));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carril2.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 180, 270));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carril.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 510, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carril.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 500, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carril2.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 180, 290));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/colinas (2).png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 260, 220));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paisaje-urbano.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 240));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificio-de-la-ciudad.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 300, 250));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/colinas (2).png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 270, 220));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/parque (2).png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 140, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pradera2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 270, 200));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 90, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pradera2.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 250, 200));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pradera3.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 250, 250));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pueblo.png"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, 240));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificio-de-la-ciudad.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 280, 240));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reiniciar (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 60, 40));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            jLabel7.setVisible(true);
            jLabel11.setVisible(true);
            jLabel18.setVisible(true);
            jLabel9.setVisible(true);
            jLabel12.setVisible(true);
            jLabel8.setVisible(true);
            jLabel16.setVisible(true);
            jLabel10.setVisible(true);
            jLabel3.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jLabel15.setVisible(true);
            movimiento Carriles = new movimiento();
            Carriles.setFrame(this);
            Carriles.setjLabelB1(jLabel7);
            Carriles.setjLabelA1(jLabel3);
            Carriles.setjLabelC1(jLabel13);
            Carriles.setjLabelD1(jLabel9);
            Carriles.cambiarCarril();//cada vez que lo hagamos va a cambiar el carril habilitado
            Carriles.cambiarCarril();
            Carriles.cambiarCarril();
            Carriles.cambiarCarril();
            Carriles.cambiarCarril();

//String name,int numero,JLabel x
            carriles11.mihilo mi1 = new carriles11.mihilo("0", 0, jLabel3, jLabel10, jLabel16);
            mi1.start();

            carriles11.mihilo mi3 = new carriles11.mihilo("2", 2, jLabel9, jLabel12, jLabel8);
            mi3.start();

            carriles11.mihilo mi2 = new carriles11.mihilo("1", 1, jLabel7, jLabel11, jLabel18);
            mi2.start();
            carriles11.mihilo mi4 = new carriles11.mihilo("3", 3, jLabel13, jLabel14, jLabel15);
            mi4.start();

        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jlbRojo1.setBackground(Color.green);
        jlbRojo2.setBackground(Color.green);
        jlbRojo3.setBackground(Color.green);
        jlbRojo4.setBackground(Color.green);
        
        try {

            jLabel7.setVisible(true);
            jLabel3.setVisible(true);
            jLabel9.setVisible(true);
            jLabel13.setVisible(true);
            carriles Carriles = new carriles();
            Carriles.setFrame(this);
            Carriles.setjLabelB1(jLabel7);
            Carriles.setjLabelA1(jLabel3);
            Carriles.setjLabelC1(jLabel13);
            Carriles.setjLabelD1(jLabel9);
            Carriles.cambiarCarril();//cada vez que lo hagamos va a cambiar el carril habilitado
            Carriles.cambiarCarril();
            Carriles.cambiarCarril();
            Carriles.cambiarCarril();
            Carriles.cambiarCarril();
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          Interfaz inter = new Interfaz();
        inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });

        class Util {
//            static void sleep(long millis) throws InterruptedException;

            {
                long millis;
//                Thread.sleep(millis);
            }
        }

        class Compartido {

            synchronized void test1(Compartido s2) throws InterruptedException {
                System.out.println("test1-begin");
//                Util.sleep(1000);

                s2.test2();
                System.out.println("test1-end");
            }

            synchronized void test2() throws InterruptedException {
                System.out.println("test2-begin");
//                Util.sleep(1000);
                System.out.println("test2-end");
            }

            private void test2(Object s1) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }

        class Thread1 extends Thread {

            private Compartido s1;
            private Compartido s2;

            public Thread1(Compartido s1, Compartido s2) {
                this.s1 = s1;
                this.s2 = s2;
            }

            @Override
            public void run() {
                try {
                    s1.test1(s2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        class Thread2 extends Thread {

            private Compartido s1;
            private Compartido s2;

            public Thread2(Compartido s1, Compartido s2) {
                this.s1 = s1;
                this.s2 = s2;
            }

            @Override
            public void run() {
                s2.test2(s1);
            }
        }

//    public class Interbloqueo {
//        public static void main(String[] args) {
//            Compartido s1 = new Compartido();
//
//            Compartido s2 = new Compartido();
//
//            Thread1 t1 = new Thread1(s1, s2);
//            t1.start();
//
//            Thread2 t2 = new Thread2(s1, s2);
//            t2.start();
//
//            Util.sleep(2000);
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jlbRojo1;
    public static javax.swing.JLabel jlbRojo2;
    public static javax.swing.JLabel jlbRojo3;
    public static javax.swing.JLabel jlbRojo4;
    // End of variables declaration//GEN-END:variables
}
