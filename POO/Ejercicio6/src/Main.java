import model.Estudiante;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*Crea una clase Estudiante con atributos privados nombre, edad y nota. La nota debe estar entre 0 y 10.
        Implementa el setter de nota validando que esté en el rango correcto
        (si no lo está, muestra un mensaje de error). Crea un objeto
        y prueba con diferentes valores.*/

        Scanner sc = new Scanner(System.in);
        //llamaos al objeto
        Estudiante estudiante = new Estudiante("Laura fernandez", 23, 0);
        boolean estado = false;
        do {
            System.out.println("Introduce la nota del estudiante: ");
            double nota_estudiante = sc.nextDouble();
            if (nota_estudiante > 0 && nota_estudiante <= 10) {
                estudiante.setNota(nota_estudiante);
                System.out.println("la nota ha sido guardada correctamente");
                estado = true;
            }else {
                System.out.println("la nota debe estar entre 0 y 10");
                System.out.println("nota actual: " + estudiante.getNota());
            }
        }while (!estado);

        System.out.println("El nombre del estudiante es: "+estudiante.getNombre());
        System.out.println("La edad del estudiante es: "+estudiante.getEdad());
        System.out.println("nota actual: " + estudiante.getNota());

    }
}
