/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema2;

import java.util.Scanner;

/**
 *
 * @author Naryery TERMINADO
 */
public class Tester {

    public static void main(String[] args) {

        //CONFIGURAR MONEDAS
        Moneda mColon = new Moneda("colon", 1);
        Moneda mGen1 = new Moneda();
        Moneda mGen2 = new Moneda();
        //INICIA 
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Digite sus otras dos monedas");
            mGen1.setNombre(s.next());
            mGen2.setNombre(s.next());
            System.out.println("Digite el valor de la tasa en su moneda de origen");
             System.out.println("Moneda 1");
            mGen1.setValorColon(s.nextFloat());
             System.out.println("Moneda 2");
            mGen2.setValorColon(s.nextFloat());
            mGen1 = new Moneda(mGen1.getNombre(), mGen1.getValorColon());
            mGen2 = new Moneda(mGen2.getNombre(), mGen2.getValorColon());
            MaqConvertidora maq = new MaqConvertidora(mColon, mGen1, mGen2);
            System.out.println("Digite la moneda de origen 1=Colon 2=" + mGen1.getNombre() + "3=" + mGen2.getNombre());
            int numMonedaOrigen = s.nextInt();
            System.out.println("Digite la moneda de salida 1=Colon 2=" + mGen1.getNombre() + "3=" + mGen2.getNombre());
            int numMonedaSalida = s.nextInt();
            System.out.println("Digite la cantidad");
            int cantidad = s.nextInt();

            if (numMonedaOrigen == 1) {
                if (numMonedaSalida == 1) {
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mColon, cantidad));
                } else if (numMonedaSalida == 2) { //Moneda genérica 1
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mGen1, cantidad));
                } else { //Moneda genérica 2
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mGen2, cantidad));
                }
            } else if (numMonedaOrigen == 2) {//Moneda genérica 1
                if (numMonedaSalida == 1) {
                    System.out.println("El valor equivalente es: " + maq.convertir(mGen1, mColon, cantidad));
                } else if (numMonedaSalida == 2) { //Moneda genérica 1
                    System.out.println("El valor equivalente es: " + maq.convertir(mGen1, mGen1, cantidad));
                } else { //Moneda genérica 2
                    System.out.println("El valor equivalente es: " + maq.convertir(mGen1, mGen2, cantidad));
                }
            } else { //Moneda genérica 2
                if (numMonedaSalida == 1) {
                    System.out.println("El valor equivalente es: " + maq.convertir(mGen2, mColon, cantidad));
                } else if (numMonedaSalida == 2) { //Moneda genérica 1
                    System.out.println("El valor equivalente es: " + maq.convertir(mGen2, mGen1, cantidad));
                } else { //Moneda genérica 2
                    System.out.println("El valor equivalente es: " + maq.convertir(mGen2, mGen2, cantidad));
                }

            }
        }
    }
}
