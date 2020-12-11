/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizX2;

/**
 *
 * @author gigabyte
 */
public class Pizza {
  
    Ingredientes in1;
    Ingredientes in2;
    Ingredientes in3;
    Ingredientes in4;
    public Pizza (){
        
    }
    public int calcularMonto(){
        int resultado=0;
        if(in1!=null)
            resultado+=in1.getPrecio();
        if(in2!=null)
            resultado+=in2.getPrecio();
        if(in3!=null)
            resultado+=in3.getPrecio();
        if(in4!=null)
            resultado+=in4.getPrecio();
        return resultado;
    }

    public Pizza(Ingredientes in1, Ingredientes in2, Ingredientes in3, Ingredientes in4) {
        this.in1 = in1;
        this.in2 = in2;
        this.in3 = in3;
        this.in4 = in4;
    }

    public Ingredientes getIn1() {
        return in1;
    }

    public void setIn1(Ingredientes in1) {
        this.in1 = in1;
    }

    public Ingredientes getIn2() {
        return in2;
    }

    public void setIn2(Ingredientes in2) {
        this.in2 = in2;
    }

    public Ingredientes getIn3() {
        return in3;
    }

    public void setIn3(Ingredientes in3) {
        this.in3 = in3;
    }

    public Ingredientes getIn4() {
        return in4;
    }

    public void setIn4(Ingredientes in4) {
        this.in4 = in4;
    }
}