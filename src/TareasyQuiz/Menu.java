/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareasyQuiz;

import java.util.Scanner;

/**
 *
 * @author Naryery
 */
public class Menu {
  
    int menu;
    int opcion;
    Scanner entrada = new Scanner(System.in);
    public Menu(){
        
    }
    public Menu(int menu, int opcion) {
        this.menu = menu;
        this.opcion = opcion;
    }
    
    public void opcionesMenu() {
        System.out.println("1.Agregar información del alumno.");
        System.out.println("2.Ver información del examen del alumno.");
        System.out.println("3.Mostrar las notas registradas.");

        System.out.println("Ingrese la opción que desea: ");

    }

    public void ingresarOpcion() {
        opcion = entrada.nextInt();
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

}


