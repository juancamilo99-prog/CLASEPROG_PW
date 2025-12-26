import java.util.Scanner;

public class Main {
    /*PROYECTO DE CLASE, CONSISTE EN REALIZAR UN CUADRADO MAGICO.
    * UN CUADRADO MAGICO ES UNA MATRIZ CUADRADA DE ORDEN NXN DONDE LA SUMA
    * DE LOS ELEMENTOS DE CADA FILA, COLUMNA Y DIAGONALES PRINCPALES ES
    * SIEMPRE LA MISMA*/
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadro:");
        int tamanio = input.nextInt();
        int [][] matriz = new int[tamanio][tamanio];
        funciones.validarCubo(matriz);
        System.out.println("============");
        funciones.suma(matriz);
        System.out.println("============");
    }
}
