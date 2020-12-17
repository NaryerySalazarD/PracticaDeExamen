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
public class SistemaNotasControlador {

    public void iniciar() {
        SistemaNotas sistema = new SistemaNotas();
        SistemaNotasInterfaz t = new SistemaNotasInterfaz(sistema);
        t.SistemaNotasInterfaz();
    }
}
