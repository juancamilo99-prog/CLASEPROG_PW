import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tratar excepciones
        //crea un fichero con el nombre y ruta indicada.
            //que pasa si se encuentra un fallo de no existe la ruta
            //que pasa si no tienes permisos de escritura en la ruta

        //vamos a realizar una suma, una multiplicacion, una division
        Operaciones operaciones = new Operaciones();
        boolean fallo = false;
        do {
            try {
                System.out.println("Ingresa el operando1: ");
                int operando1 = scanner.nextInt();
                System.out.println("Ingresa el operando 2:");
                int operando2 = scanner.nextInt();
                //obliga no una obligatoria
                operaciones.sumar(operando1, operando2); //va con la etiqueta que puede provocar error Arth
            } catch (InputMismatchException e) {
                System.err.println("Error al intentar ingresar los datos");
                System.out.println("quieres ingresar los datos nuevamente? s/n");
                String contestacion = scanner.next();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
            } catch (ArithmeticException e) {
                System.err.println("Error division entre 0, le pongo solucion");
                System.out.println("quieres ingresar los datos nuevamente? s/n");
                String contestacion = scanner.next();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
            }

        }while (fallo);
    }
}
