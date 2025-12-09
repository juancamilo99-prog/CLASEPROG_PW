package Ejercicio1;

public class Validator {
    public boolean ValidarClave(String password){
        //validamos la longitud del string que sea menor que 8 si cumple el boolean arroja un false
        if (password.length() < 8){
            System.out.println("La contraseña debe tener al menos 8 caracteres");
            return false;
        }
        //inicializamos las variables para encontrar la mayusculas y los numeros
        boolean mayus = false;
        boolean num = false;
        //usamos el metdo tochararray para convertir un string  en una lista de caracteres
        //y usamos un for para recorrer dicha lista
        for(char item : password.toCharArray()){
            //comprobamos si hay un caracter mayuscula en la lista
            //si lo hay mayus se iguala a true
                if (Character.isUpperCase(item)){
                    mayus = true;
                }
                //hacemos lo mismos con los numeros
                //comprabamos si un caracter es un numero
                if (Character.isDigit(item)){
                    num = true;
                }
        }
        //negamos la comprobacion, si es falsa, arrojamos un false y un mensaje de negacion.
        if (!mayus){
            System.out.println("La contraseña debe tener al menos una letra mayuscula");
            return false;
        }
        if (!num){
            System.out.println("La contraseña debe tener al menos un numero");
            return false;
        }
        return true;
    }
}
