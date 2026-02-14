package model;

public class Usuario {

    private String nombre;
    private int numero_socio;

    public Usuario() {
    }

    public Usuario(String nombre, int numero_socio) {
        this.nombre = nombre;
        this.numero_socio = numero_socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_socio() {
        return numero_socio;
    }

    public void setNumero_socio(int numero_socio) {
        this.numero_socio = numero_socio;
    }

    public void mostrarUsuario() {
        System.out.println("Bievenido!");
        System.out.println("Nombre: " + nombre);
        System.out.println("numero socio: " + numero_socio);
        System.out.println("-------------------------");
    }
}

