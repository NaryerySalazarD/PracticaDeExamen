/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIProyecto.Problema1;

/*

 */
public class Tester {

    public static void main(String args[]) {
        Colon moneda1 = new Colon();
        Dolar moneda2 = new Dolar();
        Euro moneda3 = new Euro();
        Moneda moneda = new Moneda();

        moneda.Moneda();
        switch (moneda.getMonedaOrigen()) {
            case "colones":
                moneda1.ValorMonedaOrigen();
                System.out.println(moneda1.getUnidades() + "colones.");
                break;
            case "dolares":
                moneda2.ValorMonedaOrigen();
                System.out.println(moneda2.getUnidades() + "dólares.");
                break;
            default:
                moneda3.ValorMonedaOrigen();
                System.out.println(moneda3.getUnidades() + "euros.");
                break;
        }
        moneda.MonedaDestino();
        if (moneda.getMonedaOrigen().equals("colones") && moneda.getMonedaDestino().equals("dolares")) {
            moneda1.ConvertorColon_Dolar();
            System.out.println(moneda1.getUnidades() + "colones son " + moneda1.getMonedaDestino() + "dolares.");
        } else if (moneda.getMonedaOrigen().equals("colones") && moneda.getMonedaDestino().equals("euros")) {
            moneda1.ConvertorColon_Euro();
            System.out.println(moneda1.getUnidades() + "colones son " + moneda1.getMonedaDestino() + "euros.");
        } else if (moneda.getMonedaOrigen().equals("dolares") && moneda.getMonedaDestino().equals("colones")) {
            moneda2.ConvertorDolar_colon();
            System.out.println(moneda2.getUnidades() + "dolares son " + moneda2.getMonedaDestino() + "colones.");
        } else if (moneda.getMonedaOrigen().equals("dolares") && moneda.getMonedaDestino().equals("euros")) {
            moneda2.ConvertorDolar_euro();
            System.out.println(moneda2.getUnidades() + "dolares son " + moneda2.getMonedaDestino() + "euros.");
        } else if (moneda.getMonedaOrigen().equals("euros") && moneda.getMonedaDestino().equals("colones")) {
            moneda3.ConvertorEuro_colon();
            System.out.println(moneda3.getUnidades() + "euros son " + moneda3.getMonedaDestino() + "colones.");
        } else {
            moneda3.ConvertorEuro_Dolar();
            System.out.println(moneda3.getUnidades() + "euros son " + moneda3.getMonedaDestino() + "dolares.");
        }

    }
}
