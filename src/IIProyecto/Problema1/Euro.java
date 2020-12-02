/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema1;

import java.util.Scanner;

/**
 *
 * @author gigabyte
 */
public class Euro {

    float unidades;
     Scanner entrada = new Scanner(System.in);

    public Euro() {

    }
     public void valorMonedaOrigen() {
        System.out.println("Introduzca la cantidad de unidades de su moneda de origen:");
        unidades = entrada.nextFloat();
        System.out.println(unidades + " euros.");

    }

    @Override
    public String toString() {
        return "Euro{" + "unidades=" + unidades + ", entrada=" + entrada + '}';
    }
     
    public Euro(float unidades) {
        this.unidades = unidades;
    }

    public float getUnidades() {
        return unidades;
    }

    public void setUnidades(float unidades) {
        this.unidades = unidades;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
     

    

}
