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
public class Moneda {

    private String monedaOrigen;
    private String monedaDestino;

    Scanner entrada = new Scanner(System.in);

    public String Moneda() {
        System.out.println("¿Cuál es su moneda de origen(colones,dolares,euros)?");
        monedaOrigen = entrada.next();
        return monedaOrigen;
    }

    public String MonedaDestino() {
        System.out.println("¿Cuál es su moneda destino(colones,dolares,euros)?");
        monedaDestino = entrada.next();
        return monedaDestino;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

}
