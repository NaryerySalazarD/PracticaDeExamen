/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema6;

/**
 *
 * @author gigabyte
 */
public class SistemaNotasReporte {

    SistemaNotas sistema = new SistemaNotas();
    Alumno padre = new Alumno();

    public void generarReporteTodosExamenes() {
        sistema.mostrarExamenes();
    }

    public void generarReporteTodosAlumnos() {
        sistema.mostrarAlumnos();
    }

    public void generarReporteAlumnosConNotaInferiorA(int nota) {
        Examenes e = new Examenes();

        nota = e.getNota();
        int cont = 100;
        for (int i = 0; i < cont; i++) {
            if (nota < 70) {
                padre.mostrardatos();
                padre.imprimirPadreFamiliar();
            }
        }

    }

    public void generarReporteTodosExamenesOrdenadosPor(String[] nombre) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4 - j; i++) {
                if (nombre[i].compareTo(nombre[i + 1]) > 0) {
                    String aux;
                    aux = nombre[i];
                    nombre[i] = nombre[i + 1];
                    nombre[i + 1] = aux;
                }
            }
        }
    }
}
