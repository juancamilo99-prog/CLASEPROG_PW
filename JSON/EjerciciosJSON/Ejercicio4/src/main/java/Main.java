import controller.APIController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        APIController apiController = new APIController();
        Scanner input = new Scanner(System.in);
        System.out.println("digite el id para la peticion del post");
        String id = input.nextLine();
        apiController.obtenerDatos(id);

    }
}
