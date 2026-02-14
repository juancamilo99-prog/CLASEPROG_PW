package model;

import model.Producto;
import java.util.Arrays;

public class Carrito {

    private int codigo;
    private Producto[] productos;
    private int cantidad;

    public Carrito() {
        productos = new Producto[10];
        cantidad = 0;
    }

    public Carrito(int codigo, Producto[] productos, int cantidad) {
        this.codigo = codigo;
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarCarritos() {
        if (cantidad == 0) {
            System.out.println("carrito vacio...");
            return;
        }
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                System.out.println("-"+productos[i].getNombre());
            }
        }
        System.out.printf("Total: %.2f\n", calcularTotal());
        System.out.println("cantidad de productos: " + cantidad);
    }

    public void anadirProducto(Producto producto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                return;
            }
        }
    }

    public void sumarStock() {
        cantidad = cantidad +1;
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }
}

