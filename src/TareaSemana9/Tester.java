/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaSemana9;



/**
 *
 * @NaryerySD
 */
public class Tester {
     public static void main(String args[]) {
        Estudiante e = new Estudiante();
        Menu menu = new Menu();
        Menu opcion = new Menu();
        while (true) {

            menu.opcionesMenu();
            opcion.ingresarOpcion();
            switch (opcion.opcion) {
                case 1:
                    e.agregarNota();
                    break;
                case 2:
                    e.eliminarNota();
                    break;
                case 3:
                    e.notasRegistradas();
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }
           

        }

    }
}
