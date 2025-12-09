package Ejercicio8;

public class Main {
    static void main(String[] args) {
        //declaramos el array
        int[] edades = {20,18,8,-5,150, 121, 119, 80};
        Edades edades1 = new Edades();
        edades1.contarEdadesValidas(edades);
        edades1.mostrarEdades(edades);
    }
}
