
import java.util.Scanner;



public class Problema3 {

    private static double calcularImpuesto(int dependiente, double salarioMensual) {
        double salarioGravable ;
        double montoImpuesto ;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de dependientes: ");
        dependiente = entrada.nextInt();
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Introduce tu salario: ");
        salarioMensual = entrada1.nextInt();
        switch (dependiente) {
            case 1:
                System.out.println("\nSu salario es gravable en un 100%.");
                salarioGravable = salarioMensual;
                break;
            case 2:
                System.out.println("\nSu salario es gravable en un 90%.");
                salarioGravable = salarioMensual * 0.9;
                break;
            case 3:
                System.out.println("\nSu salario es gravable en un 70%.");
                salarioGravable = salarioMensual * 0.7;
                break;
            case 4:
                System.out.println("\nSu salario es gravable en un 60%.");
                salarioGravable = salarioMensual * 0.6;
                break;
            default:
                System.out.println("\nSu salario es gravable en un 40%.");
                salarioGravable = salarioMensual * 0.4;
                break;
        }

        if (salarioGravable < 200000) {
            System.out.println("\nSu impuesto sobre la renta es de un 0% sobre su salario gravable, el cual es de " + salarioGravable);
            montoImpuesto = salarioGravable * 0;
        } else if (salarioGravable < 400000) {
            System.out.println("\nSu impuesto sobre la renta es de un 10% sobre su salario gravable, el cual es de " + salarioGravable);
            montoImpuesto = salarioGravable * 0.10;
        } else if (salarioGravable < 600000) {
            System.out.println("\nSu impuesto sobre la renta es de un 15% sobre su salario gravable, el cual es de " + salarioGravable);
            montoImpuesto = salarioGravable * 0.15;
        } else if (salarioGravable < 800000) {
            System.out.println("\nSu impuesto sobre la renta es de un 20% sobre su salario gravable, el cual es de " + salarioGravable);
            montoImpuesto = salarioGravable * 0.20;
        } else  {
            System.out.println("\nSu impuesto sobre la renta es de un 30% sobre su salario gravable, el cual es de " + salarioGravable);
            montoImpuesto = salarioGravable * 0.30;
        }

        return montoImpuesto;
    }

    public static void main(String[] args) {
  int dependiente=0;
  double salarioMensual=0;
        //captura lo que el método retorna
        double resultadoImpuesto;
        resultadoImpuesto = calcularImpuesto(dependiente, salarioMensual);
        System.out.print("El monto a pagar es de: "+resultadoImpuesto);

    }
}
