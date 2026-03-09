import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        System.out.println("introduce la ruta de origen");
        String origen = sc.nextLine();
        System.out.println("introduce la ruta de destino");
        String destino = sc.nextLine();
        operaciones.copiarFicheroenDos(origen, destino);

    }
}
