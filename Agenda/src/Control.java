import java.util.ArrayList;
import java.util.Scanner;

public class Control {
    public void agregarPersona(ArrayList<Object[]> contacto,Scanner sc) {
        System.out.println("Ingresa el nombre del persona");
        String nombre = sc.next();
        System.out.println("Ingresa el apellido del persona");
        String apellido = sc.next();
        System.out.println("Ingresa el telefono:");
        int telefono = sc.nextInt();
        System.out.println("Ingresa el DNI: ");
        String dni = sc.next();
        System.out.println("Ingresa el email del persona");
        String email = sc.next();
        if (dni.isEmpty()){
            System.out.println("dni esta vacio, no se puede agregar");
            return;
        }
        contacto.add(new Object[]{nombre,apellido,telefono,dni,email});
        System.out.println("Agregado correctamente");
    }

    public void listarContacto(ArrayList<Object[]> contacto,Scanner sc) {
        if (contacto.isEmpty()) {
            System.out.println("Agenda Vacia");
            return;
        }

        for (Object[] contactos : contacto) {
            System.out.println("Imprimiendo contactos");
            System.out.println("\tNombre: " + contactos[0]);
            System.out.println("\tApellido: " + contactos[1]);
            System.out.println("\tTelefono: " + contactos[2]);
            System.out.println("\tDNI: " + contactos[3]);
            System.out.println("\tCorreo: " + contactos[4]);
            System.out.println("Listado correcto!");
        }
    }

    public void buscarPersona(ArrayList<Object[]> contacto,Scanner sc) {
        if (contacto.isEmpty()) {
            System.out.println("Agenda Vacia");
            return;
        }
        System.out.println("Introduce el dni a buscar");
        String dni = sc.next();
        for (int i = 0; i < contacto.size(); i++) {
            if (contacto.get(i)[3].equals(dni)) {
                System.out.println("Nombre: " + contacto.get(i)[0]);
                System.out.println("Apellido: " + contacto.get(i)[1]);
                System.out.println("Telefono: " + contacto.get(i)[2]);
            }
        }
    }

    public void eliminarPersona(ArrayList<Object[]> contacto,Scanner sc) {
        if (contacto.isEmpty()) {
            System.out.println("Agenda Vacia");
            return;
        }
        System.out.println("Introduce el DNI a eliminar");
        String dni = sc.next();
        for (int i = 0; i < contacto.size(); i++) {
            if (contacto.get(i)[3].equals(dni)) {
                contacto.remove(i);
            }
        }
    }

}
