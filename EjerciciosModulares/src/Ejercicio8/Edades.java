package Ejercicio8;

public class Edades {
    public int contarEdadesValidas(int[] edades){
        //inicializamos un contador para validar cuantas notas validas hay
        int contador = 0;
        //recorremos el array
        for (int i = 0; i < edades.length; i++) {
            //validamos que las edades menores de 0 y mayores de 120 las ignore
            if (edades[i] < 0 || edades[i] > 120) {
                continue;
            }
            contador++;
        }
        //validamos que no existan notas validas
        if (contador == 0){
            System.out.println("No existe notas validas");
            return 0;
        }
        //imprimimos la cantidad de notas validas
        System.out.println("la cantidad de notas validas "+contador);
        return contador;
    }
    //metodo mostrar las edades validas
    public void mostrarEdades(int[] edades){
        //recorremos el arrray para mostrar TODAS las edades
        for (int item : edades) {
            System.out.print(item + " ");
        }
        System.out.println();
        //recorremos el array e ignoramos los numeros menores de 0 y mayores de 120
        System.out.println("numeros validos");
        for (int item : edades) {
            if (item < 0 || item > 120) {
                continue;
            }
            System.out.print(item + " ");
        }
    }
}
