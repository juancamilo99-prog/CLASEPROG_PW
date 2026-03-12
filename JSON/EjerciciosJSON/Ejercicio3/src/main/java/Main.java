import controller.APIController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        APIController apiController = new APIController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        String id = scanner.nextLine();
        apiController.obtenerDatosporID(id);

    }
}
