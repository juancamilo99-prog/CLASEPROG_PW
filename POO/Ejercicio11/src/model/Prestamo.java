package model;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Prestamo {

    private Usuario usuario;
    private Libro libro;
    private LocalDateTime fecha;

    public Prestamo() {
    }

    public Prestamo(Usuario usuario, Libro libro, LocalDateTime fecha) {
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void mostrarPrestamo() {
        System.out.println("Prestamo realizado por");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha: " + fecha);
        System.out.println("-------------------------");
    }

    public void mostrarDevolucion(){
        System.out.println("Devolucion realizada por");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha: " + fecha);
        System.out.println("-------------------------");
    }
}
