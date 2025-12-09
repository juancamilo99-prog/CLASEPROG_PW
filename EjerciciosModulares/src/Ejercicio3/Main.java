package Ejercicio3;

public class Main {

    /*Objetivo:** Crear un metodo que muestre solo números pares de un array usando `continue`.

     **Requisitos:**

     1. Crea un metodo `void mostrarPares(int[] numeros)`.
     2. Recorre el array con un bucle `for`.
     3. Si el número es impar, usa `continue` para saltar a la siguiente iteración.
     4. Si el número es par, muéstralo en pantalla.
     5. En el `main`, crea un array con números del 1 al 20 y llama al metodo.*/
    static void main(String[] args) {
        //creamos un array de numeros
        int [] numeros = {1,12,14,15,66,5,132};
        Features features = new Features();
        features.mostrarPares(numeros);
    }
}
