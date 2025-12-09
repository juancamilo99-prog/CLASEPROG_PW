package Ejercicio7;

public class Fibo {
    public void generarFibonacci(int limite) {
        int a = 0,b = 1; //inicializamos
        //usamos un bucle true infito para recorrer
        while (true){
            //hacemos la suma del sigueinte numero
            int c = a + b;
            //validamos que el numero sea menor del limite
            if (c > limite){
                //salimos del bucle cuando se vaya a pasar del limite
                break;
            }
            //imprimimos
            System.out.println(c + "");
            a = b;
            b = c;
        }
        System.out.println();
    }
}
