
import java.util.Scanner;

public class Problema3 {

    private static int[] dependiente(int[] cosa) {
        int salarioMensual;
        int dependiente;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de dependientes: ");
        dependiente = entrada.nextInt();
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Introduce tu salario: ");
        salarioMensual = entrada1.nextInt();

        if (dependiente == 1) {
            System.out.println("\nSu impuesto sobre la renta es gravable en un 100%.");
        }
        if (dependiente == 2) {
            System.out.println("\nSu impuesto sobre la renta es gravable en un 90%.");
        }
        if (dependiente == 3) {
            System.out.println("\nSu impuesto sobre la renta es gravable en un 70%.");
        }
        if (dependiente == 4) {
            System.out.println("\nSu impuesto sobre la renta es gravable en un 60%.");
        }
        if (dependiente > 4) {
            System.out.println("\nSu impuesto sobre la renta es gravable en un 40%.");
        }
         if (salarioMensual<200000) {
            System.out.println("\nSu impuesto sobre la renta es de un 0%.");
        }
          if (salarioMensual<=400000) {
            System.out.println("\nSu impuesto sobre la renta es de un 10%.");
        }
           if (salarioMensual<200000) {
            System.out.println("\nSu impuesto sobre la renta es de un 0%.");
        }
        
        return cosa;
    }

    public static void main(String[] args) {
        

    }
}
