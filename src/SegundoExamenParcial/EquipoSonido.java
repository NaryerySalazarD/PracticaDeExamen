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
public class EquipoSonido {

    String parlanteDerecho;
    String parlanteIzquierdo;
    String parlanteSubwoofer;
    int volumen;

    public EquipoSonido(String parlanteDerecho, String parlanteIzquierdo, String parlanteSubwoofer) {
        this.parlanteDerecho = parlanteDerecho;
        this.parlanteIzquierdo = parlanteIzquierdo;
        this.parlanteSubwoofer = parlanteSubwoofer;
    }

    public EquipoSonido() {

    }

    public String getParlanteDerecho() {
        return parlanteDerecho;
    }

    public void setParlanteDerecho(String parlanteDerecho) {
        this.parlanteDerecho = parlanteDerecho;
    }

    public String getParlanteIzquierdo() {
        return parlanteIzquierdo;
    }

    public void setParlanteIzquierdo(String parlanteIzquierdo) {
        this.parlanteIzquierdo = parlanteIzquierdo;
    }

    public String getParlanteSubwoofer() {
        return parlanteSubwoofer;
    }

    public void setParlanteSubwoofer(String parlanteSubwoofer) {
        this.parlanteSubwoofer = parlanteSubwoofer;
    }

}
