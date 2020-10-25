
import java.util.Scanner;


public class Problema1 {

    public static void main(String[] args) {
       int num1;
       int num2;
       String caracterDigitado;
      
       
       Scanner entrada1= new Scanner(System.in);
       System.out.print("Introduce el primer número: ");
       num1=entrada1.nextInt();
       
       Scanner entrada2= new Scanner(System.in);
       System.out.print("Introduce el segundo número: ");
       num2= entrada2.nextInt();
       
       Scanner entrada3=new Scanner(System.in);
       System.out.print("Introduce el carácter de la operción que desea realizar: ");
       caracterDigitado=entrada3.next();
       
       if (caracterDigitado.equals("+")){
           System.out.print("El resultado de la suma es: ");
           System.out.print(num1+num2);
       }
       if (caracterDigitado.equals("-")){
           System.out.print("El resultado de la resta es: ");
           System.out.print(num1-num2);
       }
        if (caracterDigitado.equals("*")){
           System.out.print("El resultado de la multiplicación es: ");
           System.out.print(num1*num2);
       }
        if (caracterDigitado.equals("/")){
           System.out.print("El resultado de la división es: ");
           System.out.print(num1/num2);
       }
       
       
    }
    
}
