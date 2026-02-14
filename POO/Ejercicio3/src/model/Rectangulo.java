package model;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //metodos
    public int calcularArea(int base, int altura) {
        int area;
        return area = base * altura;
    }

    public int calcularPerimetro(int base, int altura) {
        int perimetro;
        return perimetro = 2 * (base+altura);
    }

    public void mostrarArea(int area) {
        System.out.println("la base es: "+getBase());
        System.out.println("la altura es: "+getAltura());
        System.out.println("el area es "+area);
    }

    public void mostrarPerimetro(int perimetro) {
        System.out.println("el perimetro es: "+perimetro);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
