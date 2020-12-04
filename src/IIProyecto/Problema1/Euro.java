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

    String moneda;

    private double monedaDestino;
    private float unidades;
    private final double tasa2 = 1.53;//1 euro son 1.53 dólares
    private float tasa3 = 765;//1 euro son 765 colones
    Scanner entrada = new Scanner(System.in);

    public Euro() {

    }

    public Euro(String moneda, double monedaDestino, float unidades) {
        this.moneda = moneda;
        this.monedaDestino = monedaDestino;
        this.unidades = unidades;
    }

    public String Moneda() {
        System.out.println("¿Cuál es su moneda de origen?");
        moneda = entrada.next();
        return moneda;
    }

    public void ConvertorEuro_Dolar() {
        monedaDestino = unidades * tasa2;
    }

    public void ConvertorEuro_colon() {
        monedaDestino = unidades * tasa3;
    }

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

    public float getTasa3() {
        return tasa3;
    }

    public void setTasa3(float tasa3) {
        this.tasa3 = tasa3;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

}
