import Features.Features;
import model.Libro;
import model.Usuario;

public class Main {
    static void main(String[] args) {
        /*Crea un sistema de biblioteca con las clases: Libro
        (titulo, autor, ISBN, disponible), Usuario (nombre, numeroSocio)
        y Prestamo (libro, usuario, fechaPrestamo).
        Implementa métodos para prestar un libro (si está disponible) y
        devolverlo. Crea varios libros y usuarios, realiza algunos préstamos y devoluciones.*/

        Features features = new Features();
        features.menu();
    }
}
