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
public class Tester {

    public static void main(String args[]) {
        Menu menu = new Menu();
        Menu opcion = new Menu();
        SistemaNotas sistema = new SistemaNotas();
        Scanner s = new Scanner(System.in);

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
                    System.out.println("Digite la nota obtenida:");
                    int nota = s.nextInt();
                    System.out.println("Digite puntos totales:");
                    int puntosTotales = s.nextInt();
                    System.out.println("Digite puntos obtenidos:");
                    int puntosObtenidos = s.nextInt();
                    //Padre familiar
                    System.out.println("Digite nombre padre:");
                    String nombrePadre = s.next();
                    System.out.println("Digite apellidos padre:");
                    String apellidosPadre = s.next();
                    System.out.println("Digite nombre de la madre:");
                    String nombreMadre = s.next();
                    System.out.println("Digite apellidos de la madre:");
                    String apellidosMadre = s.next();

                    PadreFamiliar p1 = new PadreFamiliar(nombrePadre, apellidosPadre,nombreMadre,apellidosMadre);
                    alum.setPadre(p1);
                   

                    Examen e = new Examen(alum, nota, puntosTotales,
                            puntosObtenidos, null);
                    if (sistema.agregarEx(e)) {

                        System.out.println(e.getNota());
                        System.out.println(e.getPuntosObtenidos());
                        //e.alumno.imprimirPadreFamiliar();
                        e.getAlumno().imprimirPadreFamiliar();

                        sistema.mostrarExamenes();
                    } else {
                        System.out.println("No hay suficiente espacio.");
                    }

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