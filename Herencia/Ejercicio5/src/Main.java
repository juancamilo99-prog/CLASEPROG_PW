import model.Desarrollador;
import model.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana garcia", 40000,10000);
        Desarrollador desarrollador = new Desarrollador("Luis Martinez",350000, "Java");

        gerente.mostrarDatos();
        System.out.println("---------------------------");
        desarrollador.mostrarDatos();

    }
}
