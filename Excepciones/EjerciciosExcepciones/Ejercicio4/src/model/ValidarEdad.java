package model;

import utils.ValidarEdadException;

public class ValidarEdad {

    public void validadEdad(int edad) throws ValidarEdadException {
        //validamos los dos casos de las excepciones
        if (edad < 0) {
            throw new ValidarEdadException("la edad no puede ser negativa");
        }
        if (edad > 120) {
            throw new ValidarEdadException("la edad no puede ser mayor que 120");
        }
        System.out.println("Edad correcta, tu edad es: " + edad+ " Años");
    }
}
