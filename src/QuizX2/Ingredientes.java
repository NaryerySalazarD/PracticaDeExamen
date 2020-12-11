/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizX2;

/**
 *
 * @author gigabyte
 */
public class Ingredientes {
    String nombre;
    int cod;
    String descrip;
    int precio;
    public Ingredientes(){
        
    }
    public Ingredientes(String nombre, int cod, String descrip, int precio) {
        this.nombre = nombre;
        this.cod = cod;
        this.descrip = descrip;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
