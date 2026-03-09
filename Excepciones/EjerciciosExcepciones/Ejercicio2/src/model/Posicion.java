package model;

public class Posicion {

    private int [] array = {10,20,30,40,50};

    public void mostrarPosicion(int posicion) throws ArrayIndexOutOfBoundsException {
        try{
            System.out.printf("La posicion %d se encontro y esta el numero: %d\n", posicion, array[posicion]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: posicion fuera de los limites del array");
        }
    }
}
