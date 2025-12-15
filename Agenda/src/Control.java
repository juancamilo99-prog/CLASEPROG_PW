import java.util.Scanner;

public class Control {
    //definimos los atributos de la clase
    private int capacidad; //numero maximo de contactos que puede tener la agenda
    private Contacto[] contactos; //array de objetos contactos
    private int contador = 0; // variable para saber cuantos contactos hay guardados
    //constructor
    public Control(int capacidad) {
        this.capacidad = capacidad;
        this.contactos = new Contacto[capacidad];
    }

    //agregar persona
    public void agregarPersona(Scanner sc) {
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
        //validamos que el dni no este vacio
        if (dni.isEmpty()){
            System.out.println("dni esta vacio, no se puede agregar");
            return;
        }
        //validamos que el email si existe no se pueda agregar
        if (existeEmail(email)){
            System.out.println("email existente, no se puede agregar");
            return;
        }
        //creacion y guardado del contacto
        Contacto contacto = new Contacto(nombre, apellido, telefono, dni, email);
        contactos[contador] = contacto; //se guarda en la posicion contador
        contador++; // se incrementa el contador para el siguiente contacto
        System.out.println("Agregado correctamente");
    }

    //LISTAR CONTACTOS
    public void listarContacto() {
        //validamos que haya datos, si no los hay arrojamos mensaje de que esta vacia
        if (contador == 0) {
            System.out.println("Agenda Vacia");
            return;
        }

        //recorremos las posiciones ocupadas e imprimimos cada contacto usando el toString() de contacto.
        for (int i = 0; i < contador; i++) {
            System.out.println((i+1) + ". " + contactos[i]);
        }
    }

    //BUSCAR PERSONAS POR DNI
    public void buscarPersona(Scanner sc) {
        if (contador == 0) {
            System.out.println("Agenda Vacia");
            return;
        }
        System.out.println("Introduce el dni a buscar");
        String dni = sc.next();
        //recorremos el array
        for (int i = 0; i < contador; i++) {
            //comparamos dos cadenas de texto para saber si el dni que se ha introducido coincide con alguno
            //en concreto
            if (dni.equals(contactos[i].getDni())) {
                Contacto contacto = contactos[i];
                System.out.println("contacto encontrado");
                System.out.println("Nombre: "+contacto.getNombre());
                System.out.println("Apellido: "+contacto.getApellido());
                System.out.println("Telefono: "+contacto.getTelefono());
                System.out.println("DNI: "+contacto.getDni());
                System.out.println("EMAIL: "+contacto.getEmail());
            }
        }
    }

    public void eliminarPersona(Scanner sc) {
        //validar si la agenda esta vacia
        if (contador == 0) {
            System.out.println("Agenda Vacia");
            return;
        }
        System.out.println("Introduce el DNI a eliminar");
        String dni = sc.next();
        //recorremos la lista encontramos el dni y se borra la posicion del contador
        for (int i = 0; i < contador; i++) {
            if (dni.equals(contactos[i].getDni())) {
                contador--;
            }
        }
    }

    //VERIFICADOR DE EMAIL
     public boolean existeEmail(String email) {
        for (int i = 0; i < contador; i++) {
            if (email.equals(contactos[i].getEmail())) {
                return true;
            }
        }
        return false;
     }

}
