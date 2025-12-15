import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Control control = new Control(50);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf("--MENU AGENDA--\n" +
                    "1. Agregar persona\n" +
                    "2. Buscar persona\n" +
                    "3. Borrar persona\n" +
                    "4. Listar persona\n" +
                    "5. Salir\n");
            System.out.println("Elige una opcion:");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 5) {
                System.out.println("opcion no disponible.");
            }
            switch (opcion) {
                case 1 -> control.agregarPersona(sc);
                case 2 -> control.buscarPersona(sc);
                case 3 -> {control.eliminarPersona(sc);}
                case 4 -> control.listarContacto();
                case 5 -> {
                    System.out.println("saliendo...");
                    System.exit(0);}
            }
        }while (opcion != 5);

    }
}
