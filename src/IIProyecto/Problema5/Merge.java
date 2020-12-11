/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema5;

/**
 *
 * @author Naryery
 */
public class Merge {

    public void ordenar(int array_numeros[], int izquierda, int derecha) {
        if (izquierda < derecha) {

            int mitad = (izquierda + derecha) / 2;
            ordenar(array_numeros, izquierda, mitad);
            ordenar(array_numeros, mitad + 1, derecha);
            unir(array_numeros, izquierda, mitad, derecha);
        }

    }

    public void unir(int array_numeros[], int izquierda, int mitad, int derecha) {
        int n1 = mitad - izquierda + 1;
        int n2 = derecha - mitad;
        int izquierdaArray[] = new int[n1];
        int derechaArray[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            izquierdaArray[i] = array_numeros[izquierda + i];
        }
        for (int p = 0; p < n2; p++) {
            derechaArray[p] = array_numeros[mitad + p + 1];
        }
        int i = 0, p= 0;
        int iz = izquierda;
        while (i < n1 && p < n2) {
            if (izquierdaArray[i] <= derechaArray[p]) {
                array_numeros[iz] = izquierdaArray[i];
                i++;
            } else {
                array_numeros[iz] = derechaArray[p];
                p++;
            }
            iz++;
        }
        while (i < n1) {
            array_numeros[iz] = izquierdaArray[i];
            i++;
            iz++;
        }
        while (p < n2) {
            array_numeros[iz] = derechaArray[p];
            p++;
            iz++;
        }
    }

    public void imprimirArreglo(int array_numeros[]) {
        int numero = array_numeros.length;
        for (int i = 0; i < numero; ++i) {
            System.out.print(array_numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Merge fucionOrdenada = new Merge();
        int[] primerArray = {8, 97, 4, 26, 5};
        int[] segundoArray = {4, 16, 1, 2, 22};
        int array_numeros[] = new int[primerArray.length + segundoArray.length];
        int count = 0;

        for (int i = 0; i < primerArray.length; i++) {
            array_numeros[i] = primerArray[i];
            count++;
        }
        for (int j = 0; j < segundoArray.length; j++) {
            array_numeros[count++] = segundoArray[j];
        }

        int n = array_numeros.length;

        System.out.println("Array original:");
        for (int valor : array_numeros) {
            System.out.print(valor + " ");
        }

        System.out.println();

        System.out.println("Array ordenado e intercalado:");
        fucionOrdenada.ordenar(array_numeros, 0, n - 1);
        fucionOrdenada.imprimirArreglo(array_numeros);
    }
}
