/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaSemana10y11;

import java.util.Scanner;

/**
 *
 * @author Naryery
 */
public class Tester {

    public static void main(String args[]) {
        Menu menu = new Menu();
        Menu opcion = new Menu();
        SistemaNotas sistema = new SistemaNotas();
        Scanner s = new Scanner(System.in);
        Alumno pad=new Alumno();
        

        while (true) {
            menu.opcionesMenu();
            opcion.ingresarOpcion();
            switch (opcion.opcion) {
                case 1:
                    
                    System.out.println("Digite el nombre del alumno:");
                    String x = s.next();
                    System.out.println("Digite el apellido del alumno:");
                    String y = s.next();
                    System.out.println("Digite el carne:");
                    int z = s.nextInt();
                   

                    Alumno alum = new Alumno(x, y, z);
                    System.out.println("Digite el nombre del alumno:");
                    String nombre = s.next();
                    System.out.println("Digite el apellido del alumno:");
                    String apellido = s.next();
                    System.out.println("Digite el carne:");
                    boolean encargado = s.hasNext();
                    PadreFamiliar padre=new PadreFamiliar(nombre,apellido,encargado);
                   
                    
                    pad.Alumno(padre);
                    System.out.println(padre);

                    System.out.println("Digite la nota obtenida:");
                    int nota = s.nextInt();
                    System.out.println("Digite puntos totales:");
                    int puntosTotales = s.nextInt();
                    System.out.println("Digite puntos obtenidos:");
                    int puntosObtenidos = s.nextInt();

                    Examen e = new Examen(alum, nota, puntosTotales,
                            puntosObtenidos, null);

                    sistema.agregarEx(e);
                    break;
                case 2:

                    sistema.mostrarExamenes();
                    break;
                case 3:
                    Alumno al = new Alumno();
                    al.mostrardatos();

                    break;
            }

        }
    }
}
