package model;

public class Desarrollador extends Empleado{

    private String lenguajePrincipal;

    public Desarrollador() {
    }

    public Desarrollador(String nombre, double salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Puesto: Desarrollador");
        System.out.println("LenguajePrincipal: " + lenguajePrincipal);
    }
}
