/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema6;

/**
 *
 * @author NaryerySD
 */
public class Tester {
    public static void main(String[] args){
         Alumno nombre1=new Alumno();
    Reporte j=new Reporte();
    j.imprimirReporte();
    SistemaNotasInterfaz n=new SistemaNotasInterfaz();
    n.SistemaNotasInterfaz();
    SistemaNotasReporte x=new SistemaNotasReporte();
    x.generarReporteTodosExamenesOrdenadosPor(nombre1.getNombre());
   
}
}
