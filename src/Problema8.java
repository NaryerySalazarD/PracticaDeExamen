
public class Problema8 {
    
    public static void main(String[] args) {
        int monedas[]={
                        1000, 500, 100,
                        10, 5, 1}; //inicialización implícita del arreglo
        int desglose[];
        desglose = new int[11];
        
        int i;
        int n = 7693;
        //este es el desglose
        for(i = 0; i<= 10; i++) {
            desglose[i] = 0;
            desglose[i] = n / monedas[i]; // división entera entre n y el valor de monedas[i]
            n = n - (desglose[i] * monedas[i]);
        }
        //este muestra el resultado del desglose
        for (i=0; i<= 10; i ++) {
            if (desglose[i] != 0) {
                System.out.print(monedas[i]);
                System.out.print(" = ");
                System.out.println(desglose[i]);
            }
        }
        
    }
}


