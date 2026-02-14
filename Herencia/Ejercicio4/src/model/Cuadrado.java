package model;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando area...");
        System.out.printf("%s con lado: %.2f\n",getNombre(),lado);
        System.out.println("Area: "+lado*lado);
    }
}
