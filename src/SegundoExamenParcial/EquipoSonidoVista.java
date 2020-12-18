/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoExamenParcial;

import java.util.Scanner;

/**
 *
 * @author gigabyte
 */
public class EquipoSonidoVista {

    int cont;
    int maxAudios = 1000;
    String[] listaAudios = new String[maxAudios];
    Scanner entrada = new Scanner(System.in);
    EquipoSonido parlante;

    public EquipoSonidoVista(EquipoSonido parlante) {
        this.parlante = parlante;

    }

    public void ListaReproduccion() {
        for (int i = 0; i < 1000; i++) {
            listaAudios[i] = "";
        }
    }

    public void sonarParlanteDerecho() {
        System.out.println("Agregue el audio");
        String audio = entrada.next();
        parlante.setParlanteDerecho("Su parlante está sonandola canción " + audio);
        System.out.println(parlante.getParlanteDerecho());

    }

    public void sonarParlanteIzquierdo() {
        System.out.println("Agregue el audio");
        String audio = entrada.next();
        parlante.setParlanteIzquierdo("Su parlante está sonandola canción " + audio);
        System.out.println(parlante.getParlanteIzquierdo());
    }

    public void sonarParlanteSubwoofer() {
        System.out.println("Agregue el audio");
        String audio = entrada.next();
        parlante.setParlanteSubwoofer("Su parlante está sonando la canción " + audio);
        System.out.println(parlante.getParlanteSubwoofer());

    }

    public void volumenParlanteDerecho() {
        System.out.println("Desea:/ 1. subir volumen/ 2. bajar volumen");
        int op = entrada.nextInt();
        if (op == 1) {
            System.out.println("Subió el volumen del parlante derecho.");
        } else {
            System.out.println("Bajó el volumen del parlante derecho.");
        }
    }

    public void volumenParlanteIzquierdo() {
        System.out.println("Desea:/ 1. subir volumen/ 2. bajar volumen");
        int op = entrada.nextInt();
        if (op == 1) {
            System.out.println("Subió el volumen del parlante izquierdo.");
        } else {
            System.out.println("Bajó el volumen del parlante izquierdo.");
        }
    }

    public void volumenParlanteSubwoofer() {
        System.out.println("Desea:/ 1. subir volumen/ 2. bajar volumen");
        int op = entrada.nextInt();
        if (op == 1) {
            System.out.println("Subió el volumen del parlante subwoofer.");
        } else {
            System.out.println("Bajó el volumen del parlante subwoofer.");
        }
    }

    public void habilitarParlanteDerecho() {
        System.out.println("Parlante derecho habilitado");
    }

    public void habilitarParlanteIzquierdo() {
        System.out.println("Parlante izquierdo habilitado");
    }

    public void habilitarParlanteSubwoofer() {
        System.out.println("Parlante subwoofer habilitado");
    }

    public void deshabilitarParlanteDerecho() {
        System.out.println("Parlante derecho deshabilitado");
    }

    public void deshabilitarParlanteIzquierdo() {
        System.out.println("Parlante izquierdo deshabilitado");
    }

    public void deshabilitarParlanteSubwoofer() {
        System.out.println("Parlante subwoofer deshabilitado");
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" + "listaAudios=" + listaAudios + '}';
    }

    public void aleatorio() {

    }

    public void orden() {
        for (int i = 0; i < cont; i++) {
            if (listaAudios[i] != null) {
                System.out.println(listaAudios[i]);
            }
        }
    }

    public void mostrarLista() {
        for (int i = 0; i < 1000; i++) {
            if (listaAudios[i].equals("") == false) {
                System.out.println(listaAudios[i]);
            }

        }
    }

    public boolean agregarAudio() {

        String audio = entrada.next();
        boolean resultado = false;
        if (cont < maxAudios) {
            listaAudios[cont] = audio;
            cont++;
            resultado = true;
        }
        return resultado;
    }

    public boolean eliminarAudio() {
        boolean resultado = false;
        if (cont != 0) {
            listaAudios[cont - 1] = null;
            cont--;
            resultado = true;
        }
        return resultado;
    }

    public void getOpcion() {
        System.out.println("1.Elgir un parlante");
        System.out.println("2.Reproduce la lista en orden");
        System.out.println("3.Reproduce la lista de forma aleatoria");
        System.out.println("4.Muestra la lista completa");
        System.out.println("5.Agregar audio");
        System.out.println("6.Eliminar audio");
        System.out.println("7.Utilizar radio");
        System.out.println("8.Programar hora");
        System.out.println("9.Salir");
    }

    public void menuParlante() {
        System.out.println("1.Parlante derecho");
        System.out.println("2.Parlante izquierdo");
        System.out.println("3.Parlante subwoofer");
    }

    public void menuParlantes() {
        System.out.println("1.Sonar parlante");
        System.out.println("2.Manejar volumen");
        System.out.println("3.Deshabilitar parlante");
    }

    public int menu() {
        int r;
        r = entrada.nextInt();
        return r;
    }

    public void radio() {
        Radio n=new Radio();
        n.setAudio("10101");
        System.out.println("1.Apagar radio");
        System.out.println("2.Encender radio");
        
        int h = entrada.nextInt();
        if (h==1)
         System.out.println("Radio apagado"); 
        else
          System.out.println("Radio encendido con el audio "+n.getAudio());  
    }

    public void hora() {
        Reloj r = new Reloj();

        System.out.println("Introduzca la hora");
        int hora = entrada.nextInt();

        System.out.println("Introduzca los minutos");
        int minutos = entrada.nextInt();
        r.setAlarm(hora, minutos);
        System.out.println("El equipo de sonido se encenderá automáticamente a las " + hora + " horas con " + minutos + " minutos.");
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

}
