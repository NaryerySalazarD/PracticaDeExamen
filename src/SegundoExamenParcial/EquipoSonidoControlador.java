/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoExamenParcial;

/**
 *
 * @author gigabyte
 */
public class EquipoSonidoControlador {

    boolean modoGrafico = true;

    public void iniciar() {
        EquipoSonido n = new EquipoSonido();
        EquipoSonidoVista k = new EquipoSonidoVista(n);
        k.getOpcion();
        switch (k.menu()) {
            case 1:
                k.menuParlante();
                if (k.menu() == 1) {
                    k.menuParlantes();
                    if (k.menu() == 1) {
                        k.sonarParlanteDerecho(audio);
                    }
                    else if (k.menu() == 2) {
                        k.volumenParlanteDerecho();
                    }
                    else {
                        k.deshabilitarParlanteDerecho();
                    }
                } else if (k.menu() == 2) {
                    k.menuParlante();
                    if (k.menu() == 2) {
                        k.menuParlantes();
                        if (k.menu() == 1) {
                            k.sonarParlanteIzquierdo(audio);
                        }
                        else if (k.menu() == 2) {
                            k.volumenParlanteIzquierdo();
                        }
                        else {
                            k.deshabilitarParlanteIzquierdo();
                        }
                    } else {
                        k.menuParlantes();
                        if (k.menu() == 1) {
                            k.sonarParlanteIzquierdo(audio);
                        }
                        if (k.menu() == 2) {
                            k.volumenParlanteIzquierdo();
                        }
                        if (k.menu() == 3) {
                            k.deshabilitarParlanteIzquierdo();
                        }
                    }
                }       break;
            case 2:
                
                break;
            case 3:
                break;
            case 4:
                
                break;
            case 5:
                k.agregarAudio(entrada);
                break;
            case 6:
                k.eliminarAudio();
                break;
            default:
                break;
        }
        } 
}
}
