/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareasyQuiz;

/**
 *
 * @author gigabyte
 */
public class PadreFamiliar {
    String nombrePadre;
    String apellidoPadre;
    String nombreMadre;
    String apellidoMadre;
   
    
    public PadreFamiliar(){
    
}

    public PadreFamiliar(String nombrePadre, String apellidoPadre, String nombreMadre, String apellidoMadre) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.nombreMadre = nombreMadre;
        this.apellidoMadre = apellidoMadre;
    }
   
    @Override
    public String toString() {
        return "PadreFamiliar{" + "nombrePadre=" + nombrePadre + ", apellidoPadre=" + apellidoPadre + ", nombreMadre=" + nombreMadre + ", apellidoMadre=" + apellidoMadre + '}';
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }
    
    
    
    
}
