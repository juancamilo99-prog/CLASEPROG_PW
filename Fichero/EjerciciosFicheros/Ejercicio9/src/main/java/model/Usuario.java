package model;

public class Usuario {

    private String nombre, apellido, dni;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.printf("Nombre: %s\n" +
                "Apellido: %s\n" +
                "DNI: %s\n", nombre, apellido, dni);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", nombre, apellido, dni);
    }
}
