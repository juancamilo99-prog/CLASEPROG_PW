import com.sun.jdi.ArrayReference;

import java.util.Arrays;
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
        /*Crea un programa que defina un array
        llamado frutas con 5 nombres de frutas. Luego,
        muestra todos los elementos del array en la consola,
        uno por línea.*/
        String[] frutas = {"manzana","platano","naranja","fresa","uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
    }

    public static void Ejercicio2(){
        /*
        * Escribe un programa que cree un array de 6 números enteros.
        * Usa un bucle for para recorrer el array y
        * mostrar cada número junto con su posición (índice).*/
        //creamos el array con variable de nombre numero
        //y le damos valores
        int[] numero = {10,20,30,40,50,60};
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Posicion "+i+ " : "+numero[i]);
        }
    }

    public static void Ejercicio3(){
        /*Desarrolla un programa que cree un array vacío de tamaño 5.
        Usa un bucle for para pedir al usuario que introduzca 5 nombres,
        guardándolos en el array. Al final, muestra todos los nombres almacenados.*/

        //creamos la variable array ingresarNombres
        Scanner entrada = new Scanner(System.in);
        //creamos el array nombres con cantidad de 5
        String[] ingresarNombres = new String[5];
        //recorremos el array con un for
        for (int i = 0; i < ingresarNombres.length; i++) {
            System.out.println("Introduce el nombre "+i+ " : ");
            //guardamos los nombres introducidos en cada posicion del array
            ingresarNombres[i] = entrada.nextLine();
        }
        //imprimimos los nombres introducidos
        System.out.println("nombres introducidos!");
        for (String item : ingresarNombres){
            System.out.println(item);
        }
    }

    public static void Ejercicio4(){
        /*Crea un programa con un array de 7 números.
        Pide al usuario un número a buscar y usa un bucle for para recorrer el array.
        Si el número existe, muestra su posición. Si no existe, indica que no se encontró.*/
        Scanner entrada = new Scanner(System.in);
        int[] numero = {5,12,8,3,15,9,6};
        boolean numeroEncontrado = false;
        System.out.println("Introduce el numero que quieres buscar?");
        int buscarNumero = entrada.nextInt();
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == buscarNumero){
                System.out.println("El numero "+buscarNumero+" se encuentra en la posicion "+i);
                numeroEncontrado = true;
            }
        }
        if (!numeroEncontrado){
            System.out.println("el numero "+buscarNumero+ " no se encuentra en el array");
        }
    }

    public static void Ejercicio5(){
        /*Escribe un programa que defina un array de 10 números enteros.
        Usa un bucle for para contar cuántos números son mayores que 50
        y muestra el resultado.*/
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int[] numero = {23,67,45,89,12,56,78,34,90,43};
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]>50){
                contador++;
            }
        }
        System.out.println("cantidad de numeros mayores que 50: "+contador);
    }

    public static void Ejercicio6(){
        /*Crea un programa con un array de 8 números decimales.
        Recorre el array con un bucle for para calcular
        la suma de todos los elementos. Luego, calcula y muestra el promedio.*/
        double suma = 0, promedio=0;
        double[] numerosDecimales = {4.5,7.2,3.8,9.1,5.6,8.3,6.7,4.9};
        for (int i = 0; i < numerosDecimales.length; i++) {
            suma+=numerosDecimales[i];
            promedio = suma/numerosDecimales.length;
        }
        System.out.println("suma total: "+suma);
        System.out.println("promedio "+promedio);
    }

    public static void Ejercicio7(){
        /*Desarrolla un programa que cree un array de 6 números.
        Usa bucles for para encontrar el número mayor
        y el número menor del array, y muestra ambos resultados.*/

        int[] numero = {15,8,23,4,19,22};
        int mayor = numero[0];
        int menor = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]>mayor){
                mayor = numero[i];
                System.out.println("el numero mayor es "+mayor);
            }
        }
        for (int j = 0; j < numero.length; j++) {
            if (numero[j]<menor){
                menor = numero[j];
                System.out.println("el numero menor es "+menor);
                break;
            }
        }
        
    }

    public static void Ejercicio8(){
        /*Crea un programa con un array de 10 palabras (pueden repetirse).
        Pide al usuario una palabra y usa un bucle for para contar
         cuántas veces aparece esa palabra en el array.*/
        //creamos la variable para digitar el scanner
        Scanner entrada = new Scanner(System.in);
        //creamos las variables que vamos a utilizar
        //un contador para contar el numero de veces que se encuentre la palabra en el array
        int contador = 0;
        // un booleano para determinar si la palabra fue encontrada o no y mostrarlo en la consola
        boolean palabraEncontrada= false;
        //creamos el array con 10 elementos
        String[] palabras = {"gato", "perro","gato","pajaro","gato","pez","perro","gato","conejo","perro"};
        //imprimimos en consola para que digite la palabra a buscar
        System.out.println("Introduce la palabra a buscar: ");
        //guardamos la palabra a buscar
        String palabraBuscar = entrada.next();
        //recorremos el array palabra
        for (int i = 0; i < palabras.length; i++) {
            //preguntamos si palabras en la posicion i es igual a la palabra a buscar
            if (palabras[i].equals(palabraBuscar)){
                //si se cumple la condicion, contador aumenta cada vez que itere positivamente
                contador++;
                //si cumple la condicion, palabra encontrada obtiene el nuevo valor = true
                palabraEncontrada = true;
            }
        }
        //preguntamos la negacion de palabraencontrada si es true, imprimimos la cantidad
        // y si es false, se imprime la cantidad tambien de que no se ha encontrado
        if (!palabraEncontrada){
            System.out.println("la palabra "+palabraBuscar+" aparece "+contador+" veces en el array");
        }else {
            System.out.println("la palabra "+palabraBuscar+" aparece "+contador+" veces en el array");
        }
    }

    public static void Ejercicio9(){
        /*Escribe un programa que cree un array de 7 números.
        Usa un bucle for para crear un nuevo array con los
        elementos en orden inverso.
        Muestra ambos arrays: el original y el invertido.*/
        int[] arrayOriginal = {2,4,6,8,10,12,14};
        //declaramos un array nuevo donde ira el array inverso
        //tendra la misma longitud del array original
        int[] arrayInvertido = new int[arrayOriginal.length];
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println(Arrays.toString(arrayOriginal));
            break;
        }
        for (int i = 0; i < arrayOriginal.length; i++) {
            //usamos la variable j para decrementar el inicio del array original
            //es decir 10-0-1 = 9
            int j = arrayOriginal.length-i-1;
            arrayInvertido[j] = arrayOriginal[i];
        }
        System.out.println(Arrays.toString(arrayInvertido));
    }

    public static void Ejercicio10(){
        /*Desarrolla un programa que pida al usuario cuántos
        estudiantes hay en una clase. Crea un array para
        almacenar sus calificaciones (0-10).
        Usa un bucle while para rellenar el array
        con las notas. Luego, usa un bucle for para:

        1. Mostrar todas las calificaciones

        2. Calcular el promedio de la clase

        3. Contar cuántos estudiantes aprobaron (nota ≥ 5)

        4. Encontrar la nota más alta y la más baja*/

        Scanner entrada = new Scanner(System.in);
        //crear el tamaño del arreglo (la cantidad de estudiantes)
        System.out.println("Cuantos estudiantes hay? ");
        //guardamos la cantidad de estudiantes
        double nElementos = entrada.nextDouble();
        //creamos un arreglo donde se guardaran las notas y le damos
        //la longitud de nElementos
        double[] cantidadEstudiantes = new double[(int) nElementos];
        //inicializamos una variable para el inicio del while
        int i = 0;
        double suma=0, promedio=0;
        int contador = 0;
        //se hara mientras i inicia en 0 sea menor que nElementos
        while (i<nElementos){
            System.out.printf("Introduce la calificacion del estudiante %d\n",i+1);
            double nota = entrada.nextDouble();
            if (nota>=0 && nota<=10){
                cantidadEstudiantes[i] = nota;
                i++;
            }else {
                System.out.println("nota no valida!");
            }
        }
        //inicializamos las variables para validar el mayor y el menor
        // la igualamos al array cantidadEstudiantes con posicion 0 de inicio
        double mayor = cantidadEstudiantes[0];
        double menor = cantidadEstudiantes[0];
        //mostramos las calificaciones
        for (int j = 0; j < cantidadEstudiantes.length; j++) {
            suma += cantidadEstudiantes[j];
            promedio = suma/cantidadEstudiantes.length;
            //cantidad de estudiantes aprobados
            if (cantidadEstudiantes[j] >= 5){
                contador++;
            }
            //nota mas alta
            if (cantidadEstudiantes[j]>mayor){
                mayor = cantidadEstudiantes[j];
            }
            //nota mas baja
            if ( cantidadEstudiantes[j]<menor){
                menor = cantidadEstudiantes[j];
            }
        }
        System.out.println("Calificaciones: "+Arrays.toString(cantidadEstudiantes));
        System.out.println("promedio de la clase: "+promedio);
        System.out.println("Estudiantes aprobados: "+contador);
        System.out.println("la nota mas alta es: "+mayor);
        System.out.println("la nota mas baja es: "+menor);

        /*ATENCION!
        *
        * FUNCIONA Y NO SE PORQUÈ, NO TOCAR!*/

    }
}
