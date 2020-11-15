
import java.util.Scanner;

public class Examen {

    static int garantia;
    static int licencia;

    static int n;

    static String recurso;

    static String marca;

    static String proveedor;

    static String nuevo;

    static String departamento;

    static int unidades;

    static int utilizados;

    public static int menus() {
        int menu1;
        System.out.println("Ingrese la opción que desea:");

        System.out.println("1. Ingresar datos de tipo básico.");

        System.out.println("2. Ingresar datos de tipo inventario.");

        System.out.println("3. Mostrar información completa del recurso.");

        System.out.println("4. Calcular la probabilidad de que se acabe el producto.");

        System.out.println("5. Reiniciar.");

        Scanner entrada1 = new Scanner(System.in);
        menu1 = entrada1.nextInt();

        return menu1;
    }

    public static void datosBasicos() {

        System.out.println("Ingrese el recurso que desea registrar: ");

        Scanner entrada = new Scanner(System.in);

        recurso = entrada.next();

        System.out.println("Ingrese la marca: ");

        marca = entrada.next();

        System.out.println("Ingrese el proveedor: ");

        proveedor = entrada.next();

        System.out.println("Ingrese si el producto es nuevo o reconstruido: ");

        nuevo = entrada.next();
        System.out.println("Ingrese el número de garantía: ");

        garantia = entrada.nextInt();
        System.out.println("Ingrese el número de licencia: ");

        licencia = entrada.nextInt();

    }

    public static int calcularProbabilidad() {
        int resultado = (int) Math.pow(unidades, n);
        int resultado1 = (int) Math.pow(utilizados, n);
        return resultado - resultado1;
    }

    public static float calcularProbabilidad(float num) {
        int resultado = (int) Math.pow(unidades, n);
        int resultado1 = (int) Math.pow(utilizados, n);
        return (resultado - resultado1) * num;
    }

    public static void main(String[] args) {
        while (true) {

            int valorMenu = menus();

            switch (valorMenu) {
                case 1:
                    datosBasicos();
                    break;
                case 2:
                    System.out.println("Ingrese datos de tipo inventario.");

                    System.out.println("Ingrese el departamento en el que se va a almacenar el recurso:");

                    Scanner entrada1 = new Scanner(System.in);

                    departamento = entrada1.next();

                    System.out.println("Ingrese el número de unidades que se entregaron al departamento:");

                    Scanner entrada2 = new Scanner(System.in);

                    unidades = entrada2.nextInt();

                    System.out.println("Ingrese el número de unidades que ya fueron utilizadas:");

                    Scanner entrada3 = new Scanner(System.in);

                    utilizados = entrada3.nextInt();
                    break;

                case 3:

                    System.out.println("Imprimir la información completa del recurso.");

                    System.out.println("Datos básicos.");

                    System.out.println("El recurso es " + recurso + ". Su marca es " + marca + ". Su proveedor es " + proveedor + ". ¿El producto es nuevo o reconstruido?" + nuevo);

                    System.out.println("El número de la garantía es " + garantia + ". Su licencia es: " + licencia);

                    System.out.println("Datos de tipo inventario.");

                    System.out.println("El departamento en el que se va a almacenar el recurso es: " + departamento + ", el número de unidades que se entregaron a dicho departamento  es " + unidades + " y el número de unidades que ya fueron utilizadas es " + utilizados);

                    System.out.println("El número de unidades disponibles es: " + (unidades - utilizados));

                    if ((unidades - utilizados) < 0.3) {

                        System.out.println("ALERTA, casi no hay unidades disponibles; sólo queda el 30%.");

                    }

                    break;

                case 4:

                    System.out.println("Ingrese el valor que desea para -n-");

                    Scanner entradas = new Scanner(System.in);

                    n = entradas.nextInt();

                    System.out.println("La probabilidad de que el producto se acabe pronto es de:");

                    System.out.println(calcularProbabilidad());

                    break;
                case 5:
                    garantia = 0;
                    licencia = 0;
                    n = 0;
                    recurso = null;
                    marca = null;
                    proveedor = null;
                    nuevo = null;
                    departamento = null;
                    unidades = 0;
                    utilizados = 0;

                    break;

            }

        }

    }

}
