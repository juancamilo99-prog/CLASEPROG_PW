import controller.Gestor;
import model.Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gestor gestor = new Gestor();
        int opcion = -1;
        do {
            System.out.println("1. añadir usuario");
            System.out.println("2. exportar usuarios");
            System.out.println("3. listar usuarios");
            System.out.println("4. importar usuarios");
            System.out.println("Indica que quieres hacer?");
            try {
                opcion = sc.nextInt();
            }catch (InputMismatchException e){
                opcion = -1;
            }
            switch (opcion) {
                case 1 ->{
                    System.out.println("indica el nombre: ");
                    String nombre = sc.next();
                    System.out.println("indica el apellido: ");
                    String apellido = sc.next();
                    System.out.println("indica el dni: ");
                    String dni = sc.next();
                    gestor.addUsuario(new Usuario(nombre, apellido, dni));
                }
                case 2 ->{
                    gestor.exportar();
                }
                case 3 ->{
                    gestor.listarUsuarios();
                }
                case 4 ->{
                    gestor.importar();
                }
                default -> {
                    System.out.println("caso no contemplado");
                    sc.nextLine();
                }
            }
        }while (opcion != 5);
    }
}
