import model.Animal;
import model.Gato;
import model.Perro;

public class Main {
    static void main() {
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Mishi", 3);
        perro.mostrarPerro();
        System.out.println("-----------------");
        gato.mostrarGato();
    }
}
