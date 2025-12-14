package Ejercicio10;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Modulos modulo = new Modulos();
        String[] productos = {"huevos", "leche", "arroz","pan","jabon"};
        int[] stock = {10, 20, 15,7, 0};
        double[] precio = {5.20, 20, 1.40, 1, 2.49};
        modulo.procesarPedidos(productos,stock,precio);

    }
}
