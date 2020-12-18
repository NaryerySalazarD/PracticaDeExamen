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
public class Radio {
    String audio="101001";
    String encender;
    String apagar;
    public Radio(){
        
    }
    public Radio(String encender, String apagar) {
        this.encender = encender;
        this.apagar = apagar;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getEncender() {
        return encender;
    }

    public void setEncender(String encender) {
        this.encender = encender;
    }

    public String getApagar() {
        return apagar;
    }

    public void setApagar(String apagar) {
        this.apagar = apagar;
    }
    
}
