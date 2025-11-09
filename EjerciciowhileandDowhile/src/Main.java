import java.time.LocalTime;
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
        //Crea un programa que pida un número N
        //use un bucle while para contar desde 1 hasta N, mostrando cada número.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero:");
        int numero = entrada.nextInt();
        int i = 1;
        while (i<=numero){
            System.out.println("El numero es "+i);
            i++;
        }
    }

    public static void Ejercicio2(){
        //Desarrolla un programa que pida al usuario una contraseña.
        // La contraseña correcta es "1234". Usa un bucle do-while para seguir
        // pidiendo la contraseña hasta que el usuario la introduzca correctamente.
        Scanner entrada = new Scanner(System.in);
        int password;
        int claveCorrecta = 1234;
        do {
            System.out.println("Escribe tu contraseña");
            password = entrada.nextInt();
            if (password == claveCorrecta){
                System.out.println("Clave correcta, bienvenido!");
            }else {
                System.out.println("Clave incorrecta, intentalo de nuevo");
            }
        }while (password != claveCorrecta);
    }

    public static void Ejercicio3(){
        //Escribe un programa que pida números al usuario y los vaya sumando.
        // El bucle while debe continuar mientras el usuario introduzca números positivos.
        // Cuando introduzca un número negativo o cero, el programa debe terminar y mostrar la suma total.
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        do {
            System.out.println("Digite un numero");
            numero = entrada.nextInt();
            if (numero > 0){
                suma+=numero;
                System.out.println(suma);
            }
        } while (numero > 0);
    }

    public static void Ejercicio4(){
        //Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7).
        // Usa un bucle do-while para pedir al usuario que adivine el número.
        // El programa debe indicar si el número es mayor o menor, y continuar hasta que el usuario acierte.
        Scanner entrada = new Scanner(System.in);
        //genera un numero aleatorio entre 0 y 10 excluyendo el 10, se pone el +1 para que sea de 1-10
        int numeroAleatorio = (int) ((Math.random()*10)+1);
        int numeroAdivinador;
        int cantidadIntentos = 0;
        System.out.println("¡Adivina el numero entre 1 y 10");
        System.out.println(numeroAleatorio);
        do {
            System.out.println("Introduce tu intento: ");
            numeroAdivinador = entrada.nextInt();
            if (numeroAdivinador<numeroAleatorio){
                System.out.println("El numero es mayor. intenta de nuevo!");
                cantidadIntentos++;
            }else if (numeroAdivinador>numeroAleatorio){
                System.out.println("El numero es menor, intenta de nuevo!");
                cantidadIntentos++;
            }
        } while (numeroAdivinador!=numeroAleatorio);
        System.out.println("¡Correcto! has adivinado el numero en "+cantidadIntentos+" intentos.");
    }

    public static void Ejercicio5(){
        //Desarrolla un programa con un menú que se repita usando do-while. El menú debe tener 4 opciones:
        // 1=Saludar, 2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir.
        // Usa switch para procesar cada opción. El programa solo debe terminar cuando el usuario elija la opción 4.
        Scanner entrada = new Scanner(System.in);
        int opcion;
        LocalTime horaActual = LocalTime.now(); //API para llamar fechas y horas en java LocalTime o LocalDateTime
        int hora = horaActual.getHour(); //clase hora actual y llamamos a obtener la hora.
        int minuto = horaActual.getMinute(); //clase hora actual y llamaos a obtener los minutos

        do {
            System.out.printf("--- Menu ---\n" +
                    "1. Saludar\n" +
                    "2. Despedirse\n" +
                    "3. Ver hora\n" +
                    "4. Salir\n");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 -> System.out.println("¡Hola! ¿como estas?");
                case 2 -> System.out.println("¡Hasta luego!");
                case 3 -> System.out.println("la hora actual es: "+hora+":"+minuto);
                case 4 -> System.out.println("¡Has salido del programa!");
                default -> System.out.printf("Opcion no valida!\n" + "Escribe una opcion valida.\n");
            }
        }while(opcion != 4);
    }

    public static void Ejercicio6(){
        //Escribe un programa que pida un número N y
        // use un bucle while para hacer una cuenta atrás desde N hasta 1,
        // mostrando cada número. Al llegar a 1, debe mostrar "¡Despegue!".
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i = 1;
        System.out.println("Digite un numero para la cuenta regresiva!");
        numero = entrada.nextInt();
        System.out.println("Cuenta atras!");
        while (numero>=i){
            System.out.println(numero);
            numero--;
        }
        System.out.println("Despegue!");
    }

    public static void Ejercicio7(){
        //Crea un programa que pida al usuario cuántas calificaciones va a introducir.
        // Luego, usa un bucle while para pedir cada calificación una por una,
        // sumarlas y al final calcular y mostrar el promedio.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite cuantas calificaciones va a introducir:");
        int cantidad = entrada.nextInt();
        int i = 0;
        double calificacion;
        double suma = 0;
        double promedio;
        while (i<cantidad){
            i++;
            System.out.println("Introduce la calificacion: "+i);
            calificacion = entrada.nextDouble();
            suma+=calificacion;
        }
        promedio=suma/cantidad;
        System.out.printf("Suma total: %.1f\n" +
                "Promedio total de las calificaciones: %.2f",suma,promedio);
    }

    public static void Ejercicio8(){
        //Desarrolla un programa que pida la edad del usuario.
        // Usa un bucle do-while para validar que la edad introducida esté entre 0 y 120.
        // Si no es válida, debe volver a pedirla. Una vez válida, muestra un mensaje de confirmación.
        Scanner entrada = new Scanner(System.in);
        int edad;
        boolean validarEdad;
        do {
            System.out.println("Introduce tu edad: ");
            edad = entrada.nextInt();
            if (edad > 0 && edad < 120){
                validarEdad = true;
                System.out.println("Edad valida: "+edad+ " años. ¡Gracias!");
            }else{
                validarEdad = false;
                System.out.println("Edad no valida, Debe estar entre 0 y 120.");
            }
        }while (!validarEdad);
    }

    public static void Ejercicio9(){
        //Crea un programa que pida al usuario cuántos estudiantes hay en una clase.
        // Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10).
        // Luego, usa un bucle for para mostrar todas las calificaciones
        // y usa un switch para convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.
        Scanner entrada = new Scanner(System.in);
        int cantidadEstudiantes;
        int i=0;
        double acumuladoNota = 0;
        int notaEstudiante;
        System.out.println("Cuantos estudiantes hay?");
        cantidadEstudiantes = entrada.nextInt();
        while (i<cantidadEstudiantes){
            i++;
            System.out.println("Introduce la nota del estudiante "+i+ " : ");
            notaEstudiante = entrada.nextInt();
            acumuladoNota += notaEstudiante;
        }
        for (int j = 1; j <= i; j++) {
            System.out.println("Estudiante "+j+ ": "+acumuladoNota);
        }

    }

    public static void Ejercicio10(){
        //Desarrolla un programa que simule un cajero automático. El saldo inicial es 1000€.
        //Usa un bucle do-while para mostrar un menú con opciones:
        // 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir.
        // Usa switch para cada opción. Para retirar dinero,
        // usa un bucle while para validar que no se retire más del saldo disponible
        // (si intenta retirar más, debe volver a pedir la cantidad).
        // Para depositar, valida que sea una cantidad positiva.
        Scanner entrada = new Scanner(System.in);
        double saldoInicial = 1000;
        int opcion;
        double retiro = 0;
        double deposito = 0;
        do {
            System.out.printf("--- MENU ---\n" +
                    "1. Consultar saldo\n" +
                    "2. Retirar dinero\n" +
                    "3. Depositar dinero\n" +
                    "4. Salir\n" +
                    "Elige una opcion: \n");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.println("Tu saldo actual es: "+saldoInicial);
                }
                case 2 ->{
                    do {
                        System.out.println("Cuanto dinero quieres retirar?");
                        retiro = entrada.nextDouble();
                        if (retiro>saldoInicial){
                            System.out.println("Saldo insuficiente. Su saldo es de: "+saldoInicial);
                        }else {
                            saldoInicial-=retiro;
                            System.out.println("Saldo exitoso. has retirado: "+retiro);
                            System.out.println("Tu nuevo saldo es: "+saldoInicial);
                        }
                    }while (retiro>saldoInicial);
                }
                case 3 ->{
                    while (deposito<=0){
                        System.out.println("Cuanto dinero vas a depositar?");
                        deposito = entrada.nextInt();
                        if (deposito>0){
                            System.out.println("Deposito exitoso. Has depositado: "+deposito);
                            saldoInicial+=deposito;
                            System.out.println("Tu nuevo saldo es de: "+saldoInicial);
                        }else {
                            System.out.println("Deposito invalido, ingresa cantidad positiva.");
                        }
                    }
                }
                case 4 ->{
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                }
            }
        }while (opcion!=4);
    }
}
