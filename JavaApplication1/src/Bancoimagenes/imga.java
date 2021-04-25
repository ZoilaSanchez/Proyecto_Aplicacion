/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bancoimagenes;

import java.awt.Image;
import javax.swing.Icon;

/**
 *
 * @author Lopez
 */
public class imga {
     int tipo;
     String imge ;

    imga(int tipo, String imge) {
        this.tipo = tipo;
        this.imge = imge;
    }

     
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getImg() {
        return imge;
    }

    public void setImg(String imge) {
        this.imge = imge;
    }
}
