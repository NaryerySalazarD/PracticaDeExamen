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

 

    public void iniciar() {
        EquipoSonido n = new EquipoSonido();
        EquipoSonidoVista k = new EquipoSonidoVista(n);
        k.ListaReproduccion();
        k.getOpcion();
        while(true){
        switch (k.menu()) {
            case 1:
                k.menuParlante();
                if (k.menu() == 1) {
                    k.menuParlantes();
                    if (k.menu() == 1) {
                        k.sonarParlanteDerecho();
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
                            k.sonarParlanteIzquierdo();
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
                            k.sonarParlanteIzquierdo();
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
                k.orden();
                break;
            case 3:
                k.aleatorio();
                break;
            case 4:
                k.mostrarLista();
                break;
            case 5:
                k.agregarAudio();
                break;
            case 6:
                k.eliminarAudio();
                break;
            case 7:
                k.radio();
                break;
            case 8:
                k.hora();
                break;
            default:
                
                break;
        }
        break;
        } 
}
    
}

