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

    boolean modoGrafico = true;

    public void iniciar() {
        SistemaNotas nota = new SistemaNotas();
        SistemaNotasInterfaz nv = new SistemaNotasInterfaz(nota, modoGrafico);
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    nv.gráfico();

                    break;
                case 2:
                    nv.interativo();
                    break;
                default:
            }
        } while (op != 3);
    }

}
