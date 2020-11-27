/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaSemana10y11;

/**
 *
 * @author gigabyte
 */
public class PadreFamiliar {
    String nombre;
    String apellido;
    boolean encargado;
    
    public PadreFamiliar(){
    
}

    public PadreFamiliar(String nombre, String apellido, boolean encargado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.encargado = encargado;
    }
    public void datosPadre(){
        System.out.println(nombre+apellido+encargado);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEncargado() {
        return encargado;
    }

    public void setEncargado(boolean encargado) {
        this.encargado = encargado;
    }
    
    
}
