/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ferna
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        carriles Carriles = new carriles();
        Carriles.cambiarCarril();//cada vez que lo hagamos va a cambiar el carril habilitado
        Carriles.cambiarCarril();
        //Carriles.cambiarCarril();
        //Carriles.cambiarCarril();
        //Carriles.cambiarCarril();
    }   
}
