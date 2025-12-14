package Ejercicio9;

import java.util.Arrays;

public class Main {
    /*Objetivo:** Crear varios métodos modulares que analicen un texto y usen `return`, `break` y `continue`.

     **Requisitos:**

     1. Crea un metodo `int contarVocales(String texto)` que cuente vocales, usando `continue` para consonantes.
     2. Crea un metodo `boolean contienePalabraProhibida(String texto, String[] palabrasProhibidas)` que use `return true` en cuanto encuentre una palabra prohibida.
     3. Crea un metodo `String primeraPalabraLarga(String texto, int longitudMinima)` que busque y devuelva la primera palabra que supere la longitud mínima usando `return`.
     4. En el `main`, prueba todos los métodos con diferentes textos.*/
    static void main(String[] args) {
        Modulos modulos = new Modulos();
        String[] texto = {"Ejercicios","Repositorio","Vivienda","Comida","Dinero","Musica"};
        String palabraProhibida = "Ejercicios";
        int longitudMinima = 10;
        modulos.contarVocales(Arrays.toString(texto));
        System.out.println("contiene palabra prohibida: " +modulos.contienePalabra(palabraProhibida, texto));
        System.out.println("la primera palabra larga es: "+modulos.primeraPalabraLarga(texto,longitudMinima));


    }
}
