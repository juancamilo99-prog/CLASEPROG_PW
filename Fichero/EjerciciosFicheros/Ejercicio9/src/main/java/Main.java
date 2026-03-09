import controller.Agenda;
import model.Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion = -1;
        do {
            System.out.println("1. añadir usuarios");
            System.out.println("2. exportar usuarios");
            System.out.println("3. listar usuarios");
            System.out.println("4. salir");
            System.out.println("elige una opcion");
            try{
                opcion = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("error en el numero de opcion");
                opcion = -1;
            }
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresa el nombre del usuario");
                    String nombre = scanner.next();
                    System.out.println("Ingresa el apellido del usuario");
                    String apellido = scanner.next();
                    System.out.println("Ingresa el dni del usuario");
                    String dni = scanner.next();
                    agenda.agregarUsuario(new Usuario(nombre, apellido, dni));
                }
                case 2 -> {
                    System.out.println("exportando usuarios");
                    agenda.exportarUsuarios();
                }
                case 3 -> {
                    System.out.println("listando usuarios");
                    agenda.listarUsuarios();
                }
                case 4 -> {
                    System.out.println("salir");
                }
                default -> {
                    System.out.println("error en el numero de opcion");
                }
            }
        }while (opcion != 4);
    }
}
