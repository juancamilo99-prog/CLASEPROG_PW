import model.Rectangulo;

import java.util.Scanner;

public class Main {
    /*
    * Crea una clase Rectangulo con atributos base y altura.
    * Añade métodos calcularArea() y calcularPerimetro()
    * que devuelvan el área y el perímetro respectivamente.
    * Crea un objeto y muestra los resultados. */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el valor de la base: ");
        int b = sc.nextInt();
        System.out.println("digite el valor de la altura: ");
        int a = sc.nextInt();
        Rectangulo r = new Rectangulo();
        r.setBase(b);
        r.setAltura(a);
        r.mostrarArea(r.calcularArea(b,a));
        r.mostrarPerimetro(r.calcularPerimetro(b,a));
    }
}
