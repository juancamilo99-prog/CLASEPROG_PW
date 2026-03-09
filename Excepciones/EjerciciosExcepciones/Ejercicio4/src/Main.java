import model.ValidarEdad;
import utils.ValidarEdadException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidarEdad validarEdad = new ValidarEdad();
        boolean fallo = false;
        do {
            try{
                System.out.println("Introduce tu edad:");
                int edad = Integer.parseInt(sc.nextLine());
                validarEdad.validadEdad(edad);
                fallo = false;
            }catch (ValidarEdadException e){
                System.err.println("Error " + e.getMessage());
                System.out.println("quieres introducir de nuevo tu edad? s/n");
                String contestacion = sc.nextLine();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
            }catch (NullPointerException e){
                sc.nextLine();
                System.err.println("Error al intentar introducir el edad");
                System.out.println("quieres introducir el edad? s/n");
                String contestacion = sc.nextLine();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
                sc.close();
            }
        }while (fallo);
    }
}
