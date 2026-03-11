import controller.APIcontroller;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el codigo de la persona");
        String codigo = sc.nextLine();
        APIcontroller apIcontroller = new APIcontroller();
        apIcontroller.obtenerDatos(codigo);
    }
}
