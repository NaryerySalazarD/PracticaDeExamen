
public class TesterTareaSemana9 {

    public static void main(String args[]) {
        TEstudiante e = new TEstudiante();
        TMenu menu = new TMenu();
        TMenu opcion = new TMenu();
        while (true) {

            menu.opcionesMenu();
            opcion.ingresarOpcion();
            switch (opcion.opcion) {
                case 1:
                    e.agregarNota();
                    break;
                case 2:
                    e.eliminarNota();
                    break;
                case 3:
                    e.notasRegistradas();
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }
           

        }

    }
}
