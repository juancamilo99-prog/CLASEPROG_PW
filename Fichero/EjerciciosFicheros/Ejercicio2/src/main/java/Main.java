import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        System.out.println("Introduce la ruta del archivo");
        String ruta = scanner.nextLine();
        System.out.println("Introduce la palabra a buscar: ");
        String palabra = scanner.nextLine();
        int veces = operaciones.buscarPalabra(ruta, palabra);
        System.out.printf("La palabra '%s' aparece %d veces en el archivo", palabra, veces);
    }
}
