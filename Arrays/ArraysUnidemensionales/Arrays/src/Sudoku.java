public class Sudoku {
   private int [][] sudoku = new int[3][3];

   public void empezarJuego(){
       //se rellena la matriz con numeros aleatorios
       for (int i = 0; i < sudoku.length; i++) {
           for (int j = 0; j < sudoku[i].length; j++) {
               int aleatorio;
               do {
                   aleatorio = (int) (Math.random()*21);
               }while (estaNumero(aleatorio));
               sudoku[i][j] = aleatorio;
           }
       }
        //imprimimos los array
       for (int[] fila : sudoku) {
           for (int item : fila) {
               System.out.print(item+"\t");
           }
           System.out.println();
       }
       System.out.println("mostrando los numeros de una columna \n");
       numerosColumnas(0);
       numerosFilas(0);
   }

   private boolean estaNumero(int numero){
       for (int[] fila : sudoku) {
           for (int item : fila) {
               if (item == numero){
                   return true;
               }
           }
       }
       return false;
   }
   
   //sacar los numeros de la primera columna
    public void numerosColumnas(int nColumna){
        for (int i = 0; i < sudoku.length; i++) {
            System.out.println(sudoku[i][nColumna]);
        }
    }

    //sacar los numeros de una fila en concreto
    public void numerosFilas(int nFilas){
        for (int i = 0; i < sudoku[nFilas].length; i++) {
            System.out.print(sudoku[nFilas][i]+"\t");
        }
    }
}
