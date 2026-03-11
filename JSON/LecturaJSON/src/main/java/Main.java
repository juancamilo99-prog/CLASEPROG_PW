import controller.APIController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        APIController controller = new APIController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("estas con todas las ligas de las que tengo informacion");
        controller.obtenerLigas();
        System.out.println("de que liga quuieres consultar su tabla?");
        String id = scanner.nextLine();
        controller.obtenerClasificacionCompleta(id);
    }
}
