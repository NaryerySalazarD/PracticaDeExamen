
import java.util.Scanner;



public class Problema5 {
    public static void main( String[] args){
        Scanner ac=new Scanner (System.in);
        
        //pido el dato de entrada
        System.out.println("Cuántos términos de presición desea: ");
        int n=ac.nextInt();
        
        //Proceso
        System.out.println("pi= "+pi(n));
        
    }
    public static double pi(int n){
        int d=1,sig=1;
        double t,s=0;
        for(int i=1;i<=n;i++){
            t=(double)1/d*sig;
            s+=t;
            d +=2;
            sig*=-1;
        }
        return s*4;
    }
}
