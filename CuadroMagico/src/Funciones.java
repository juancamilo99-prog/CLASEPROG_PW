import java.util.Scanner;

public class Funciones {

    public void validarCubo(int[][] matriz){
        //iniciamos los intentos a 0
        long intentos = 0;
        do {
            //rellenamos la matriz cuando cuadro magico
            //evalua el metodo de la matriz
            rellenarCubo(matriz);
            intentos++;
        }while (!cuadroMagico(matriz));
        //imprimimos
        System.out.println("\n Cuadrado magico encontrado en intentos: " + intentos);
        imprimirMatriz(matriz);
        System.out.println("Constante Magica: "+constanteMagica(matriz.length));
    }

    public void rellenarCubo(int[][] matriz) {

        //reinicia la matriz a 0 para volver a iterar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }
        //rellenamos la matriz generado numeros aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //inicializamos la variable aelatorios
                int aleatorio;
                do {
                    //con do-while nos encargamos de que se ejecute mientras
                    //el metodo de repetir valide si son repetidos o no
                    aleatorio = (int) (Math.random() * (matriz.length * matriz.length))+1;
                }while (estaNumero(matriz,aleatorio));
                //luego guardamos el numero aleatorio si cumple en la matriz
                matriz[i][j] = aleatorio;
            }
        }
    }

    //metodo imprimir la matriz para que solo imprima cuando se encuentre
    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //metodo para validar si hay numeros repetidos o no
    private boolean estaNumero(int[][] matriz,int numero){
        for (int[] fila : matriz) {
            for (int item : fila) {
                if (item == numero) {
                    return true;
                }
            }
        }
        return false;
    }


    //metodo para generar la constante magica de la matriz
    private int constanteMagica(int tamanio) {
        int contanteMagica;
        //formula para generar la constante c = n*(n*n+1)/2
        contanteMagica = tamanio * (tamanio * tamanio + 1)/2;
        return contanteMagica;
    }

    //metodo para validar el cuadrado magico
    public boolean cuadroMagico(int[][] matriz) {
        //inicializamos una variable constante que lleva la generada en el
        //metodo constanteMagica de la matriz
        int constante = constanteMagica(matriz.length);

        /*FILAS*/
        for (int i = 0; i < matriz.length; i++) {
            int fila = 0;
            for (int j = 0; j < matriz.length; j++) {
                fila += matriz[i][j];
            }
            if (fila != constante) {
                return false;
            }
        }

        /*COLUMAS*/
        for (int j = 0; j < matriz.length; j++) {
            int columnas = 0;
            for (int i = 0; i < matriz.length; i++) {
                columnas += matriz[i][j];
            }
            if (columnas != constante) {
                return false;
            }
        }

        /*DIAGONAL PRINCIPAL*/
        int diagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonalPrincipal += matriz[i][i];
        }
        if (diagonalPrincipal != constante) {
            return false;
        }

        /*DIAGONAL SECUNDARIA*/
            int diagonalSecundaria = 0;
            for (int i = 0; i < matriz.length; i++) {
                diagonalSecundaria += matriz[i][matriz.length - 1 - i];
            }
        return diagonalSecundaria == constante;
    }

    //metodos donde imprimimos las sumas de las columas,filas, diagonal principal
    // diagonal secundaria.
    public void suma(int [][] matriz) {
        /*SUMA FILAS*/
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila=0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.print("suma filas:"+sumaFila+"\t");
        }
        System.out.println();
        System.out.print("============");
        System.out.println();
        /*SUMA COLUMNAS*/
        for (int j = 0; j < matriz.length; j++) {
            int sumaColumna=0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print("suma columnas:"+sumaColumna+"\t");
        }
        System.out.println();
        System.out.println("==============");
        /*SUMA DIAGONAL PRINCIPAL*/
        int sumaDiagonalPrincipal=0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        System.out.print("suma diagonal principal:"+sumaDiagonalPrincipal+"\t");
        /*SUMA DIAGONAL SECUNDARIA*/
        System.out.println();
        System.out.println("==============");
        int sumaDiagonalSecundaria=0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalSecundaria+=matriz[i][matriz.length-1-i];
        }
        System.out.println("suma diagonal secundaria:"+sumaDiagonalSecundaria+"\t");
    }
}
 