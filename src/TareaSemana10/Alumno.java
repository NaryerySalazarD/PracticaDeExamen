/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaSemana10;

/**
 *
 * @author gigabyte
 */
public class Alumno {
    String nombre;
    String apellido;
    int carne;
    
    public Alumno(){
    }

    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }
    
    
    public void mostrardatos(){
        System.out.println("El nombre del alumno es:"+nombre+", El apellido del alumno es:"+apellido+". El carne del alumno es:"+ carne);
    }
    
    //metodos gets y sets

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

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }
    
}

