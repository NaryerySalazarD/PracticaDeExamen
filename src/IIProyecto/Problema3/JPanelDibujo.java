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
        for(int i=0;i< numFigOval;i++) {
            Ovalo o = new Ovalo();
            o.setPosX((int)(Math.random() * 100));
            o.setPosY((int) (Math.random() * 500));
            o.setAncho((int)(Math.random() * 600));
            o.setAlto((int) (Math.random() * 400));
            //OVALOS          
            g.setColor(Color.yellow);
            g.fillOval(o.getPosX(), o.getPosY(), o.getAncho(), o.getAlto()); //dibuja un ovalo con fondo amarillo
            
        }
       
         for(int i=0;i< numFigRec;i++) {
            Rectangulo r = new Rectangulo();
            r.setPosX((int)(Math.random() * 200));
            r.setPosY((int)(Math.random() * 300));
            r.setAncho((int)(Math.random() * 400));
            r.setAlto((int)(Math.random() * 500));

            //RECTANGULOS
            g.setColor(Color.blue);
            g.fillRect(r.getPosX(), r.getPosY(), r.getAncho(), r.getAlto());
            g.setColor(Color.black);
           
        }

    }
}
