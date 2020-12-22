/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema6;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Naryery
 */
public class SistemaNotasReporte {

    int maxRegistros = 100;

    SistemaNotas sistema = new SistemaNotas();
    Alumno padre = new Alumno();

    public void sistemaNotasReporte() {
        JFrame f = new JFrame("REPORTES");
       
        JPanel panel = new JPanel();

        panel.setBounds(40, 80, 200, 200);

        panel.setBackground(Color.CYAN);
        
        f.add(panel);
        f.setSize(400, 400);

        f.setLayout(null);

        f.setVisible(true);
        
    }
    public void generarReporteTodosExamenes() {
        sistema.mostrarExamenesIN();
    }

    public void generarReporteTodosAlumnos() {
        sistema.mostrarAlumnos();
    }

    public void generarReporteAlumnosConNotaInferiorA(int nota) {
        int cont = maxRegistros;
        for (int i = 0; i < cont; i++) {
            if (nota < 70) {
                padre.mostrardatos();
                padre.imprimirPadreFamiliar();
            }
        }

    }

    public void generarReporteTodosExamenesOrdenadosPor(String propiedad) {

        if (propiedad.equals("nota")) {

            padre.mostrardatos();
            padre.imprimirPadreFamiliar();
        } else if (propiedad.equals("puntosTotales")) {
            padre.mostrardatos();
            padre.imprimirPadreFamiliar();
        }

    }

}
