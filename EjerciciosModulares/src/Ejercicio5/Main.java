package Ejercicio5;

import java.util.Scanner;

public class Main {
    /*Objetivo:** Crear un metodo que simule un sistema de login usando `break` cuando el login sea exitoso.

     **Requisitos:**

     1. Crea un metodo `boolean intentarLogin(String usuarioCorrecto, String passwordCorrecta)`.
     2. El usuario tiene 3 intentos máximo.
     3. Usa un bucle `for` para los intentos.
     4. Simula el ingreso de usuario y contraseña (puedes usar valores hardcodeados diferentes en cada intento).
     5. Si las credenciales son correctas, usa `break` y devuelve `true`.
     6. Si se agotan los intentos, devuelve `false`.*/
    static void main(String[] args) {
        final String usuarioCorrecto = "monterocamilo";
        final String claveCorrecta = "montero123";
        Validator validator = new Validator();
        validator.intentarLogin(usuarioCorrecto, claveCorrecta);

    }
}
