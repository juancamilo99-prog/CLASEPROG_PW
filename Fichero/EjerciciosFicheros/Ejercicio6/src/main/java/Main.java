import controller.Operaciones;
import model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        operaciones.agregarUsuario(new Usuario("Ana Garcia", 20, 8.5));
        operaciones.agregarUsuario(new Usuario("Carlos Martin", 19, 7.2));
        operaciones.agregarUsuario(new Usuario("Laura Perez", 21, 9.3));
        operaciones.exportarDocumentos();
        System.out.println("==========================");
        operaciones.listarUsuarios();

    }
}
