
import java.util.Scanner;

public class Problema6 {

    public static void main(String[] args) {

        String figura;
        

        double n;

        double largo;
        double ancho;

        double pi = 3.1416;
        double r;
        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("\nIndique el nombre de la figura a la cuál le desea sacar el área: ");
            figura = entrada.next();
            switch (figura) {
                case "cuadrado": {
                    Scanner entrada1 = new Scanner(System.in);
                    System.out.print("Introduce la medida de uno de los lados del cuadrado: ");
                    n = entrada1.nextDouble();
                    System.out.print("El resultado del área del cuadrado es: ");
                    System.out.print(n * 4);
                    break;
                }

                case "rectangulo": {
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.print("Introduce la medida del largo del rectánculo: ");
                    largo = entrada2.nextDouble();
                    Scanner entrada3 = new Scanner(System.in);
                    System.out.print("Introduce la medida del ancho del rectángulo: ");
                    ancho = entrada3.nextDouble();
                    System.out.print("El resultado del área del rectángulo es: ");
                    System.out.print(largo * ancho);
                    break;
                }
                case "circulo": {
                    Scanner entrada4 = new Scanner(System.in);
                    System.out.print("Introduce la medida del radio de tu círculo: ");
                    r = entrada4.nextDouble();
                    System.out.print("El resultado del área del círculo es: ");
                    System.out.print(pi * (r * r));
                    break;
                }

            }

        }
    }
}
