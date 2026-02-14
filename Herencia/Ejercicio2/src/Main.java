import model.Coche;
import model.Vehiculo;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        Coche coche1 = new Coche("Ford", "Focus", 5);
        Coche coche2 = new Coche("Seat", "Ibiza", 3);
        vehiculo.mostrarVehiculo();
        coche1.mostrarVechiulo();
        coche2.mostrarVechiulo();
    }
}
