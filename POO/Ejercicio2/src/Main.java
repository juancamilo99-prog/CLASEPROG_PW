import model.Persona;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona(1,"ana", 30);
        p1.mostrarDatos();
        System.out.println("Ingrese el nombre del persona: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el edad del persona: ");
        int edad = sc.nextInt();
        p1.modificarDatos(name, edad);
        p1.mostrarDatos();



    }
}
