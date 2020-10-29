
import java.util.Scanner;


public class Problema7 {
    private static Scanner ac=  new Scanner(System.in);
    
    public static void main(String[] args){
        //usar el método
        System.out.println("Ingrese el número de la base: ");
        int base=ac.nextInt();
         System.out.println("\nIngrese el número del exponente: ");
        int exponente=ac.nextInt();
        System.out.println("El resultado es: "+Potencia(base,exponente));
    }
    //método para llegar al resultado de la potencia
    public static int Potencia(int base,int exponente){
        if (exponente==0){
            return 1;
        } 
        else{
            return base*Potencia(base,exponente-1);
        }
    }
}
