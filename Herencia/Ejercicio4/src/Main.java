import model.Circulo;
import model.Cuadrado;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circulo", 5.0);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 4.0);

        circulo.calcularArea();
        System.out.println("---------------");
        cuadrado.calcularArea();
    }
}
