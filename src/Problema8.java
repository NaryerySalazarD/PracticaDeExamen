
import java.util.Scanner;

public class Problema8 {

    public static void main(String[] args) {
        //inicia el arreglo
        int monedas[] = {1000, 500, 100, 10, 5, 1}; 
        int desglose[];
        desglose = new int[6];

        int i;
        int n;
        int mon=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el monto: ");
        n = entrada.nextInt();
        //este es el desglose
        for (i = 0; i <= 5; i++) {
            desglose[i] = 0;
            desglose[i] = n / monedas[i]; 
            n = n - (desglose[i] * monedas[i]);
        }
        //este muestra el resultado del desglose
        for (i = 0; i <= 5; i++) {
            if (desglose[i] != 0) {
                System.out.print(monedas[i]);
                System.out.print(" = ");
                System.out.println(desglose[i]);
                mon +=desglose[i];
            }
        }
        //imprime la cantidad de monedas que se necesitan
 System.out.println("Se requerirán "+mon+" monedas.");
    }
}
