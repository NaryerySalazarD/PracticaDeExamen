
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;

        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = entrada1.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Introduce el segundo número: ");
        num2 = entrada2.nextInt();

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Introduce el tercer número: ");
        num3 = entrada3.nextInt();

        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Introduce el cuarto número: ");
        num4 = entrada4.nextInt();

        //sin arreglo//Parte 1
        System.out.print("Promedio: ");
        System.out.println((num1 + num2 + num3 + num4) / 4);

        //con arreglo//Parte 2
        int suma = 0;

        int[] arreglo = new int[4];
        Scanner ent = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("Ingresa el " + i + " numero:");
            arreglo[i] = ent.nextInt();
            suma += arreglo[i];

        }

        System.out.print("Promedio: ");
        System.out.println(suma / arreglo.length);

        //parte 3
        Scanner entrada = new Scanner(System.in);
        int numero ;
        int factorial = 1;

        System.out.println("Ingresa el número del cuál quieras calcular el factorial: ");
        numero = entrada.nextInt();
        int numero1 = numero;

        while (numero != 0) {
            factorial *= numero;
            numero--;
        }
        System.out.println("El factorial del número " + numero1 + " es " + factorial);

        //parte 4
        //con arreglo
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea digitar: ");
        int n = teclado.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato " + (i + 1) + ": ");
            array[i] = teclado.nextInt();

        }
        int mayor;
        mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);

        //sin arreglo
        int n1;
        int n2;
        int n3;
        Scanner objeto = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        n1 = objeto.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = objeto.nextInt();
        System.out.print("Ingrese el tercer número: ");
        n3 = objeto.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("No existe un número mayor.");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("El número mayor es: " + n1);
        } if  (n2 > n1 && n2 > n3) {
            System.out.println("El número mayor es: " + n2);
        } if (n3>n1&& n3>n2) {
            System.out.println("El número mayor es: " + n3);
        }

        //parte 5
        //sin arreglo
        int j1;
        int j2;
        int j3;
        Scanner objeto1 = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        j1 = objeto1.nextInt();
        System.out.println("Ingrese el segundo número: ");
        j2 = objeto1.nextInt();
        System.out.println("Ingrese el tercer número: ");
        j3 = objeto1.nextInt();

        if (j3 == j3 && j2 == j2 && j1 == j1) {
            System.out.println("Invirtiendo la lista de números, quedarían: " + j3 +", "+ j2+ ", " + j1+ ".");
        }
        //con arreglo
        
        //parte 7
      
        int[] numeros=new int[3];
        int numer1,numer2,numer3;
         Scanner objeto2 = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        numer1 = objeto2.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numer2 = objeto2.nextInt();
        System.out.println("Ingrese el tercer número: ");
        numer3 = objeto1.nextInt();
        int[] resultado=new int[numeros.length];

    }
}
