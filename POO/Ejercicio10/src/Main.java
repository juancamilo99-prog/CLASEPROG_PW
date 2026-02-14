import model.Calculadora;

public class Main {

    static void main(String[] args) {
        /*Crea una clase Calculadora con métodos estáticos
        para sumar, restar, multiplicar y dividir dos números. Añade también
        un metodo estático potencia(base, exponente).
        Usa estos métodos sin crear objetos de la clase.*/



        System.out.println("Suma: "+Calculadora.sumar(10,5));
        System.out.println("Resta: "+Calculadora.restar(10,5));
        System.out.println("Multiplicacion: "+Calculadora.multiplicar(10,5));
        System.out.println("Division: "+Calculadora.dividir(10,5));
        System.out.println("Potencia: "+Calculadora.potencia(2,3));

    }
}