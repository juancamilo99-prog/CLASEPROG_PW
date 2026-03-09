import model.Conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Conversion conversion = new Conversion();
        Scanner input = new Scanner(System.in);
        boolean fallo = false;
        do {
            try{
                System.out.println("Digite um numero: ");
                int num = input.nextInt();
                conversion.numeroAtexto(num);
                fallo = false;
            }catch (InputMismatchException e){
                input.nextLine();
                System.err.println("Error al intentar ingresar datos");
                System.out.println("quieres ingresar de nuevo los datos? s/n");
                String denuevo = input.nextLine();
                if(denuevo.equals("s")){
                    fallo = true;
                }
            }catch (NumberFormatException e){
                input.nextLine();
                System.err.println("Error al intentar ingresar datos");
                System.out.println("quieres ingresar de nuevo los datos? s/n");
                String denuevo = input.nextLine();
                if(denuevo.equals("s")){
                    fallo = true;
                }
            }
        }while(fallo);
    }
}
