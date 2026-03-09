import model.validarNumeros;
import utils.validarNumerosExcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        validarNumeros validarnumeros = new validarNumeros();
        Scanner sc = new Scanner(System.in);
        boolean fallo = false;
        do {
            try{
                System.out.println("Digite el primer numero: ");
                int op1 = Integer.parseInt(sc.nextLine());
                System.out.println("Digite el segundo numero: ");
                int op2 = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce la operacion (+,-,*,/): ");
                char op = sc.nextLine().charAt(0);
                validarnumeros.validar(op1, op2, op);
                fallo = false;
            }catch (InputMismatchException e){
                System.err.println("Error "+e.getMessage());
                System.out.println("quieres ingresar los datos de nuevo? s/n");
                String contestacion =  sc.nextLine();
                if (contestacion.equals("s")){
                    fallo = true;
                }
            }catch (ArithmeticException e){
                System.err.println("Error: No se puede dividir por 0 " +e.getMessage());
                System.out.println("quieres ingresar los datos de nuevo? s/n");
                String contestacion =  sc.nextLine();
                if (contestacion.equals("s")){
                    fallo = true;
                }
            }catch (NumberFormatException e){
                System.err.println("Error entrada no numerica"+e.getMessage());
                System.out.println("quieres ingresar los datos de nuevo? s/n");
                String contestacion =  sc.nextLine();
                if (contestacion.equals("s")){
                    fallo = true;
                }
            }catch (validarNumerosExcepcion e){
                sc.nextLine();
                System.err.println("Error operacion incorrecta"+e.getMessage());
                System.out.println("quieres ingresar los datos de nuevo? s/n");
                String contestacion =  sc.nextLine();
                if (contestacion.equals("s")){
                    fallo = true;
                }
            } finally {
                System.out.println("Fin del programa");
            }
        }while (fallo);

    }
}
