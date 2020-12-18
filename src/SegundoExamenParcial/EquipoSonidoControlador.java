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

     boolean modoGrafico =true;

    
    public void iniciar(){
       EquipoSonido n=new EquipoSonido();
       EquipoSonidoVista k=new EquipoSonidoVista(n);
       k.getOpcion();
       if(k.menu()==1){
           k.menuParlante();
           if(k.menu()==1){
               k.sonarParlanteDerecho(audio);
               k.volumenParlanteDerecho();
               k.deshabilitarParlanteDerecho();
           }
           else if(k.menu()==2){
               
           }
             else{
               
           }
       }
       else if(k.menu()==2){
           
       }
        else if(k.menu()==3){
           
       }
        else if(k.menu()==4){
           
       }
        else if(k.menu()==5){
           
       }
        else if(k.menu()==6){
           
       }
        else {
           
       }
    }
}
