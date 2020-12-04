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

    private final float tasaDolar = 500;//1 dolar equivale a 500 colones.
    private final float tasaEuro = 765;//1 euro equivale a 765 colones.
    private float monedaOrigen;
    private float monedaDestino;
    private float unidades;

    Scanner entrada = new Scanner(System.in);

    public Colon() {

    }

    public Colon(float monedaOrigen, float monedaDestino, float unidades) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.unidades = unidades;
    }

    public void ConvertorColon_Dolar() {
        monedaDestino = unidades / tasaDolar;
    }

    public void ConvertorColon_Euro() {
        monedaDestino = unidades / tasaEuro;
    }

    public void ValorMonedaOrigen() {
        System.out.println("Introduzca la cantidad de unidades de su moneda:");
        unidades = entrada.nextFloat();
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
