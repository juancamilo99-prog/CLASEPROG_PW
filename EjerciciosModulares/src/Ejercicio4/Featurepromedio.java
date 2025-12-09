package Ejercicio4;

public class Featurepromedio {
    public double[] insertarNota(double[] notas){
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random()*20;
        }
        return notas;
    }
    public double calcularPromedio(double[] notas){
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] >10){
                continue;
            }
            suma += notas[i];
            contador++;
        }
        if (contador == 0){
            System.out.println("no hay notas validas!");
            return 0;
        }
        System.out.println("\nCantidad de notas validas "+contador);
        return suma/contador;
    }

    public void Mostrar(double[] notas){
        for (double item : notas) {
            System.out.printf("%.2f\t",item);
        }
    }
}
