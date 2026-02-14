package model;

public class Cliente {

    private String nombreCliente;
    private String email;
    private Carrito carrito;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String email, Carrito carrito) {
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.carrito = carrito;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void mostrarUsario(){
        System.out.println("Bienvenido!");
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Email: " + email);
        System.out.println("Carrito: " + carrito.getCodigo());
        System.out.println("----------------------------");
    }
}
