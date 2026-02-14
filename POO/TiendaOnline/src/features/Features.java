package features;

import model.Carrito;
import model.Cliente;
import model.Producto;

import java.util.Scanner;

public class Features {
    Scanner sc = new Scanner(System.in);
    Producto producto = new Producto();
    Producto producto1 = new Producto(1, "Portatil", 899.99, 5);
    Producto producto2 = new Producto(2, "Raton", 51.00, 8);
    Producto producto3 = new Producto(3, "Teclado", 45.99, 10);
    Producto[] productos = {producto1, producto2, producto3};

    Cliente cliente1 = new Cliente("ana martinez", "ana@email.com", new Carrito());
    Cliente cliente2 = new Cliente("juan camilo", "juan@email.com", new Carrito());
    Cliente[] clientes = {cliente1, cliente2};

    Carrito carrito = new Carrito();

    public Cliente comprobarCliente(Cliente[] clientes) {
        System.out.println("Introduce tu correo: ");
        String acceso = sc.nextLine();
        for (Cliente c : clientes) {
            if (c.getEmail().equalsIgnoreCase(acceso)) {
                c.mostrarUsario();
                return c;
            }
        }
        return null;
    }

    public void listarProductos(Producto[] productos){
        System.out.println("Listando productos:");
        for (int i = 0; i < productos.length; i++) {
            Producto producto = productos[i];
            producto.mostrarProducto();
        }
    }

    public void menu(){
        Cliente clienteActual = null;
        while (clienteActual==null){
            clienteActual = comprobarCliente(clientes);
            if (clienteActual == null){
                System.out.println("No existe el cliente");
                System.out.println("intentalo de nuevo");
                sc.nextLine();
            }
        }
        sc.nextLine();
        int opcion;
        do {
            System.out.println("------------------------------");
            System.out.println("Usuario: "+clienteActual.getNombreCliente());
            System.out.printf("---- MENU DE LA TIENDA ----\n" +
                    "1. listar producto\n" +
                    "2. añadir producto\n" +
                    "3. mostrar carrito\n" +
                    "4. salir del usuario\n" +
                    "5. salir\n");
            opcion = sc.nextInt();
            switch (opcion){
                case 1: {
                    listarProductos(productos);
                    break;
                }
                case 2: {
                    anadirProducto(productos, carrito, clienteActual);
                    break;
                }
                case 3: {
                    mostrarCarrito(carrito, clienteActual);
                    break;
                }
                case 4: {
                    comprobarCliente(clientes);
                    sc.nextLine();
                    break;
                }
                case 5: {
                    System.out.println("saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida");
                }
            }
        }while (opcion != 4);
    }

    public void anadirProducto(Producto[] producto, Carrito carrito, Cliente cliente){
        sc.nextLine();
        System.out.println("Que producto quieres añadir al carrito?");
        String productoAnadir = sc.nextLine();
        boolean existe = false;
        for (int i = 0; i < producto.length; i++) {
            if (productoAnadir.equalsIgnoreCase(producto[i].getNombre())) {
                existe = true;
                System.out.println("Producto encontrado...");
                System.out.println("Nombre: " + producto[i].getNombre());
                System.out.println("Precio: " + producto[i].getPrecio());
                System.out.println("Stock: " + producto[i].getStock());
                if (producto[i].getStock() < 0) {
                    System.out.println("Producto sin stock...");
                    System.out.println("Pulsa ENTER para volver al menu..");
                    sc.nextLine();
                    return;
                }
                System.out.println("---------------------------");
                System.out.println("Seguro deseas añadir este producto?");
                String deseas = sc.nextLine();
                if (deseas.equalsIgnoreCase("si")) {
                    producto[i].restarStock();
                    carrito.setCodigo((int) (Math.random()*11)+1);
                    carrito.anadirProducto(producto[i]);
                    carrito.sumarStock();
                    System.out.println("Carrito: ");
                    System.out.println("Nombre: " + producto[i].getNombre());
                    System.out.println("Cantidad del carrito: " + carrito.getCantidad());
                    System.out.println("Producto añadido correctamente...");
                }else {
                    System.out.println("Producto cancelado.");
                }
                System.out.println("Pulsa ENTER para volver al menu..");
                sc.nextLine();
                break;
            }
        }

        if (!existe) {
            System.out.println("Producto no encontrado...");
            System.out.println("Pulsa ENTER para volver al menu..");
            sc.nextLine();
        }
    }

    public void mostrarCarrito(Carrito carritos, Cliente cliente){
        System.out.println("Carrito");
        System.out.println("Productos:");
        System.out.println("ID CARRITO: " + carrito.getCodigo());
        System.out.println("usuario: " + cliente.getNombreCliente());
            if (carritos.getProductos() != null) {
                carrito.mostrarCarritos();
            }else {
                System.out.println("No existen carritos...");
            }
        System.out.println("----------------------------------");
    }
}

