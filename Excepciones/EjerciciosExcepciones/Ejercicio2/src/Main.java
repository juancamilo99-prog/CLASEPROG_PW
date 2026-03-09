import model.Posicion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Posicion posicion = new Posicion();
        boolean fallo = false;
        do{
            try{
                System.out.println("Introduce el numero de la posicion(0-4):");
                int numero = sc.nextInt();
                posicion.mostrarPosicion(numero);
                fallo = false;
            }catch (InputMismatchException e){
                sc.nextLine();
                System.err.println("Error al intentar ingresar datos");
                System.out.println("quieres ingresar de nuevo los datos? s/n");
                String contestacion =  sc.next();
                if(contestacion.equals("s")){
                    fallo = true;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Error al intentar ingresar datos");
                System.out.println("quieres ingresar de nuevo los datos? s/n");
                String contestacion =  sc.next();
                if(contestacion.equals("s")){
                    fallo = true;
                }
            }
        }while (fallo);
    }
}