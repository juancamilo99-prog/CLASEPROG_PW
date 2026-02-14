package model;

public final class Circulo extends Figura {

    private double radio;
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando area...");
        System.out.printf("%s con radio: %.1f\n",getNombre(), radio);
        System.out.printf("Area: %.2f\n",Math.PI* Math.pow(radio, 2));
    }
}
