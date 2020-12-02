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
public class Tester {
     public static void main(String args[]) {
        Moneda origen=new Moneda();
        Moneda destino=new Moneda();
        Colon valorOrigen=new Colon();

        
        System.out.println("Seleccione su moneda de origen:");
        System.out.println("1.Mi moneda de origen son los colones.");
        System.out.println("2.Mi moneda de origen son los dólares.");
        System.out.println("3.Mi moneda de origen son los euros.");
         Scanner entrada = new Scanner(System.in);
        int menu=entrada.nextInt();
        switch(menu){
            case 1:
            
            valorOrigen.valorMonedaOrigen(); 
            break;
            case 2:
                Dolar valorOrigen1=new Dolar();
                valorOrigen1.valorMonedaOrigen();
                break;
            case 3:
                Euro valorOrigen2=new Euro();
                valorOrigen2.valorMonedaOrigen();
        }
         System.out.println("Seleccione su moneda de destino:");
        System.out.println("1.Mi moneda de destino son los colones.");
        System.out.println("2.Mi moneda de destino son los dólares.");
        System.out.println("3.Mi moneda de destino son los euros.");
      
        menu=entrada.nextInt();
        switch(menu){
            case 1:
            Colon monedaDestino=new Colon();
            monedaDestino.conversor();
            break;
            case 2:
                Dolar monedaDestino1=new Dolar();
                monedaDestino1.valorMonedaOrigen();
                break;
            case 3:
                Euro monedaDestino2=new Euro();
                monedaDestino2.valorMonedaOrigen();
        }
        System.out.println(valorOrigen);
        
        
       
           
         }
         
     }

