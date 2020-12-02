/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema1;

import java.util.Scanner;

/**
 *
 * @author NaryerySD
 */
public class Dolar {
    String moneda;
    double tasa=1.53;//1 euro equivale a 1.53 dólares.
    private float monedaOrigen;
    private float monedaDestino;
    private float unidades;
     Scanner entrada = new Scanner(System.in);
     
     public Dolar(){
         
     }
     
       public void conversor() {
        monedaDestino = (float) (monedaOrigen * tasa);
        System.out.println(monedaDestino);

    }
        public void valorMonedaOrigen() {
        System.out.println("Introduzca la cantidad de unidades de su moneda de origen:");
        unidades = entrada.nextFloat();
        System.out.println(unidades + " dólares.");

    }
      

    public Dolar(String moneda, float monedaOrigen, float monedaDestino, float unidades) {
        this.moneda = moneda;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Dolar{" + "moneda=" + moneda + ", tasa=" + tasa + ", monedaOrigen=" + monedaOrigen + ", monedaDestino=" + monedaDestino + ", unidades=" + unidades + ", entrada=" + entrada + '}';
    }
    

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public float getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(float monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public float getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(float monedaDestino) {
        this.monedaDestino = monedaDestino;
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
