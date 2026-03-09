package model;

import controllerExcepciones.ResultadoException;

public class Operaciones {

    public double calcularDivision(double dividendo, double divisor) throws ArithmeticException, ResultadoException {
        double division = dividendo / divisor;
                try{
                    if (divisor == 0) {
                        throw new ArithmeticException("El division no es valido");
                    }
                }catch (ResultadoException e){
                    System.out.println("sigue intentandolo... ");
                    System.out.println();
                }
        System.out.println("el dividendo es: " + dividendo);
        System.out.println("el divisores es: " + divisor);
        System.out.println("la division es: " + division);
        return division;
    }
}
