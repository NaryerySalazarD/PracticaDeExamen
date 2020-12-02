/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareasyQuiz;



/**
 *
 * @author Naryery
 */
public class Alumno {
    String nombre;
    String apellido;
    int carne;
    PadreFamiliar padre;
    PadreFamiliar madre;

    public PadreFamiliar getMadre() {
        return madre;
    }

    public void setMadre(PadreFamiliar madre) {
        this.madre = madre;
    }

    public Alumno(PadreFamiliar madre) {
        this.madre = madre;
    }
    

    public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }
    
    public Alumno(){
    }

    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }
    
    
   public void imprimirPadreFamiliar(){
        System.out.println(padre.getNombrePadre()+ " " + padre.getApellidoPadre());
        System.out.println(padre);
         System.out.println(madre.getNombreMadre() + " " + madre.getApellidoMadre());
        System.out.println(madre);
    }    

    public Alumno(String nombre, String apellido, int carne, PadreFamiliar padre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
        this.padre = padre;
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
       public PadreFamiliar getpadre() {
        return padre;
    }

    public void setPadreFamiliar (PadreFamiliar padre) {
        this.padre = padre;
    }
}

