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
    private float monedaOrigen;
    private double monedaDestino;
    private float unidades;
    private final float tasa1 = 500;//1 dolar son 500 colones
    private final double tasa2 = 1.53;//1 euro son 1.53 dólares
    Scanner entrada = new Scanner(System.in);

    public Dolar() {

    }

    public Dolar(String moneda, float monedaOrigen, double monedaDestino, float unidades) {
        this.moneda = moneda;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.unidades = unidades;
    }

    //Convierte de dólares a colones
    public void ConvertorDolar_colon() {
        monedaDestino = unidades * tasa1;
    }

    //Convierte de dólares a euros
    public void ConvertorDolar_euro() {
        monedaDestino = unidades / tasa2;
    }

    //Introduce el valor de la moneda de origen
    public void ValorMonedaOrigen() {
        System.out.println("Introduzca la cantidad de unidades de su moneda:");
        unidades = entrada.nextFloat();

    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public float getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(float monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public double getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(double monedaDestino) {
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
