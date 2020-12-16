/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gigabyte
 */
public class SistemaNotasReporte {
    SistemaNotas sistema=new SistemaNotas();
    Alumno padre=new Alumno();
    public void generarReporteTodosExamenes(){
        sistema.mostrarExamenes();
    }
    public void generarReporteTodosAlumnos(){
        sistema.mostrarAlumnos();
    }
    public void generarReporteAlumnosConNotaInferiorA(int nota){
        if(nota<70){
        padre.mostrardatos();
        padre.imprimirPadreFamiliar();
        }
        
    }
    public void generarReporteTodosExamenesOrdenadosPor(String nombre){
        Alumno nombre1=new Alumno();
        ArrayList<String> lista = new ArrayList<>();
        
        nombre = nombre1.getNombre();

        for (int i = 0; i < nombre.length(); i++) {
            for (int j = i + 1; j <= nombre.length(); j++) {
                String r = nombre.substring(i, j);
                lista.add(r);//Se añaden al la lista
            }
        }

        Collections.sort(lista);//Este es el metodo que ordena la lista.

        System.out.println("Las substrings de la palabra son:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        
      
    }
}
}
