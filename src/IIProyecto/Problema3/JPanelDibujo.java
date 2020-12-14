package IIProyecto.Problema3;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Panel para dibujar
 */
public class JPanelDibujo extends JPanel {

    /* 
   * Constructor del panel para dibujar
     */
    public JPanelDibujo() {
        this.setBackground(Color.GREEN);
    }

    // Reimplementa paint
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int numFigOval = (int)(Math.random() * 10+1);
       int numFigRec = (int) (Math.random() * 10+1);
        while ( numFigOval!=0) {
            Ovalo o = new Ovalo();
            o.setPosX((int)(Math.random() * 200));
            o.setPosY((int) (Math.random() * 200));
            o.setAncho((int)(Math.random() * 200));
            o.setAlto((int) (Math.random() * 200));
            //OVALOS          
            g.setColor(Color.yellow);
            g.fillOval(o.getPosX(), o.getPosY(), o.getAncho(), o.getAlto()); //dibuja un ovalo con fondo amarillo
             break;
        }
       
         while ( numFigRec!=0) {
            Rectangulo r = new Rectangulo();
            r.setPosX((int)(Math.random() * 200));
            r.setPosY((int)(Math.random() * 200));
            r.setAncho((int)(Math.random() * 200));
            r.setAlto((int)(Math.random() * 200));

            //RECTANGULOS
            g.setColor(Color.blue);
            g.fillRect(r.getPosX(), r.getPosY(), r.getAncho(), r.getAlto());
            g.setColor(Color.black);
            break;
        }

    }
}
