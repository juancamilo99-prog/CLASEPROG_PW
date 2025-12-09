package Ejercicio4;

public class Main {
    /*Objetivo:** Crear un metodo que calcule el promedio de notas, saltando notas inválidas con `continue`.

     **Requisitos:**

     1. Crea un metodo `double calcularPromedio(double[] notas)`.
     2. Recorre el array de notas.
     3. Si una nota es menor que 0 o mayor que 10, usa `continue` para ignorarla.
     4. Suma las notas válidas y cuenta cuántas hay.
     5. Devuelve el promedio de las notas válidas.
     6. En el `main`, prueba con un array que incluya algunas notas inválidas.*/

    static void main(String[] args) {
        //creamos el array donde se insertaran las notas
        Featurepromedio featurepromedio = new Featurepromedio();
        double[] notas = new double[5];
        featurepromedio.insertarNota(notas);
        featurepromedio.Mostrar(notas);
        System.out.printf("el promedio es: %.2f",featurepromedio.calcularPromedio(notas));
    }
}
