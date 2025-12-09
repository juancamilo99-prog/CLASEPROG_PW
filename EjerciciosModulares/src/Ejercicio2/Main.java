package Ejercicio2;

public class Main {
    /*Objetivo:** Crear un metodo que busque un número en un array y use `break` para salir del bucle cuando lo encuentre.

     **Requisitos:**

     1. Crea un metodo `int buscarNumero(int[] numeros, int objetivo)`.
     2. El metodo debe recorrer el array con un `for`.
     3. Cuando encuentre el número objetivo, usa `break` para salir del bucle.
     4. Devuelve el índice donde se encontró el número, o -1 si no se encontró.
     5. En el `main`, crea un array de enteros y prueba el metodo.*/
    static void main(String[] args) {
        Control control = new Control();
        //creamos un array llamado numeros que contiene enteros
        int numeros[] = {3,8,1,56,27,10,40,7,110};
        //creamos una variable llamada objeto que insertara un numero aleatorio entre 1 y 120
        int objetivo = (int) (Math.random()*120)+1;
        System.out.println(objetivo);
        control.getNumeros(numeros);
        control.buscarNumero(numeros,objetivo);

    }
}
