
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

    public static int Ejercicio1() {
        //Crea un programa que pida un número del 1 al 7 y 
        //use un switch para mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero del dia de la semana (1-7)");
        int dia = entrada.nextInt();
        switch (dia) {
            case 1 ->
                System.out.println("Dia " + dia + "Es: Lunes");
            case 2 ->
                System.out.println("Dia " + dia + "Es: Martes");
            case 3 ->
                System.out.println("Dia " + dia + "Es: Miercoles");
            case 4 ->
                System.out.println("Dia " + dia + "Es: Jueves");
            case 5 ->
                System.out.println("Dia " + dia + "Es: Viernes");
            case 6 ->
                System.out.println("Dia " + dia + "Es: Sabado");
            case 7 ->
                System.out.println("Dia " + dia + "Es: Domingo");
            default ->
                throw new AssertionError();
        }
        return dia;
    }

    public static char Ejercicio2() {
        //Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) 
        //y use un switch para mostrar el mensaje correspondiente:
        // A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige la calificacion: (A,B,C,D,F)");
        char nota = entrada.next().charAt(0);
        switch (nota) {
            case 'A' ->
                System.out.println("Tu calificacion es Excelente");
            case 'B' ->
                System.out.println("Tu calificacion es Muy bien");
            case 'C' ->
                System.out.println("Tu calificacion es Bien");
            case 'D' ->
                System.out.println("Tu calificacion es Suficiente");
            case 'F' ->
                System.out.println("Tu calificacion es Insuficiente");
            default ->
                throw new AssertionError();
        }
        return nota;
    }

    public static int Ejercicio3() {
        //Escribe un programa que pida dos números y una operación (+, -, *, /). 
        //Usa un switch para realizar la operación correspondiente y mostrar el resultado.
        Scanner entrada = new Scanner(System.in);
        int resultado = 0;
        System.out.println("Introduce el primer numero ");
        int p_num = entrada.nextInt();
        System.out.println("Introduce el segundo numero ");
        int sc_num = entrada.nextInt();
        System.out.println("Introduce la operacion (+,-,*,/)");
        char op = entrada.next().charAt(0);
        switch (op) {
            case '+' ->
                System.out.println("Resultado " + p_num + " + " + sc_num + " = " + (resultado = p_num + sc_num));
            case '-' ->
                System.out.println("Resultado " + p_num + " - " + sc_num + " = " + (resultado = p_num - sc_num));
            case '*' ->
                System.out.println("Resultado " + p_num + " * " + sc_num + " = " + (resultado = p_num * sc_num));
            case '/' ->
                System.out.println("Resultado " + p_num + " / " + sc_num + " = " + (resultado = p_num / sc_num));
            default ->
                throw new AssertionError();
        }
        return resultado;
    }

    public static void Ejercicio4() {
        //Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir. 
        //Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.
        Scanner entrada = new Scanner(System.in);
        System.out.printf("--- MENU ---\n"
                + "1. Ver perfil\n"
                + "2. Configuracion\n"
                + "3. Ayuda\n"
                + "4. Salir\n"
                + "Elige una opcion:\n");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Has entrado a Ver perfil.");
                break;
            case 2:
                System.out.println("Has entrado a Ver Configuracion");
                break;
            case 3:
                System.out.println("Has entrado a Ver Ayuda");
                break;
            case 4:
                System.out.println("Has entrado a Ver Salir");
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void Ejercicio5() {
        //Desarrolla un programa que pida un mes (número del 1 al 12) y 
        //use un switch para determinar la estación del año: 
        //Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero del mes: ");
        int mes = entrada.nextInt();
        switch (mes) {
            case 12, 1, 2 ->
                System.out.println("Invierno");
            case 3, 4, 5 ->
                System.out.println("Primavera");
            case 6, 7, 8 ->
                System.out.println("Verano");
            case 9, 10, 11 ->
                System.out.println("Otoño");
            default ->
                throw new AssertionError();
        }

    }

    public static int Ejercicio6() {
        //Escribe un programa que pida un número
        //y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        System.out.println("Tabla del " + num);
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
        return num;
    }

    public static void Ejercicio7() {
        //Crea un programa que pida un número N 
        //y use un bucle for para calcular la suma de todos los números desde 1 hasta N. Muestra el resultado final.
        int suma = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        System.out.print("Sumando: ");
        for (int i = 1; i <= num; i++) {
            suma += i; // sumamos suma=suma+i o suma = 1 + 1 = i ; 
            System.out.print(i);
            //si i es menor a numero, se pone el signo +
            if (i < num) {
                System.out.print(" + ");
            }
        }
        System.out.printf("\nLa suma es: %d", suma);
    }

    public static void Ejercicio8() {
        //Desarrolla un programa que pida un número N 
        //y use un bucle for para contar cuántos números pares e impares hay desde 1 hasta N.
        //Muestra ambos contadores.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        int cont_pares = 0;
        int cont_impares = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                cont_pares++;
            } else {
                cont_impares++;
            }
        }
        System.out.println("Numeros pares encontrado: " + cont_pares);
        System.out.println("Numeros impares encontrados: " + cont_impares);
    }

    public static void Ejercicio9() {
        //Escribe un programa que pida un número entero positivo
        // y calcule su factorial usando un bucle for. 
        //El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        BigInteger total = BigInteger.valueOf(1);
        System.out.printf("Calculando %d!\n", num);
        for (int i = num; i >= 1; i--) {
            total=total.multiply(BigInteger.valueOf(i)); // total es igual al total * i multiply para multiplicar
            System.out.print(i);
            //si i es mayor ponemos una x delante del numero 
            if (i > 1) {
                System.out.print(" X ");
            }
        }
        System.out.println("\nfactorial de " + num + " es: " + total);
    }

    public static void Ejercicio10() {
        //Crea un programa que muestre un menú con 3 tipos de ejercicios: 
        //1=Flexiones, 2=Abdominales, 3=Sentadillas. 
        //Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer. 
        //Usa un switch para determinar el ejercicio y un for para contar las repeticiones una a una.
        Scanner entrada = new Scanner(System.in);
        System.out.printf("-- EJERCICIOS --\n"
                + "1. Flexiones\n"
                + "2. Abdominales\n"
                + "3. Sentadillas\n"
                + "Elige un ejercicio (1-3): \n");
        int op = entrada.nextInt();
        System.out.println("Cuantas repeticiones? ");
        int cant_rep = entrada.nextInt();
        for (int i = 1; i <= cant_rep; i++) {
            System.out.println("Repeticion " + i + " Completada");
        }
        switch (op) {
            case 1:
                System.out.println("Has elegido Flexiones");
                System.out.println("Ejercicio completado! has hecho " + cant_rep + " flexiones");
                break;
            case 2:
                System.out.println("Has elegido Abdominales");
                System.out.println("Ejercicio completado! has hecho " + cant_rep + " abdominales");
                break;
            case 3:
                System.out.println("Has elegido Sentadillas");
                System.out.println("Ejercicio completado! has hecho " + cant_rep + " sentadillas");
                break;
            default:
                throw new AssertionError();
        }

    }
}
