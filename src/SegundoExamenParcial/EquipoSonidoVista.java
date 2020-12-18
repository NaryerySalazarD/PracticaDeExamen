/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoExamenParcial;

import java.util.Scanner;

/**
 *
 * @author gigabyte
 */
public class EquipoSonidoVista {

    int cont;
    int maxAudios = 1000;
    String[] listaAudios = new String[maxAudios];
    Scanner entrada = new Scanner(System.in);
    EquipoSonido parlante;

    public EquipoSonidoVista(EquipoSonido elijaParlante) {
        this.parlante = elijaParlante;
    }

    public void ListaReproduccion() {
        for (int i = 0; i < 1000; i++) {
            listaAudios[i] = "";
        }
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" + "listaAudios=" + listaAudios + '}';
    }

    public void aleatorio() {

    }

    public void orden() {

    }

    public void mostrarLista() {
        for (int i = 0; i < cont; i++) {
            if (listaAudios[i] != null) {
                System.out.println(listaAudios[i]);
            }
        }

    }

    public boolean agregarAudio(String audio) {
        boolean resultado = false;
        if (cont < maxAudios) {
            listaAudios[cont] = audio;
            cont++;
            resultado = true;
        }
        return resultado;
    }

    public boolean eliminarAudio() {
        boolean resultado = false;
        if (cont != 0) {
            listaAudios[cont - 1] = null;
            cont--;
            resultado = true;
        }
        return resultado;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

}
