package model;

public class Cliente {
    private String nombre;
    private String email;


   Direccion direccion = new Direccion("Calle mayor 15", "Madrid", 28001);

    public Cliente() {
    }

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarDatosCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.printf("Direccion: %s, %s, %d", direccion.getCalle(), direccion.getCiudad(), direccion.getCodigoPostal());
    }

}
