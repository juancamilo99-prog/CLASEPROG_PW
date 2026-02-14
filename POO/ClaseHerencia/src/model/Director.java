package model;

public class Director extends Persona implements Inspector{

    public Director() {
    }

    public Director(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void realizarInspeccion() {
        System.out.println("soy el jefe y asi inspecciono");
    }

    @Override
    public void saludar() {
        System.out.println("soy el jefe, yo mando");
    }
}
