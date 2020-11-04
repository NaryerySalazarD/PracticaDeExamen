
import java.util.Scanner;

public class Problema9 {

    static int[] estudiante;
    
    static int maxEstudiante = 5;
    static int estudiantes;

    public static int registro(int carnet, int nota) {
        int menu;
       
        System.out.println("1.Agregar una nota.");
        System.out.println("2.Eliminar una nota.");
        System.out.println("3.Mostrar las notas registradas.");
        System.out.println("Ingrese la opción que desea: ");
        Scanner entrada = new Scanner(System.in);

        menu = entrada.nextInt();

       if (menu==1){
                System.out.println("1.Agregar una nota.");
                Scanner entrada1 = new Scanner(System.in);
                System.out.println("Ingresa el carnet del estudiante: ");
                carnet = entrada1.nextInt();
                

                for (int i = 0; i <= maxEstudiante; i++) {

                    estudiante[i] = carnet;}
                Scanner entrada2 = new Scanner(System.in);
                System.out.println("Ingresa su nota: ");
                nota = entrada2.nextInt();
                

                for (int j = 0; j <= maxEstudiante; j++) {

                    estudiante[j] = nota;
                }
       }
                
                if (menu==2){
                System.out.println("2.Eliminar una nota.");
                Scanner entrada3 = new Scanner(System.in);
                System.out.println("Ingresa el carnet del estudiante: ");
                carnet = entrada3.nextInt();
                for (int k = 0; k <= maxEstudiante; k--) {

                    estudiante[k] -= carnet;
                    estudiante[k] -= nota;
                
                }
                if (menu==3){
                System.out.println("2.Eliminar una nota.");
                Scanner entrada5 = new Scanner(System.in);
                System.out.println("Ingresa el carnet del estudiante: ");
                carnet = entrada5.nextInt();
                Scanner entrada6 = new Scanner(System.in);
                System.out.println("Ingresa su nota: ");
                nota = entrada6.nextInt();
                }
       
         

        }
                
       
       return estudiantes;
    }
    
    public static void main (String[] args){
        int carnet=0;
        int nota=0;
         double resultadoImpuesto;
        resultadoImpuesto = registro(carnet, nota);
        System.out.print("El monto a pagar es de: "+resultadoImpuesto);
       //  int[] carnet = new int[4];
          //for (int i = 0; i < 4; i++) {
//
           // System.out.println("Ingresa el " + i + " numero:");
         //   carnet[i] = .nextInt();
    }
}

