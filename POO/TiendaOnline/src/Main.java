import features.Features;
import model.Producto;

public class Main {
    static void main(String[] args) {
        /*Crea un sistema de tienda online con las clases: Producto
        (codigo, nombre, precio, stock), Cliente (nombre, email, carrito)
        y Carrito (lista de productos, cantidades).
        Implementa métodos para añadir productos al carrito,
        eliminarlos, calcular el total y finalizar la compra
        (actualizando el stock). Simula una compra completa.*/

        Features features = new Features();
        features.menu();
    }
}
