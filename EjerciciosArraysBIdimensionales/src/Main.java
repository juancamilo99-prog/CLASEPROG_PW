import com.sun.source.doctree.SummaryTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio6();
        //Ejercicio7();
        //Ejercicio8();
        //Ejercicio9();
        //Ejercicio10();
    }

    public static void Ejercicio1(){
        /*Crea un programa que defina una matriz de 3x3 con números del 1 al 9.
        Usa bucles for anidados para mostrar la matriz en formato de tabla.*/

        //creamos la matriz 3x3
        int[][] matriz = new int[3][3];
        //recorremos la matriz para rellenarla con numeros aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //rellenamos la matriz con numeros aleatorios del 1 al 9
                matriz[i][j] = (int) (Math.random()*9)+1;
            }
        }
        //imprimos los arrays con un foreach aninado
        //recorremos primero las filas de la matriz
        for (int[] filas : matriz) {
            //rrecorremos las columnas
            for (int columnas : filas) {
                //imprimmos en consola las columnas
                System.out.print(columnas+"\t");
            }
            //imprimimos como un salto de linea
            System.out.println();
        }
    }

    public static void Ejercicio2(){
        /*Desarrolla un programa que cree una matriz de 2x4.
        Usa bucles for anidados para pedir al usuario que
        introduzca 8 números y los almacene en la matriz. Al final,
        muestra la matriz completa.*/
        //creamos el metodo para solicitar entrada por consola y la variable
        Scanner entrada = new Scanner(System.in);
        //creamos una matriz 2x4
        int [][] matriz = new int[2][4];
        //recorremos las matrices
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //imprimos un mensaje para que el usuario ingrese los numeros y mostrando las posiciones
                System.out.printf("Introduce el valor para la posicion [%d][%d]:\n",i,j);
                //guardamos los numeros dentro del array
                matriz[i][j] = entrada.nextInt();
            }
        }
        //imprimimos la matriz
        System.out.println("Matriz resultante");
        for (int[] fila : matriz) {
            for (int columnas : fila) {
                System.out.print(columnas+"\t");
            }
            System.out.println();
        }
    }

    public static void Ejercicio3(){
        /*Escribe un programa que defina una matriz de 4x4 con números.
        Usa bucles for anidados para recorrer la matriz y
        calcular la suma de todos sus elementos. Muestra el resultado.*/

        //creamos una matriz 4x4
        int [][] matriz = new int[4][4];
        //creamos la variable donde se almacenara el resultado de la suma
        int suma = 0;
        //recorremos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //generamos numeros aleatorios para rellenar los arrays
                matriz[i][j] = (int) (Math.random()*20);
                //sumamos cada uno de los elementos del array y el total
                //lo almacenamos en la variable suma
                suma += matriz[i][j];
            }
        }
        //imprimos la matriz
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas+"\t");
            }
            System.out.println();
        }
        //imprimimos el resultado de suma
        System.out.println("\nla suma total de los elementos es: "+suma);
    }

    public static void Ejercicio4(){
        /*Crea un programa con una matriz de 3x5 con números.
        Pide al usuario un número a buscar y usa bucles for anidados para encontrarlo.
        Si existe, muestra su posición (fila y columna). Si no existe, indica que no se encontró.*/

        //creamos el metodo del Scanner para solicitar el ingreso de datos
        Scanner entrada = new Scanner(System.in);
        int numeroBuscar;
        //creamos la matriz
        int [][] matriz = {{12,45,23,67,89},{34,56,78,90,11},{22,33,44,55,66}};
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print("\t"+columnas+"\t");
            }
            System.out.println();
        }
        //solicitamos que ingrese un numero a buscar
        System.out.println("Introduce el numero a buscar: ");
        numeroBuscar = entrada.nextInt();
        //recorremos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //preguntamos si el numero introducido es igual a los numeros de la matriz
                if (numeroBuscar==matriz[i][j]){
                    System.out.printf("El numero %d se encuentra en la posicion [%d][%d]",numeroBuscar,i,j);
                    break;
                }
            }
        }

    }

    public static void Ejercicio5(){
        /*Desarrolla un programa que defina una matriz de 4x3 con números decimales.
        Usa bucles for anidados para calcular y mostrar el promedio de cada fila de la matriz.*/
        double promedio = 0;
        //creamos la matriz 4x3 con datos
        double [][] matriz = {{5.5,7.2,6.8}, {8.1,9.3,7.5}, {7.8,8.9,9.2}};
        //mostramos la matriz en consola
        for (double[] filas : matriz) {
            for (double columnas : filas) {
                System.out.print(columnas+"\t");
            }
            System.out.println();
        }
        //recorremos la matriz para sacar cada fila
        for (int i = 0; i < matriz.length; i++) {
            //creamos una variable donde se guardara la suma de los elementos
            double suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                //se suman los elementos de cada fila
                suma += matriz[i][j];
            }
            //la operacion para sacar el promedio e imprimimos
            promedio = suma/matriz[i].length;
            System.out.printf("El promedio de la fila %d: %.2f%n", i, promedio);
        }

    }

    public static void Ejercicio6(){
        /*Escribe un programa que cree una matriz de 3x4 con números.
        Usa bucles for para encontrar el número mayor
        de cada columna y muestra los resultados.*/

        //creamos la matriz 3x4
        int [][] matriz = {{15,23,8,19},{42,17,31,25},{28,35,12,40}};
        //recorremos y mostramos la matriz con un foreach
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas+"\t");
            }
            System.out.println();
        }
        //usamos un for para recorrer el array y buscar el numero mayor
        for (int i = 0; i < matriz.length; i++) {
            //tomamos el primer elemento de la fila
            int mayor = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++) {
                //preguntamos si cada numero de la matriz es mayor al primer elemento
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
            System.out.printf("El mayor de la fila [%d] es = %d\n",i,mayor);
        }
    }

    public static void Ejercicio7(){
        /*Crea un programa que defina una matriz de 3x4. Usa bucles
        for anidados para crear una nueva matriz transpuesta (4x3) donde las filas
        se convierten en columnas. Muestra ambas matrices.*/

        //creamos la matriz 3x4
        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //creamos la nueva matriz
        int[][] matrizTranspuesta = new int[4][3];
        //imprimimos la matriz original
        System.out.println("matriz original (3x4)");
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas+"\t");
            }
            System.out.println();
        }
        //modificamos la matriz a la transpuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz transpuesta");
        //imprimimos la matriz compuesta
        for (int[] filas : matrizTranspuesta) {
            for (int columnas : filas) {
                System.out.print(columnas+"\t");
            }
            System.out.println();
        }
    }

    public static void Ejercicio8(){
        /*Desarrolla un programa que cree una matriz de 4x5 con números enteros.
        Usa bucles for anidados para contar cuántos números pares
        e impares hay en toda la matriz. Muestra ambos contadores.*/

        //creamos la matriz
        int[][] matriz;
    }

    public static void Ejercicio9(){
        /*Escribe un programa que genere una matriz de 10x10
        que represente las tablas de multiplicar del 1 al 10.
        Usa bucles for anidados para llenar la matriz donde
         cada elemento [i][j] contenga el resultado de (i+1) * (j+1).
         Muestra la matriz completa.*/

        //creamos la matriz
        int [][] matriz = new int[10][10];
        //recorremos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //cada elemento de i, j obtendra el resultado de i+1 para que nunca se multiplique por 0
                matriz[i][j] = (i+1)*(j+1);
                //imprimimos la matriz
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void Ejercicio10(){
        /*Desarrolla un programa que pida al usuario cuántos estudiantes
         y cuántas asignaturas hay. Crea una matriz para almacenar
         las notas (estudiantes x asignaturas). Usa bucles for
         anidados para rellenar la matriz con las notas. Luego:
        1. Muestra todas las notas en formato de tabla
        2. Calcula y muestra el promedio de cada estudiante
        3. Calcula y muestra el promedio de cada asignatura
        4. Encuentra la nota más alta de toda la clase y su posición
        Ejemplo de salida por consola:*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos estudiantes hay? ");
        int cantidadEstudiantes = entrada.nextInt();
        System.out.println("cuantos asignaturas hay? ");
        int cantidadAsignatura = entrada.nextInt();
        //creamos la matriz
        double[][] matriz = new double[cantidadEstudiantes][cantidadAsignatura];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce la nota del estudiante %d, asignatura %d:\n",i+1,j+1);
                matriz[i][j] = entrada.nextDouble();
            }
        }
        //imprimimos las tablas de notas
        System.out.println();
        System.out.println("----TABLA DE NOTAS----");

        System.out.print("        ");//espacio en blanco para mostrar la tabla
        //recorremos asignatura
        for (int i = 0; i < cantidadAsignatura; i++) {
            System.out.printf("Asig%-3d",(i+1));
        }
        //recorremos los estudiantes y las notas
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Est %d\t",(i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(" %-6.1f", matriz[i][j]);
            }
            System.out.println();
        }
        //promedio por estudiante
        System.out.println();
        System.out.println("---PROMEDIOS POR ESTUDIANTE---");
        double promedio;
        for (int i = 0; i < matriz.length; i++) {
            double suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                //sumamos los elementos de la tabla
                suma+=matriz[i][j];
            }
            promedio = suma/matriz[i].length;
            System.out.printf("Estudiante %d: %.2f\n",(i+1),promedio);
        }

        //promedio por asignatura
        System.out.println();
        System.out.println("---PROMEDIOS POR ASIGNATURA---");
        double promedioAsig;
        //recorremos la matriz de las columnas donde i representa la columna actual
        //matriz[0] -> numero de columnas
        for (int i = 0; i < matriz[0].length; i++) {
            double suma = 0;
            //bucle para recorrer las filas
            for (int j = 0; j < matriz.length; j++) {
                //sumamos el valor de la fila j y la columna i
                suma += matriz[j][i];
            }
            //calculo del promedio
            promedioAsig = suma/matriz.length;
            System.out.printf("Promedio columna %d : %.1f\n",(i+1),promedioAsig);
        }

        //imprimir la nota mas alta
        System.out.println();
        System.out.println("---NOTA MAS ALTA---");
        //buscar la asignatura mas alta
        //guardamos las posiciones de fila y columa de la nota maxima
        int posicion = 0, posicion_c = 0;
        //guardamos la nota mas alta encontrada
        double mayor = matriz[0][0];
        //recorremos cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            //recorremos cada columna de la matriz
            for (int j = 0; j < matriz[i].length; j++) {
                //preguntamos si la nota actual es la mas alta encontrada mientras se ejecuta
                if (matriz[i][j]>mayor){
                    //actualiza la nota mas alta
                    mayor = matriz[i][j];
                    //posiciones de fila y columna para las notas mas altas
                    posicion_c = i;
                    posicion = j;
                }
            }
        }
        System.out.printf("La nota mas alta es %.1f Del estudiante [%d] en la asignatura [%d]",mayor,(posicion_c+1),(posicion+1));
    }
}
