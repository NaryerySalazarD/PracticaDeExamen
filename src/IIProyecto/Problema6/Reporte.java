/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema6;

import javax.swing.JOptionPane;

/**
 *
 * @author gigabyte
 */
public class Reporte {
    boolean modoGUI;
    public void imprimirReporte(){
        String mensaje="Mensaje prueba";
        if (modoGUI){
            JOptionPane.showMessageDialog(null, mensaje);
        }
        else{
            System.out.println(mensaje);
        }
    }
}
