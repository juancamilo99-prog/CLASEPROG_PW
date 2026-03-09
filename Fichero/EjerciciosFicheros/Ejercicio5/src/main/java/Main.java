import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();
        Operaciones operaciones = new Operaciones();
        operaciones.contarLineas(ruta);
    }
}
