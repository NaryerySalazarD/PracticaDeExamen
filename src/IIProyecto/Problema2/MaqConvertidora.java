/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema2;

/**
 *
 * @author Naryery
 */
public class MaqConvertidora {
    Moneda monedaColon;
    Moneda monedaGene1;
    Moneda monedaGene2;
            
    
    public MaqConvertidora(){
    }

    public MaqConvertidora(Moneda monedaColon, Moneda monedaGene1, Moneda monedaGene2) {
        this.monedaColon = monedaColon;
        this.monedaGene1 = monedaGene1;
        this.monedaGene2 = monedaGene2;
    }

    
    
    
    //Este metodo requiere que monedaOrigen y monedaSalida esten establecidas
    public float convertir(Moneda monedaOrigen, Moneda monedaSalida, float cantidadOrigen){
        float resultado = 0;
        if(monedaOrigen!=null && monedaSalida!=null){
        if(monedaOrigen.getNombre().equals("colon")){
               if(monedaSalida.getNombre().equals("colon")){
                   resultado = cantidadOrigen;
               }
               else if(monedaSalida.getNombre().equals(monedaGene1.getNombre())){
                   resultado = cantidadOrigen/monedaGene1.getValorColon();
               }
               else{
                   resultado = cantidadOrigen/monedaGene2.getValorColon();
               }
        }
           
           else if(monedaOrigen.getNombre().equals("Dolar")){
           
           }
           else {
           
           }
        }
        
        return resultado;
    }
    
    public Moneda getMonedaColon() {
        return monedaColon;
    }
}
    
    