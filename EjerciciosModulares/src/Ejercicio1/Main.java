package Ejercicio1;

import java.util.Scanner;

public class Main {
    /*Objetivo:Crear un metodo que valide una contraseña y use return
     para salir anticipadamente si no cumple los requisitos.
  Requisitos:
    1. Crea un metodo boolean validarContraseña(String password)
    2. La contraseña debe tener al menos 8 caracteres. Si no cumple,
        usa `return false` inmediatamente.
    3. Debe contener al menos una letra mayúscula. Si no cumple, usa `return false`.
    4. Debe contener al menos un número. Si no cumple, usa `return false`.
    5. Si pasa todas las validaciones, devuelve true.
    6. En el main, prueba el metodo con diferentes contraseñas y muestra si son válidas o no.*/

    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //llamamos al metodo
        Validator validator = new Validator();
        //inicializamos una variable donde se ingresaran las claves
        String password;
        //con un while pedimos la clave hasta que esta sea correcta y cumpla con todas
        //las condiciones
        do {
            System.out.println("Ingresa la clave");
            password = entrada.next();
        }while (!validator.ValidarClave(password));
            System.out.println("contraseña guardada correctamente");
    }
}
