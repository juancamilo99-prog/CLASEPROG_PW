package Ejercicio2;

public class Control {
    //declaramos el metodo buscar numeros con el array y el objetivos
    //objetivo son los numeros aleatorios que inserta el programa
    public int buscarNumero(int[] numeros, int objetivo){
        //recorremos el array numeros para encontrar el numero
        for (int i = 0; i < numeros.length; i++) {
            //preguntamos si los numeros de cada posicion es igual al objetivo
            if (numeros[i] == objetivo){
                //si lo es, imprimimos el numero encontrado y la posicion y paramos el bucle con un break
                System.out.printf("\nnumero %d encontrado en posicion -> %d",objetivo,(i+1));
                break;
            }
        }
        return objetivo;
    }
    //metodo para obtener los numeros del array
    public void getNumeros(int [] numeros){
        for (int item : numeros) {
            System.out.printf("%d\t",item);
        }
    }
}
