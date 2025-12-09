package Ejercicio5;

import java.util.Scanner;

public class Validator {
   Scanner entrada = new Scanner(System.in);
   public boolean intentarLogin(String usuarioCorrecto, String passwordCorrecta){
       int intentos = 3;
       String usuario, clave;
       for (int i = 0; i < 3; i++) {
           System.out.println("Ingrese el usuario:");
           usuario = entrada.next();
           System.out.println("Ingrese la clave:");
           clave = entrada.next();
           intentos--;
           if (usuario.equalsIgnoreCase(usuarioCorrecto) && clave.equalsIgnoreCase(passwordCorrecta)){
               System.out.println("Login accedido");
               break;
           }else {
               System.out.println("Usuario incorrecto.");
               System.out.printf("Te quedan %d intentos\n",intentos);
           }
       }
       return true;
   }
}
