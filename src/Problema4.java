
import java.util.Scanner;





public class Problema4 {
    public  static  boolean  biciesto ( int  anno ) {
        //nombra los valores
        boolean resultado=  false ;
        boolean cond1 =  false , cond2 =  false , cond3 =  false ;
        
        //ser multiplo de 4
        double residuo = anno %  4 ;
        if (residuo == 0 ) {
            cond1 = true ;
        }
        //no ser multiplo de 100
        residuo = anno %  100 ;
        if (residuo == 0 ) {
            cond2 = true ;
        }
        //ser multiplo de 400
        residuo = anno %  400 ;
        if (residuo == 0 ) {
            cond3 = true ;
        }
        
        if (cond1 && ( ! cond2 || cond3))
            resultado = true ;
        return resultado;
    }
    
   

    public static void main(String[] args){
        
        //pide el año al usuario
            Scanner a = new Scanner(System.in);
           int fecha;
            System.out.println("Introduce el año: ");
            fecha=a.nextInt();
            //resultado
            System.out.println("¿El año "+fecha+" es biciesto?"+"\n"+biciesto(fecha));
            

           
    }
          
    }

