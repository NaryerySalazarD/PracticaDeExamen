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
public class Tester {

    public static void main(String[] args) {
        //cliente 1
        Ingredientes ing1 = new Ingredientes("jamon", 1, "", 600);
        Ingredientes ing2 = new Ingredientes("queso", 2, "", 600);
        Pizza p = new Pizza();
        p.setIn1(ing1);
        p.setIn2(ing2);
        System.out.println(p.calcularMonto());

        //cliente 2
        ing1 = new Ingredientes("jamon", 1, "", 600);
        ing2 = new Ingredientes("queso", 2, "", 600);
        Ingredientes ing3 = new Ingredientes("queso", 3, "EXTRA", 800);

        p.setIn1(ing1);
        p.setIn2(ing2);
        p.setIn2(ing3);
        System.out.println(p.calcularMonto());
    }
}
