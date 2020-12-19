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
    SistemaNotas o;

    public SistemaNotasInterfaz(SistemaNotas iniciado, boolean modoGrafico) {
        this.modoGrafico = modoGrafico;
        this.o = iniciado;
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
        if (o.agregarEx(e)) {

            JOptionPane.showMessageDialog(null, e.getNota());
            JOptionPane.showMessageDialog(null,e.getPuntosObtenidos());
            o.mostrarExamenesIN();
        } else {
          JOptionPane.showMessageDialog(null,"No hay suficiente espacio.");
        }

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
}
