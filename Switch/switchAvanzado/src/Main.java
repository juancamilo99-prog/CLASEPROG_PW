import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio6();
    }

    public static void Ejercicio1(){
        //**Objetivo:** Crear un programa que convierta una
        // calificación numérica (0-10) en su equivalente alfabético usando un switch.
        //
        //**Requisitos:**
        //
        //1. Declara una variable `double calificacion` con un valor entre 0 y 10.
        //2. Usa un `switch` para convertir la calificación a una letra (A, B, C, D, F).
        //3. Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
        //4. Muestra un mensaje apropiado para cada calificación.
        Scanner entrada = new Scanner(System.in);
        double CALIFICACION;
        int rango;
        System.out.println("Digite la calificacion: ");
        CALIFICACION = entrada.nextDouble();
        rango = (int) (CALIFICACION * 10);
        switch (rango){
            case 90,91,92,93,94,95,96,97,98,99,100 ->{
                System.out.println("Tu nota es: A");
            }
            case 70,71,72,73,74,75,76,77,78,79,80,81
                    ,82,83,84,85,86,87,88,89->{
                System.out.println("Tu nota es: B");
            }
            case 60,62,63,64,65,66,67,68,69,50,51,52,53,54,
                 55,56,57,58,59->{
                System.out.println("Tu nota es: C");
            }
            case 40,41,42,43,44,45,46,47,48,49,30,31,32,33,34,
                 35,36,37,38,39->{
                System.out.println("Tu nota es: D");
            }
            default -> {
                if (rango >= 0 && rango < 40){
                    System.out.println("Tu nota es: F");
                } else {
                    System.out.println("Valor no valido.");
                }
            }
        }
    }

    public static void Ejercicio2(){
        //**Objetivo:** Crear un programa que convierta una cantidad en
        // euros a otras monedas según la opción seleccionada.
        //
        //**Requisitos:**
        //
        //1. Crea un enum `Moneda` con: `DOLAR`, `LIBRA`, `YEN`, `PESO`.
        //2. Declara una variable `double euros` con una cantidad.
        //3. Usa un `switch` con el enum para aplicar la tasa de conversión correspondiente.
        //4. Muestra el resultado de la conversión.
        /*=============================================*/
        //creamos el enum con las monedas que se podran intercambiar
        enum Monedas {dolar, libra, yen, peso}
        Scanner entrada = new Scanner(System.in);
        //creamos las variables que usaremos
        double cantidadEuro = 0;
        double total;
        double dolar = 1.16;
        double libra = 0.88;
        double yen = 179.00;
        double peso = 4354;
        //creamos el metodo renombrando al enum Monedas
        Monedas moneda;
        System.out.printf("Digite el nombre de moneda que quiere intercambiar\n" +
                "1. dolar\n" +
                "2. libra\n" +
                "3. yen\n" +
                "4. peso\n");
        //monedas es igual al enum Monedas dandole el valor del Scanner
        moneda = Monedas.valueOf(entrada.next());
        //preguntamos si lo que se ingresa en la variable moneda es igual a lo que hay dentro del enum.
        //si lo es, solicitamos la cantidad de queremos cambiar.
        if (moneda == Monedas.dolar || moneda == Monedas.yen || moneda == Monedas.libra || moneda == Monedas.peso){
            System.out.println("Digite la cantidad de euros a cambiar.");
            cantidadEuro = entrada.nextDouble();
        }
        //creamos el switch y en los casos llamamos las opciones del enum
        switch (moneda){
            case dolar -> {
                System.out.println("Intercambiara EUR/DOLAR");
                total = cantidadEuro*dolar;
                System.out.println(total);
            }
            case libra -> {
                System.out.println("Intercambiara EUR/LIB");
                total = cantidadEuro*libra;
                System.out.println(total);
            }
            case yen -> {
                System.out.println("Intercambiara EUR/YEN");
                total = cantidadEuro*yen;
                System.out.println(total);
            }
            case peso -> {
                System.out.println("Intercambiara EUR/PESO");
                total = cantidadEuro*peso;
                System.out.println(total);
            }
            default -> {
                System.out.println("Moneda no disponible.");
            }
        }

    }

    public static void Ejercicio4(){
        /*
        * **Objetivo:** Simular un sistema de pedidos de restaurante con diferentes categorías.

            **Requisitos:**

            1. Crea un enum `CategoriaPlato` con: `ENTRADA`, `PRINCIPAL`, `POSTRE`, `BEBIDA`.
            2. Declara una variable del tipo enum.
            3. Usa un `switch` para mostrar 3 opciones disponibles de cada categoría.
            4. Agrupa categorías similares si es apropiado.*/
            Scanner entrada = new Scanner(System.in);
            //declaramos una variable string
            String categoria;
            System.out.println("escribe la categoria: ");
            categoria = entrada.next();
            //renombramos el ENUM CategoriaPlato = categorias y CategoriaPlato = al valor de categoria.
            CategoriaPlato categorias = CategoriaPlato.valueOf(categoria);
            switch (categorias){
                case entrada -> {
                    System.out.printf("Primera opcion: %s\n" +
                            "Segunda opcion: %s\n" +
                            "Tercera opcion: %s\n",CategoriaPlato.entrada.opcion1,CategoriaPlato.entrada.opcion2,CategoriaPlato.entrada.opcion3);
                }
                case principal -> {
                    System.out.printf("Primera opcion: %s\n" +
                            "Segunda opcion: %s\n" +
                            "Tercera opcion: %s\n",CategoriaPlato.principal.opcion1,CategoriaPlato.principal.opcion2,CategoriaPlato.principal.opcion3);
                }
                case postre -> {
                    System.out.printf("Primera opcion: %s\n" +
                            "Segunda opcion: %s\n" +
                            "Tercera opcion: %s\n",CategoriaPlato.postre.opcion1,CategoriaPlato.postre.opcion2,CategoriaPlato.postre.opcion3);
                }
                case bebida -> {
                    System.out.printf("Primera opcion: %s\n" +
                            "Segunda opcion: %s\n" +
                            "Tercera opcion: %s\n",CategoriaPlato.bebida.opcion1,CategoriaPlato.bebida.opcion2,CategoriaPlato.bebida.opcion3);
                }
                default -> throw new IllegalStateException("Unexpected value: " + categoria);
            }
    }

    public static void Ejercicio5(){
        /*
        * **Objetivo:** Crear una calculadora simple que realice operaciones según un operador.
        **Requisitos:**

        1. Declara dos variables `double num1` y `double num2`.
        2. Declara una variable `char operador` con valores posibles: '+', '-', '*', '/'.
        3. Usa un `switch` para realizar la operación correspondiente.
        4. Maneja el caso especial de división por cero.*/
        Scanner entrada = new Scanner(System.in);
        //creamos las variables que usaremos
        double num1 = 0, num2 = 0, total = 0;
        char operador = ' ';
        //solicitamos ingresar el tipo de operacion
        System.out.println("que operacion quieres realizar?");
        operador = entrada.next().charAt(0);
        /*hacemos una condicion para que en el caso de que la operacion sea suma, resta,
        division o multiplicacion se imprima el mensaje para digitar los dos numeros a operar*/
        if (operador == '+' || operador == '-' || operador == '*' || operador == '/'){
            /*Creamos una condicion para que se repita en caso de que el numero a dividir sea 0*/
            while (num1 == 0 || num2 == 0 && operador == '/'){
                System.out.println("digite numero 1");
                num1 = entrada.nextDouble();
                System.out.println("digite numero 2");
                num2 = entrada.nextDouble();
                /*creamos una condicion en caso de que se de se divida por 0
                * arroje un mensaje que diga que no se pude dividir por 0*/
                if (num1 == 0 || num2 == 0 && operador == '/'){
                    System.out.println("No se puede dividir por 0");
                }
            }
        }
        /* creamos el switch para evaluar las opciones*/
        switch (operador){
            case '+' -> {
                total = num1+num2;
                System.out.println("La operacion de esta suma es: "+total);
            }
            case '-' -> {
                total = num1-num2;
                System.out.println("La operacion de esta resta es: "+total);
            }
            case '*' -> {
                total = num1*num2;
                System.out.println("La operacion de esta multiplicacion es: "+total);
            }
            case '/' -> {
                total = num1/num2;
                System.out.println("La operacion de esta division es: "+total);
            }
        }

    }

    public static void Ejercicio6(){
        /*Objetivo:** Simular un sistema de seguimiento de pedidos con diferentes estados.

         **Requisitos:**

         1. Crea un enum `EstadoPedido` con: `PENDIENTE`, `PROCESANDO`, `ENVIADO`, `EN_TRANSITO`, `ENTREGADO`, `CANCELADO`.
         2. Crea un metodo mobtenerEstadoActual() que devuelva aleatoriamente uno de estos estados.
         3. En el `main`, usa un `switch` para mostrar un mensaje detallado del estado.
         4. Indica el siguiente paso esperado para cada estado (excepto ENTREGADO y CANCELADO).*/
        //se llama al metodo con nuevo nombre
        obtenerEstadoActual estado = new obtenerEstadoActual();
        //se llama al ennum con nuevo nombre igual al nombre del metodo
        //llamando a la instancia obtenerEstado
        EstadoPedido estadoActual = estado.obtenerEstado();
        //evaluamos el enum
        switch (estadoActual){
            case PENDIENTE -> {
                System.out.printf("Detalle: %s",EstadoPedido.PENDIENTE.detallle_pendiente);
            }
            case PROCESANDO -> {
                System.out.printf("Detalle: %s",EstadoPedido.PROCESANDO.detalle_procesando);
            }
            case ENVIADO -> {
                System.out.printf("Detalle: %s",EstadoPedido.ENVIADO.detalle_enviado);
            }
            case EN_TRANSITO -> {
                System.out.printf("Detalle: %s",EstadoPedido.EN_TRANSITO.detalle_transito);
            }
        }
    }
}
