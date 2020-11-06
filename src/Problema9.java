
import java.util.Scanner;

public class Problema9 {

    public static void main(String[] args) {
        //variables nombradas
        int menu;
        int nota;
        int carnet;
        int estudiante =0;
        
        int[] notas = new int[5];
        int[] carnets = new int[5];
        //lleno mis variables con "0"
        for (int i = 0; i < carnets.length; i++) {
            carnets[i] = 0;
            notas[i] = 0;
        }
        //ciclo para el menú y su configuración
        while (true) {
            System.out.println("1.Agregar una nota.");
            System.out.println("2.Eliminar una nota.");
            System.out.println("3.Mostrar las notas registradas.");
            System.out.println("4.salir.");
            System.out.println("Ingrese la opción que desea: ");
            Scanner entrada = new Scanner(System.in);
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    if(estudiante==5){
                        System.out.println("Se alcanzó el número máximo de estudiantes.");
                    }
                    else if(estudiante!=5){
                    System.out.println("1.Agregar una nota.");
                    System.out.println("Agregue el carnet del estudiante: ");
                    Scanner entrada2 = new Scanner(System.in);
                    carnet = entrada2.nextInt();
                    carnets[estudiante] = carnet;

                    System.out.println("El carnet del estudiante es: ");
                    System.out.println(carnet);

                    System.out.println("Agregue la nota del estudiante: ");
                    Scanner entrada1 = new Scanner(System.in);
                    nota = entrada1.nextInt();
                    notas[estudiante] = nota;
                    System.out.println("La nota del estudiante es: ");
                    System.out.println(nota);
                    estudiante = estudiante + 1;}
                    break;

                case 2:
                    System.out.println("2.Eliminar una nota.");
                    estudiante = estudiante - 1;
                    carnets[estudiante] = 0;
                    notas[estudiante] = 0;
                    break;
                case 3:
                    if (estudiante == 0) {
                        System.out.println("No hay estudiantes registrados.");
                    } else if (estudiante != 0) {
                        System.out.println("3.Mostrar las notas registradas.");

                        for (int i = 0; i < carnets.length; i++) {

                            if (carnets[i] != 0) {
                                System.out.println("Carnet: " + carnets[i]);
                            }
                            if (notas[i] != 0) {
                                System.out.println("Nota: " + notas[i]);
                            }
                        }
                    }
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;

            }

        }
    }
}
