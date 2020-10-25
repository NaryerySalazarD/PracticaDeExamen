
import java.util.Scanner;


public class Problema1 {

    public static void main(String[] args) {
       //Ingreso de las características
       int num1;
       int num2;
       String caracterDigitado;
      
       //Introduce el primer número
       Scanner entrada1= new Scanner(System.in);
       System.out.print("Introduce el primer número: ");
       num1=entrada1.nextInt();
       
       //Introduce el segundo número
       Scanner entrada2= new Scanner(System.in);
       System.out.print("Introduce el segundo número: ");
       num2= entrada2.nextInt();
       
       //Introduce el caráter con el que desea trabajar el usuario
       Scanner entrada3=new Scanner(System.in);
       System.out.print("Introduce el carácter de la operción que desea realizar: ");
       caracterDigitado=entrada3.next();
       
       //Configura la calculadora
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
