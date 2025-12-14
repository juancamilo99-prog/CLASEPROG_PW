package Ejercicio9;

public class Modulos {

    int contarVocales(String texto){
        int vocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != 'a' && texto.charAt(i) != 'e' && texto.charAt(i) != 'i'
                    && texto.charAt(i) != 'o' && texto.charAt(i) != 'u') {
                continue;
            }
            vocales++;
        }
        System.out.println("la cantidad de consonantes que hay es de: "+vocales);
        return vocales;
    }

    boolean contienePalabra(String texto, String[] palabrasProhibidas){
        texto = texto.toLowerCase();
        for (String palabra : palabrasProhibidas) {
            if (texto.contains(palabra.toLowerCase() )) {
                return true;
            }
        }
        return false;
    }

    String primeraPalabraLarga(String[] texto, int longitudMinima){
        for (String palabra : texto) {
            if (palabra.length() > longitudMinima) {
                return palabra;
            }
        }
        return "No se encontro ninguna palabra larga";
    }
}
