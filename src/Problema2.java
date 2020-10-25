
import java.util.Scanner;

public class Problema2 {

    //Parte 7 (A)
    //creada para que el orden de la lista sea de forma aleatoria
    private static int[] aleatorio(int[] cosa) {
        for (int i = cosa.length - 1; i > 0; i--) {
            int aleatorio1 = (int) Math.floor(Math.random() * (i + 1));
            int a = cosa[i];
            cosa[i] = cosa[aleatorio1];
            cosa[aleatorio1] = a;
        }
        return cosa;
    }

    public static void main(String[] args) {
        //Parte 1
        //sin arreglo
        //valores
        int num1;
        int num2;
        int num3;
        int num4;

        //Introduce el primer número
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = entrada1.nextInt();

        //Introduce el segundo número
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Introduce el segundo número: ");
        num2 = entrada2.nextInt();

        //Introduce el tercer número
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Introduce el tercer número: ");
        num3 = entrada3.nextInt();

        //Introduce el cuarto número
        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Introduce el cuarto número: ");
        num4 = entrada4.nextInt();

        System.out.print("Promedio: ");
        System.out.println((num1 + num2 + num3 + num4) / 4);

        //Parte 2
        //con arreglo
        //valores predeterminados
        int suma = 0;
        //array para ingresar los números
        int[] arreglo = new int[4];
        Scanner ent = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("Ingresa el " + i + " numero:");
            arreglo[i] = ent.nextInt();
            suma += arreglo[i];

        }
        //resultado
        System.out.print("Promedio: ");
        System.out.println(suma / arreglo.length);

        //Parte 3
        //con ciclo 
        //valores predeterminados
        Scanner entrada = new Scanner(System.in);
        int numero;
        int factorial = 1;

        //pide al usuario ingresar el número a calcular
        System.out.println("Ingresa el número del cuál quieras calcular el factorial: ");
        numero = entrada.nextInt();
        int numero1 = numero;

        //se crea un ciclo para averiguar el factorial
        while (numero != 0) {
            factorial *= numero;
            numero--;
        }
        //resultado
        System.out.println("El factorial del número " + numero1 + " es " + factorial);

        //parte 4
        //con arreglo
        Scanner teclado = new Scanner(System.in);
        //pide al usuario el tamaño del array
        System.out.println("Ingrese la cantidad de números que desea digitar: ");
        int n = teclado.nextInt();
        int[] array = new int[n];

        //for para pedirle al usuario que ingrese la cantidad de datos que puso en el array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato " + (i + 1) + ": ");
            array[i] = teclado.nextInt();

        }
        //saca del array el valor más grande
        int mayor;
        mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        //resultado
        System.out.println("El número mayor es: " + mayor);

        //sin arreglo
        //valores
        int n1;
        int n2;
        int n3;
        Scanner objeto = new Scanner(System.in);

        //pide al usuario ingresa los valores
        System.out.print("Ingrese el primer número: ");
        n1 = objeto.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = objeto.nextInt();
        System.out.print("Ingrese el tercer número: ");
        n3 = objeto.nextInt();

        //condiciones para obtener el número mayor
        if (n1 == n2 && n2 == n3) {
            System.out.println("No existe un número mayor.");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("El número mayor es: " + n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("El número mayor es: " + n2);
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println("El número mayor es: " + n3);
        }

        //parte 5
        //sin arreglo
        //valores
        int j1;
        int j2;
        int j3;
        Scanner objeto1 = new Scanner(System.in);

        //pide al usuario ingresar los valores
        System.out.println("Ingrese el primer número: ");
        j1 = objeto1.nextInt();
        System.out.println("Ingrese el segundo número: ");
        j2 = objeto1.nextInt();
        System.out.println("Ingrese el tercer número: ");
        j3 = objeto1.nextInt();

        //condiciones para llegar al resultado
        if (j3 == j3 && j2 == j2 && j1 == j1) {
            System.out.println("Invirtiendo la lista de números, quedarían: " + j3 + ", " + j2 + ", " + j1 + ".");

            //con arreglo
            //valores
            Scanner lector = new Scanner(System.in);
            int rojo;
            int ama;
            int verde;
            int azul;
            // se crea un array y se le pide al usuario que ingrese su tamaño
            int arreglo5[] = new int[20];
            System.out.println("Ingrese el tamaño de su arreglo: ");
            rojo = lector.nextInt();
            //se crea un for para pedirle los valores al usuario
            for (ama = 0; ama < rojo; ama++) {
                System.out.print("Ingresa el valor número " + (ama + 1) + "=");
                arreglo5[ama] = lector.nextInt();

            }
            //da los valores que ya ingresé
            System.out.println("Arreglo sin valores intercambiados: ");
            for (int k = 0; k < rojo; k++) {
                System.out.print(arreglo5[k] + ", ");
            }
            //intercambia los valores que ingresó el usuario
            azul = rojo;
            for (ama = 0; ama <= azul / 2; ama++) {
                verde = arreglo5[ama];
                arreglo5[ama] = arreglo5[azul - 1];
                arreglo5[azul - 1] = verde;
                azul--;
            }
            System.out.print("\nArreglos con los valores intercambiados: ");
            for (ama = 0; ama < rojo; ama++) {
                System.out.print(arreglo5[ama] + ", ");
            }

            //parte 7 (B)
            //crea un scanner para ingresar los datos del arreglo
            int[] arreglo0 = new int[4];
            Scanner id = new Scanner(System.in);

            for (int i = 0; i < 4; i++) {

                System.out.println("\nIngresa el " + i + " numero:");
                arreglo0[i] = id.nextInt();

            }

            //se encarga de imprimir y reordenar la lista de forma aletaoria
            int[] baraja = aleatorio(arreglo0);
            System.out.println("La lista reordenada de forma aleatoria, quedaría: ");
            for (int i = 0, len = arreglo0.length; i < len; i++) {
                System.out.print(baraja[i]+", ");
            }

        }
    }
}
