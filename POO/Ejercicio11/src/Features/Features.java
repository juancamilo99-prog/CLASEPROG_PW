package Features;

import model.Libro;
import model.Prestamo;
import model.Usuario;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Features {
    //libros
    Scanner sc = new Scanner(System.in);
    Libro libro1 = new Libro("Don quijote", 001, "Miguel de cervantes", false);
    Libro libro2 = new Libro("cien años de soledad", 002, "Gabriel garcia", true);
    Libro libro3 = new Libro("1984", 003, "George Orwell", true);
    Libro[] libros = {libro1, libro2, libro3};

    //Usuarios
    Usuario usuario1 = new Usuario("juan perez", 101);
    Usuario usuario2 = new Usuario("juan camilo", 102);
    Usuario[] usuarios = {usuario1, usuario2};

    //Prestamo
    Prestamo[] prestamos = new Prestamo[10];

    public Usuario comprobarUsuario(Usuario[] usuarios) {
        System.out.println("Que numero de socio tienes?: ");
        int socio = sc.nextInt();
        for (Usuario usuario : usuarios) {
            if (usuario.getNumero_socio() == socio) {
                usuario.mostrarUsuario();
                return usuario;
            }
        }
        return null;
    }

    public void menu() {
        Usuario usuarioActual = null;
        while (usuarioActual == null) {
            usuarioActual = comprobarUsuario(usuarios);
            if (usuarioActual == null) {
                System.err.println("Usuario no encontrado");
                System.out.println("intentalo de nuevo...");
                sc.nextLine();
            }
        }
        //menu
        sc.nextLine();
        int opcion;
        do {
            System.out.println("usuario: " + usuarioActual.getNombre());
            System.out.println("Menu de biblioteca");
            System.out.println("Seleccion una opcion");
            System.out.println("1. prestar libro");
            System.out.println("2. devolver libro");
            System.out.println("3. mostrar libro disponibles");
            System.out.println("4. salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 : {prestarLibro(libros, prestamos, usuarioActual);
                    break;}
                case 2 : {devolverLibros(libros, prestamos, usuarioActual);
                    break;}
                case 3: {mostrarLibros(libros);
                    break;}
                case 4 : {System.out.println("saliendo del programa...");
                    break;}
                default : {System.out.println("Opcion no valida");}
            }
        }while (opcion != 4);
    }

    //metodo prestar libro
    public void prestarLibro(Libro[] libros, Prestamo[] prestamos, Usuario usuarioActual) {
        sc.nextLine(); //limpiar el buffer
        System.out.println("Que libro quieres tomar prestado?");
        String prestado = sc.nextLine();
        boolean comprobarDisponibile = false;
        for (int i = 0; i < libros.length; i++) {
            if (prestado.equalsIgnoreCase(libros[i].getTitulo())) {
                comprobarDisponibile = true;
                System.out.println("Libro encontrado.");
                System.out.println("Titulo: " + libros[i].getTitulo());
                System.out.println("Autor: " + libros[i].getAutor());
                System.out.println("ISBN: " + libros[i].getIsbn());
                System.out.println("Disponibilidad: "+libros[i].isDisponible());
                if (!libros[i].isDisponible()) {
                    System.out.println("Libro no disponible.");
                    System.out.println("Pulsa ENTER para volver al menu");
                    sc.nextLine();
                    return;
                }
                System.out.println("-----------------------");
                System.out.println("Deseas tomarlo? (si/no)");
                String deseas = sc.nextLine();
                if (deseas.equalsIgnoreCase("si")) {
                    libros[i].setDisponible(false);
                    Prestamo nuevoPrestamo = new Prestamo();
                    nuevoPrestamo.setUsuario(usuarioActual);
                    nuevoPrestamo.setLibro(libros[i]);
                    nuevoPrestamo.setFecha(LocalDateTime.now());
                    for (int j = 0; j < prestamos.length; j++) {
                        if (prestamos[j] == null){
                            prestamos[j] = nuevoPrestamo;
                            break;
                        }
                    }
                    nuevoPrestamo.mostrarPrestamo();
                    System.out.println("Prestamos hecho correctamente.");
                }else {
                    System.out.println("Prestamo cancelado");
                }

                System.out.println("Pulsa ENTER para volver al menu");
                sc.nextLine();
                break;
            }
        }

        if (!comprobarDisponibile) {
            System.out.println("Libro no disponible.");
            System.out.println("Pulsa ENTER para volver al menu");
            sc.nextLine();
        }
    }

    //metodo devolver libros
    public void devolverLibros(Libro[] libros, Prestamo[] prestamos, Usuario usuarioActual) {
        sc.nextLine();
        System.out.println("Que libro quieres devolver?");
        String devolver = sc.nextLine();
        boolean comprobarDisponibile = false;
        for (int i = 0; i < libros.length; i++) {
            if (devolver.equalsIgnoreCase(libros[i].getTitulo())) {
                comprobarDisponibile = true;
                System.out.println("Libro encontrado.");
                System.out.println("Titulo: " + libros[i].getTitulo());
                System.out.println("Autor: " + libros[i].getAutor());
                System.out.println("ISBN: " + libros[i].getIsbn());
                System.out.println("-----------------------");
                System.out.println("Deseas devolver? (si/no)");
                String deseas = sc.nextLine();
                if (deseas.equalsIgnoreCase("si")){
                    libros[i].setDisponible(true);
                    Prestamo nuevaDevolucion = new Prestamo();
                    nuevaDevolucion.setUsuario(usuarioActual);
                    nuevaDevolucion.setLibro(libros[i]);
                    nuevaDevolucion.setFecha(LocalDateTime.now());
                    for (int j = 0; j < prestamos.length; j++) {
                        if (prestamos[j] == null){
                            prestamos[j] = nuevaDevolucion;
                            break;
                        }
                    }
                    nuevaDevolucion.mostrarDevolucion();
                    System.out.println("Libro devuelto correctamente.");
                }else  {
                    System.out.println("Devuelta cancelada");
                }
                System.out.println("Pulsa ENTER para volver al menu");
                sc.nextLine();
                break;
            }
        }
        if (!comprobarDisponibile) {
            System.out.println("Libro no disponible.");
            System.out.println("Pulsa ENTER para volver al menu");
            sc.nextLine();
        }

    }

    //metodo mostrar libros disponibles
    public void mostrarLibros(Libro[] libros) {
        System.out.println("Libros disponibles:");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].isDisponible()) {
                Libro libro = libros[i];
                libro.mostrarLibro();
            }
        }
    }
}
