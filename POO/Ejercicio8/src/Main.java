import model.Cliente;
import model.Direccion;

public class Main {
    static void main(String[] args) {
        /*Crea una clase Direccion con atributos calle, ciudad y codigoPostal. Luego crea una clase
        Cliente que tenga como atributos nombre, email y un objeto Direccion.
        Implementa un metodo para mostrar todos los datos del cliente incluyendo su dirección.*/

        Cliente cliente = new Cliente("Carlos Ruiz", "carlos.ruis@gmail.com");
        cliente.mostrarDatosCliente();
    }
}
