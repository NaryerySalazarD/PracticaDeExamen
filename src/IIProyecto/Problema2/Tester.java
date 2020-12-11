/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema2;

import java.util.Scanner;

/**
 *
 * @author Naryery
 */
public class Tester {

    public static void main(String[] args) {

        //CONFIGURAR MONEDAS
        Moneda mColon = new Moneda("Colon", 1);
        Moneda mGen1 = new Moneda("",0);
        Moneda mGen2 = new Moneda("",0);

        //INICIA 
        Scanner s = new Scanner(System.in);
        
        

        while (true) {
            System.out.println("Digite sus otras dos monedas");
            mGen1.setNombre(s.next());
            mGen2.setNombre(s.next());
            System.out.println("Digite el valor de la tasa de las ambas monedas");
            mGen1.setValorColon(s.nextFloat());
            mGen2.setValorColon(s.nextFloat());
            MaqConvertidora maq = new MaqConvertidora(mColon, mGen1, mGen2);
            System.out.println("Digite la moneda de origen 1=Colon 2="+mGen1.getNombre()+"3="+mGen2.getNombre());
            int numMonedaOrigen = s.nextInt();
            System.out.println("Digite la moneda de salida 1=Colon 2="+mGen1.getNombre()+"3="+mGen2.getNombre());
            int numMonedaSalida = s.nextInt();
            System.out.println("Digite la cantidad");
            int cantidad = s.nextInt();
         
            

            if(numMonedaOrigen==1){
                if(numMonedaSalida==1){
                    System.out.println("El valor equivalente es: "+maq.convertir(mColon, mColon, cantidad));
                }
                else if(numMonedaSalida==2){ //Moneda genérica 1
                    System.out.println("El valor equivalente es: "+maq.convertir(mColon, mGen1, cantidad)); 
                }
                else { //Moneda genérica 2
                    System.out.println("El valor equivalente es: "+maq.convertir(mColon, mGen2, cantidad)); 
                }
            }
            else if(numMonedaOrigen==2){//Dolar

            }
            else{ //Euro

            
        }
    }
}
}
