/*Array multidimensionales -> lista de elementos. Tamaño fijo,
con la diferencia que ahora tengo en cada hueco puedo guardar multiples elementos

Array bidimensional -> numero filas - numeros columnas */
public class Main {
    static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.empezarJuego();
        //int[3][3]
        /*creamos una matriz bidimensional
        int[][] matriz = new int[4][3];
        3 filas
        3 columnas
        0 0 0
        0 0 0
        0 0 0
        0 0 0
        matriz[0] -> [0, 0 ,0] con uno solo obtendria la fila
        matriz [2][1] - > [0]*/
        System.out.println("\n--------------------------------");
        int[][] matriz = new int[][]{{4,8,9}, {14,17,16}, {12,4,7}};
        /*
        * 4  7  9
        * 14 17 19
        * 13  4  7*/
        //sacar el tamaño del array
        System.out.println("el tamaño del array es "+matriz.length);
        //cuantas columnas tiene la primera fila
        System.out.println("el tamaño de las columnas es de la primera fila "+matriz[0].length);
        System.out.println("el tamaño de las columnas es de la primera fila "+matriz[1].length);
        System.out.println("el tamaño de las columnas es de la primera fila "+matriz[2].length);
        /*cambiar el valor
        matriz[2][0] = 6;*/
        //obtener un elemento en concreto
        System.out.println("el elemento buscado es "+matriz[2][0]);
        //sacar todos los elementos -> for aninado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]%2 == 0){
                    System.out.print(matriz[i][j]+"\t"); //\t salto de linea
                }
            }
            System.out.println();
        }
        System.out.println("----------------------");
        /*for each*/
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }
    }
}
