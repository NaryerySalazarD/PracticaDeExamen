/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Naryery TERMINADO
 */
public class Tester {

    public static void main(String[] args) {
        BusquedaBinaria x = new BusquedaBinaria();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del arreglo:");
        int n = entrada.nextInt();
        int[] array_numeros = new int[n];

        for (int i = 0; i < array_numeros.length; i++) {
            System.out.println("Introduzca el número:");
            array_numeros[i] = entrada.nextInt();
        }
        System.out.println("Arreglo desordenado:");
        x.imprimirArreglo(array_numeros);
        Arrays.sort(array_numeros);
        while (true) {
            System.out.println("Arreglo ordenado:");
            x.imprimirArreglo(array_numeros);
            System.out.println("Introduzca el número buscado:");
            int numBuscado = entrada.nextInt();
            int opcion = x.BusquedaBinaria(array_numeros, numBuscado);
            if (opcion != -1) {
                System.out.println("Elemento encontrado.");
            } else if(opcion == -1) {
                System.out.println("Elemento no encontrado.");
            }

        }
    }

}
