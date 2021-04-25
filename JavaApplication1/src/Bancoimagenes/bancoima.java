/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bancoimagenes;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Lopez
 */
public class bancoima {
   int tipo;
   ArrayList<imga> banco = new ArrayList<imga>();

    public ArrayList<imga> getBanco() {
        return banco;
    }

    public void setBanco(ArrayList<imga> banco) {
        this.banco = banco;
    }
       
       
    public void arrayima(){
       
        for (int i = 1; i < 10; i++) {
            tipo=1;
            String url = "/Bancoimagenes/"+i+".png";     
             imga s1=new imga(tipo,url);  
             banco.add(s1);
        }// carril numero 1 y el carril numeo 3 se usaran las mismas imagenes porque simulan de abajo hacia arriba
        
        for (int i = 11; i < 26; i++) {
            tipo=2;
            String url = "/Bancoimagenes/"+i+".png";     
             imga s1=new imga(tipo,url);  
             banco.add(s1);
        }
        for (int i = 26; i < 33; i++) {
            tipo=4;
            System.out.println("la i es : "+i);
            String url = "/Bancoimagenes/"+i+".png";     
             imga s1=new imga(tipo,url);  
             banco.add(s1);
        }
    }
    
    public  void mostra(int carril){
        Iterator it = banco.iterator();
          while(it.hasNext()){  
          imga st=(imga)it.next();  
          if(carril==st.getTipo()){
              System.out.println("el carril es: "+st.getTipo());
          }
  }  
    
    }
            
}
