/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema2;

/**
 *
 * @author gigabyte
 */
public class Moneda {
      String nombre;
      float valorColon;
      public Moneda(){
          
      }

    public Moneda(String nombre, float valorColon) {
        this.nombre = nombre;
        this.valorColon = valorColon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorColon() {
        return valorColon;
    }

    public void setValorColon(float valorColon) {
        this.valorColon = valorColon;
    }
  
}
