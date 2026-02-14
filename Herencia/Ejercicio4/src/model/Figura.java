package model;

public abstract class Figura {

    private String nombre;

    public Figura() {
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularArea();
}
