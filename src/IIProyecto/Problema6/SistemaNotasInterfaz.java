/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gigabyte
 */
public class SistemaNotasInterfaz {

    Scanner s = new Scanner(System.in);
    boolean modoGrafico=true;

    public void SistemaNotasInterfaz() {

        SistemaNotas sistema = new SistemaNotas();
        
        while (true) {
            
            if (modoGrafico) { //Modo gráfico
                 String mensaje="Digite el nombre del alumno:";
                JOptionPane.showInputDialog(null,mensaje);
                
            } else { //modo interativo
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

                PadreFamiliar p1 = new PadreFamiliar(nombrePadre, apellidosPadre);
                alum.setPadre(p1);

                Examenes e = new Examenes(alum, nota, puntosTotales,
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

            }
           

        }
    }
}

