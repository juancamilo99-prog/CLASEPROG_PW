import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Ejercicio1();
    }

    public static void Ejercicio1(){
        /*Crea un programa que permita sumar arrays multidimensionales. Para ello
        siguiente estos pasos:
        a. Pide al usuario el tamaño de las matrices
        b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
        50
        c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
        de las celdas de las generadas en el punto anterior
        d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
        para poder identificarlas*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("De que tamaño quieres el arreglo?");
        int tamanio = entrada.nextInt();
        int [][] matrizA = new int[tamanio][tamanio];
        int [][] matrizB = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matrizA[i][j] = (int) (Math.random()*17);
                matrizB[i][j] = (int) (Math.random()*17);
            }
        }
        //imprimir matriz A
        System.out.println("Imprimiendo matriz A");
        ImprimirArray(matrizA);
        //imprimir matriz B
        System.out.println();
        System.out.println("Imprimiendo matriz B");
        ImprimirArray(matrizB);

        //recorremos la matriz suma para rellenarla
        int[][] sumaMatrices = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                sumaMatrices[i][j] = matrizB[i][j] + matrizA[i][j];
            }
        }
        //imprimimos la matriz Sumamatrices
        System.out.println("Imprimiendo la matriz Suma");
        ImprimirArray(sumaMatrices);
    }

    //metodo para imprimir los arrrays
    public static void ImprimirArray(int[][] matriz){
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }
    }
}
