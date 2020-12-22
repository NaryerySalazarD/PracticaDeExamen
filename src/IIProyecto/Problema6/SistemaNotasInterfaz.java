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
 * @author Naryery
 */
public class SistemaNotasInterfaz {

    Scanner s = new Scanner(System.in);
    boolean modoGrafico;
    SistemaNotas sistema;
    SistemaNotasReporte reporte = new SistemaNotasReporte();

    public SistemaNotasInterfaz(SistemaNotas iniciado, boolean modoGrafico) {
        this.modoGrafico = modoGrafico;
        this.sistema = iniciado;
    }

    public void op1() {
        reporte.generarReporteTodosExamenes();
    }

    public void op2() {
        reporte.generarReporteTodosAlumnos();
    }

    public void op3() {

        reporte.generarReporteAlumnosConNotaInferiorA(70);
    }

    public void op4() {
        System.out.println("Escriba la propiedad que desea");
        String n = s.next();
        reporte.generarReporteTodosExamenesOrdenadosPor(n);
    }

    public void gráfico() {

        //Modo gráfico
        String mensaje = "Digite el nombre del alumno:";
        String x = JOptionPane.showInputDialog(null, mensaje);
        mensaje = "Digite el apellido del alumno:";
        String y = JOptionPane.showInputDialog(null, mensaje);
        mensaje = "Digite el carne:";
        int z = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        Alumno alum = new Alumno(x, y, z);
        mensaje = "Digite la nota obtenida:";
        int nota = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Digite puntos totales:";
        int puntosTotales = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Digite puntos obtenidos:";
        int puntosObtenidos = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        Examenes e = new Examenes(nota, null, puntosTotales, puntosObtenidos, null);
        //padre familiar
        mensaje = "Digite nombre padre:";
        String nombrePadre = JOptionPane.showInputDialog(null, mensaje);
        mensaje = "Digite apellidos padre:";
        String apellidosPadre = JOptionPane.showInputDialog(null, mensaje);
        PadreFamiliar p1 = new PadreFamiliar(nombrePadre, apellidosPadre);
        alum.setPadre(p1);

        mensaje = "¿Qué desea hacer?";
        JOptionPane.showMessageDialog(null, mensaje);
        mensaje = "1.Generar Reporte de todos los exámenes";
        JOptionPane.showMessageDialog(null, mensaje);
        mensaje = "2.Generar reporte de todos los alumnos";
        JOptionPane.showMessageDialog(null, mensaje);
        mensaje = "3.Generar reporte de todos los alumnos con nota inferior a 70";
        JOptionPane.showMessageDialog(null, mensaje);
        mensaje = "4.Generar reporte de todos los exámenes ordenados por una propiedad";
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public void interativo() {
        //modo interativo
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
        Examenes e = new Examenes(nota, null, puntosTotales, puntosObtenidos, null);
        //Padre familiar
        System.out.println("Digite nombre padre:");
        String nombrePadre = s.next();
        System.out.println("Digite apellidos padre:");
        String apellidosPadre = s.next();

        PadreFamiliar p1 = new PadreFamiliar(nombrePadre, apellidosPadre);
        alum.setPadre(p1);

    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Modo gráfico\n2. Modo interativo"));
            if ((r < 1) || (r > 2)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }

    public int menu() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1.Generar Reporte de todos los exámenes\\n2.Generar reporte de todos los alumnos\\n3.Generar reporte de todos los alumnos con nota inferior a 70\\n4.Generar reporte de todos los exámenes ordenados por una propiedad"));
            if ((r < 1) || (r > 4)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
