import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Control control = new Control();
        Scanner sc = new Scanner(System.in);
        ArrayList<Object[]> listaContacto = new ArrayList<>();
        int opcion;
        do {
            System.out.printf("--MENU AGENDA--\n" +
                    "1. Agregar persona\n" +
                    "2, Buscar persona\n" +
                    "3. Borrar persona\n" +
                    "4, Listar persona\n" +
                    "5. Salir\n");
            System.out.println("Elige una opcion:");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 5) {
                System.out.println("opcion no disponible.");
            }
            switch (opcion) {
                case 1 -> control.agregarPersona(listaContacto, sc);
                case 2 -> control.buscarPersona(listaContacto, sc);
                case 3 -> {control.eliminarPersona(listaContacto, sc);}
                case 4 -> control.listarContacto(listaContacto, sc);
                case 5 -> {
                    System.out.println("saliendo...");
                    System.exit(0);}
            }
        }while (opcion != 5);

    }
}
