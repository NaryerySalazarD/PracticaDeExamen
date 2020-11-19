
import java.util.Scanner;

public class TEstudiante {

    int carnet;
    int nota;
    int estudiante = 0;
    int[] notas;
    int[] carnets;
    Scanner entrada = new Scanner(System.in);

    public TEstudiante() {
        notas = new int[5];
        carnets = new int[5];
        for (int i = 0; i < carnets.length; i++) {
            carnets[i] = 0;
            notas[i] = 0;
        }

    }

    public void agregarNota() {
        System.out.println("1.Agregar una nota.");
        System.out.println("Agregue el carnet del estudiante: ");

        carnet = entrada.nextInt();
        carnets[estudiante] = carnet;
        System.out.println("El carnet del estudiante es: ");
        System.out.println(carnet);

        System.out.println("Agregue la nota del estudiante: ");

        nota = entrada.nextInt();
        notas[estudiante] = nota;
        System.out.println("La nota del estudiante es: ");
        System.out.println(nota);
        estudiante = estudiante + 1;
    }

    public void eliminarNota(){
        System.out.println("2.Eliminar una nota.");
                    estudiante = estudiante - 1;
                    carnets[estudiante] = 0;
                    notas[estudiante] = 0;
    }
    public void notasRegistradas() {
         System.out.println("3.Mostrar las notas registradas.");
        for (int i = 0; i < carnets.length; i++) {

            if (carnets[i] != 0) {
                System.out.println("Carnet: " + carnets[i]);
            }
            if (notas[i] != 0) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(int estudiante) {
        this.estudiante = estudiante;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int[] getCarnets() {
        return carnets;
    }

    public void setCarnets(int[] carnets) {
        this.carnets = carnets;
    }
}
