package Ejercicio3;

public class Features {

    public void mostrarPares(int[] numeros){
        //recorremos el array
        for (int i = 0; i < numeros.length; i++) {
            //si es impar, saltamos a la siguiente iteracion
            if (numeros[i]%2 != 0){
                continue;
            }
            //si se cumple, se imprime.
            System.out.println(numeros[i]);
        }
    }
}
