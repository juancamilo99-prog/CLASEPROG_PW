import model.Producto;

public class Main {
    public static void main(String[] args) {
        /*Crea una clase Producto con atributos nombre, precio y cantidad.
        Sobrescribe el metodo toString() para mostrar la información del
        producto de forma legible. Crea varios productos
        y muéstralos usando System.out.println().*/

        //llamamos al objeto

        Producto producto1 = new Producto(1, "teclado",45.99, 3);
        Producto producto2 = new Producto(2, "raton",25.99, 6);
        Producto producto3 = new Producto(3, "monitor",299.99, 2);

        System.out.println("Producto 1: " + producto1.toString());
        System.out.println("Producto 2: " + producto2.toString());
        System.out.println("Producto 3: " + producto3.toString());

    }
}
