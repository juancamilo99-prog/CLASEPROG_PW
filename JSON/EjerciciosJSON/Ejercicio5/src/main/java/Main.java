import controller.APIController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        APIController controller = new APIController();
        System.out.println("Introduce el pokemon a buscar:");
        String nombre = sc.nextLine();
        controller.obtenerDatos(nombre);
    }
}
