import model.Operaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Scanner sc = new Scanner(System.in);
        boolean fallo = false;
        do {
            try {
                System.out.println("digite el dividendo:");
                double dividendo = sc.nextDouble();
                System.out.println("digite el divisor:");
                double divisor = sc.nextDouble();
                operaciones.calcularDivision(dividendo,divisor);
                fallo = false;
            }catch (InputMismatchException e){
                System.err.println("Error al intentar ingresar datos");
                System.out.println("quieres ingresar de nuevo los datos? s/n");
                String contestacion = sc.next();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
            }catch (ArithmeticException e){
                sc.nextLine();
                System.err.println("Error al intentar ingresar datos");
                System.out.println("quieres ingresar de nuevo los datos? s/n");
                String contestacion = sc.next();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
            }
        }while (fallo);
    }
}
