import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo:");
        String ruta = sc.nextLine();
        operaciones.leerFichero(ruta);
    }
}
