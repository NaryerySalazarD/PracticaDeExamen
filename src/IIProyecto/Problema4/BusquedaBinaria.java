/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema4;

/**
 *
 * @author NaryerySD
 */
public class BusquedaBinaria {

    int mitad;
    int primerDato;
    int ultimoDato;
    int valorMitad;

    public BusquedaBinaria() {

    }

    //Implementa la búsqueda binaria 
    public int BusquedaBinaria(int array_numeros[], int numBuscado) {

        primerDato = 0;
        ultimoDato = array_numeros.length - 1;
        while (primerDato <= ultimoDato) {
            mitad = (primerDato + ultimoDato) / 2;
            valorMitad = array_numeros[mitad];
            System.out.println("Comparo a " + numBuscado + " ,con " + array_numeros[mitad]);
            if (numBuscado == valorMitad) {
                return mitad;
            } else if (numBuscado < valorMitad) {
                ultimoDato = mitad - 1;
            } else {
                primerDato = mitad + 1;
            }
        }
        return -1;
    }

    //Imprime el arreglo
    public void imprimirArreglo(int array_numeros[]) {
        int numero = array_numeros.length;
        for (int i = 0; i < numero; ++i) {
            System.out.print(array_numeros[i] + " ");
        }
        System.out.println();
    }

    public BusquedaBinaria(int mitad, int primerDato, int ultimoDato, int valorMitad) {
        this.mitad = mitad;
        this.primerDato = primerDato;
        this.ultimoDato = ultimoDato;
        this.valorMitad = valorMitad;
    }

    public int getMitad() {
        return mitad;
    }

    public void setMitad(int mitad) {
        this.mitad = mitad;
    }

    public int getPrimerDato() {
        return primerDato;
    }

    public void setPrimerDato(int primerDato) {
        this.primerDato = primerDato;
    }

    public int getUltimoDato() {
        return ultimoDato;
    }

    public void setUltimoDato(int ultimoDato) {
        this.ultimoDato = ultimoDato;
    }

    public int getValorMitad() {
        return valorMitad;
    }

    public void setValorMitad(int valorMitad) {
        this.valorMitad = valorMitad;
    }

}
