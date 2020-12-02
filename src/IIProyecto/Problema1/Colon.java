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
public class Colon {

    String moneda;
    private float tasa = 500;//1 dolar equivale a 500 colones.
    private float monedaOrigen;
    private float monedaDestino;
    private float unidades;
    Scanner entrada = new Scanner(System.in);

    public Colon() {

    }

    public Colon(String moneda, float tasa, float monedaOrigen, float monedaDestino) {
        this.moneda = moneda;
        this.tasa = tasa;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public void valorMonedaOrigen() {
        System.out.println("Introduzca la cantidad de unidades de su moneda de origen:");
        unidades = entrada.nextFloat();
        System.out.println(unidades + "colones.");

    }
     public void valorMonedaDestino() {
        System.out.println("Introduzca la cantidad de unidades de su moneda destino:");
        unidades = entrada.nextFloat();
        System.out.println(unidades + "colones.");

    }

    public void conversor() {
        monedaDestino = monedaOrigen * tasa;
        System.out.println(monedaDestino);

    }

    @Override
    public String toString() {
        return "Colon{" + "moneda=" + moneda + ", tasa=" + tasa + ", monedaOrigen=" + monedaOrigen + ", monedaDestino=" + monedaDestino + '}';
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Float getTasa() {
        return tasa;
    }

    public void setTasa(Float tasa) {
        this.tasa = tasa;
    }

}
