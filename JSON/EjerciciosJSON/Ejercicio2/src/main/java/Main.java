import controller.APIController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        APIController controller = new APIController();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el limite de los productos a mostrar");
        String id = sc.nextLine();
        controller.obtenerProductos(id);

    }
}
