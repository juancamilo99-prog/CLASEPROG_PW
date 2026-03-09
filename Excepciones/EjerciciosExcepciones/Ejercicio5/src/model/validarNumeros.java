package model;

import utils.validarNumerosExcepcion;

import java.sql.ResultSet;

public class validarNumeros {

    public void validar(int op1, int op2, char op) throws validarNumerosExcepcion {
        double resultado = 0;
        switch(op){
            case '+' -> {
                resultado = op1 + op2;
            }
            case '-' -> {
                resultado = op1 - op2;
            }
            case '*' -> {
                resultado = op1 * op2;
            }
            case '/' -> {
                resultado = op1 / op2;
            }
            default -> {
                System.out.println("Operacion no valida");
            }
        }
        System.out.println("El resultado es: " + resultado);
    }

}
