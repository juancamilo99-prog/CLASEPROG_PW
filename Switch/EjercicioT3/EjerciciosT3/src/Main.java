import java.util.Scanner;

public class Main {
    public void main(String[] args) {
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
        //Ejercicio11();
        //Ejercicio12();
        //Ejercicio13();
        //Ejercicio14();
        //Ejercicio15();
    }

    public int Ejercicio1(){
        //Crea un programa que pida la edad del usuario
        // y determine si es mayor de edad (18 años o más).
        // Muestra un mensaje indicando si puede votar o no.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = entrada.nextInt();
        if (edad > 18){
            System.out.println("Eres mayor de edad. puedes votar.");
        }else {
            System.out.println("DENEGADO!");
        }
        return edad;
    }

    public int Ejercicio2(){
        //Desarrolla un programa que pida un número al usuario y determine si es positivo,
        // negativo o cero. Muestra el resultado por consola.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        if (num>=0){
            System.out.println("El numero es positivo.");
        }else {
            System.out.println("El numero es negativo.");
        }
        return num;
    }

    public double Ejercicio3(){
        //Escribe un programa que pida la nota de un examen (entre 0 y 10)
        // y determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        double nota = entrada.nextDouble();
        if(nota>=5){
            System.out.println("Enhorabuena! Has aprobado.");
        }else {
            System.out.println("No has aprobado. sigue intentandolo!");
        }
        return nota;
    }

    public float Ejercicio4(){
        //Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
        // aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra: ");
        float compra = entrada.nextFloat();
        if (compra > 100){
            float descuento = compra*10/100;
            float total = compra-descuento;
            System.out.printf("VALOR COMPRA\n" +
                    "__________________\n" +
                    "Importa original: %.2f\n" +
                    "Importe final: %.2f\n", compra,total);
        }else {
            System.out.printf("VALOR COMPRA\n" +
                    "_____________________\n" +
                    "Importe total a pagar: %.2f\n",compra);
        }
        return compra;
    }

    public int Ejercicio5(){
        //Desarrolla un programa que pida un número entero y
        // determine si es par o impar usando el operador módulo.
        // Muestra un mensaje personalizado para cada caso.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        if (num%2==0){
            System.out.println("El numero "+num+" es par.");
        } else {
            System.out.println("El numero "+num+" es impar.");
        }
        return num;
    }

    public int Ejercicio6(){
        //Escribe un programa que pida la edad del usuario y
        // determine si puede acceder a contenido para mayores de 16 años.
        // Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        int edad = entrada.nextInt();
        if (edad>=16){
            System.out.println("Acceso permitido!");
        }else {
            System.out.println("Accesso denegado!");
        }
        return edad;
    }

    public double Ejercicio7(){
        //Crea un programa que pida una nota numérica (0-10)
        // y determine la calificación: Suspenso (0-4),
        // Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nota numerica entre 0-10: ");
        double nota = entrada.nextDouble();
        if (nota<=4){
            System.out.println("Su nota es suspendida!");
        } else if (nota>=5) {
            System.out.println("Su nota es aprobado!");
        } else if (nota>=7) {
            System.out.println("Su nota es notable!");
        }else if (nota>=9){
            System.out.println("Su nota es sobresaliente!");
        }
        return nota;
    }

    public void Ejercicio8(){
        //Desarrolla un programa que pida dos números al usuario y
        // determine cuál es mayor, o si son iguales. Muestra el resultado por consola.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        double p_num = entrada.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double s_num = entrada.nextDouble();
        if (p_num==s_num){
            System.out.println("El numero "+p_num+" es igual a "+s_num);
        }else if (p_num>s_num){
            System.out.println("El numero "+p_num+" es mayor que "+s_num);
        } else if (p_num<s_num) {
            System.out.println("El numero "+s_num+" es mayor que "+p_num);
        } else {
            System.out.println("No disponible.");
        }
    }

    public double Ejercicio9(){
        //Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario.
        // Calcula el IMC (peso / altura²) y determina si está en peso normal
        // (IMC entre 18.5 y 24.9), por debajo del peso normal (IMC menor a 18.5)
        // o por encima del peso normal (IMC mayor a 24.9).
        double imc_bajo = 18.5;
        double imc_alto = 24.9;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu peso en kg: ");
        double peso = entrada.nextDouble();
        System.out.println("Escribe tu altura en metros: ");
        double altura = entrada.nextDouble();
        // IMC es igual a peso dividido / usamos el metodo math.pow para calcular la potencia de altura elevado a la 2
        double IMC = peso/Math.pow(altura,2);
        if (IMC < imc_bajo){
            System.out.printf("Tu IMC es: %.2f\n" +
                    "Tu IMC es menor!",IMC);
        } else if (IMC > imc_alto) {
            System.out.printf("Tu IMC es: %.2f\n" +
                    "Tu IMC es mayor!",IMC);
        } else {
            System.out.printf("Tu IMC es: %.2f\n" +
                    "Tu IMC es normal!",IMC);
        }
        return IMC;
    }

    public double Ejercicio10(){
        //Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
        // La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir",
        // si no, indica el motivo (demasiado bajo o demasiado alto).
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su altura en cm: ");
        double altura = entrada.nextDouble();
        if (altura >= 120 && altura<=200){
            System.out.println("Genial, puedes subir a la atraccion.");
        } else if (altura<120) {
            System.out.println("No puedes subir, eres demasiado bajo.");
        } else if (altura>200) {
            System.out.println("No puedes subir, eres demasiado alto");
        }
        return altura;
    }

    public double Ejercicio11(){
        //Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false).
        // Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%.
        // Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€,
        // descuento del 5%. En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado
        // y el importe final.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el importe de la comra: ");
        double importe = entrada.nextDouble();
        System.out.println("Eres soci@? ");
        boolean socio = entrada.nextBoolean();
        if (importe>=200 && socio == true){
            double descuento = importe*20/100;
            double fn_importe = importe - descuento;
            System.out.printf("Tu descuento es de: %.2f ",descuento);
            System.out.printf("El precio final es de: %.2f",fn_importe);
        } else if (importe<200 && socio == true) {
            double descuento = importe*10/100;
            double fn_importe = importe - descuento;
            System.out.printf("Tu descuento es de: %.2f ",descuento);
            System.out.printf("El precio final es de: %.2f",fn_importe);
        } else if (importe>=300 && socio == false) {
            double descuento = importe*5/100;
            double fn_importe = importe - descuento;
            System.out.printf("Tu descuento es de: %.2f ",descuento);
            System.out.printf("El precio final es de: %.2f",fn_importe);
        }else {
            System.out.println("No te aplica ningun descuento.");
        }
        return importe;
    }

    public void Ejercicio12(){
        //Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos:
        // tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
        // El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña
        // es válida o no, indicando qué requisitos no cumple.
        //Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una contrasenha");
        String clave = entrada.next();
        boolean nCaracteres = clave.length() >= 8;
        boolean esValida = !(clave.equals("123456789") || clave.equals("password"));
        boolean contieneNum = clave.contains("1") || clave.contains("2") || clave.contains("3")
                || clave.contains("4") || clave.contains("5") || clave.contains("6") || clave.contains("7")
                || clave.contains("8") || clave.contains("0");
        if (nCaracteres == true && esValida == true && contieneNum == true){
            System.out.println("La clave es valida");
        }else {
            System.out.println("La clave no es valida!");
        }
    }

    public void Ejercicio13(){
        //Escribe un programa para calcular el precio de entrada a un museo.
        // Pide la edad del usuario y el día de la semana (1=Lunes, 2=Martes... 7=Domingo).
        // Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años: 5€ (pero gratis los martes).
        // Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€.
        // Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la edad del usuario: ");
        int edad = entrada.nextInt();
        System.out.println("Introduce el dia de la semana: ");
        int dia = entrada.nextInt();
        if (edad<12){
            System.out.println("Entrada gratis ");
        } else if (edad>=12 && dia == 2) {
            System.out.println("La entrada es gratis");
        } else if (edad>=12) {
            int price = 5;
            System.out.println("El precio son "+price);
        } else if (edad >=18 && dia == 4) {
            int price = 7;
            System.out.println("El precio son "+price);
        } else if (edad>=18) {
            int price = 10;
            System.out.println("El precio son "+price);
        }else {
            int price = 6;
            System.out.println("El precio son "+price);
        }
    }

    public void Ejercicio14(){
        //Desarrolla un programa que determine si una persona es elegible para un préstamo bancario.
        // Pide: edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false).
        // Los requisitos son: Edad entre 21 y 65 años, ingresos mensuales de al menos 1000€, y NO tener deudas pendientes.
        // El programa debe evaluar cada condición y mostrar si es elegible o no, explicando qué requisitos no cumple.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingresos mensuales?: ");
        double ingresos = entrada.nextDouble();
        System.out.println("Tienes deudas pendientes? (true/false) ");
        boolean deudas = entrada.nextBoolean();
        boolean comprobarEdad = edad >= 21 && edad<=65;
        boolean comprobarIngresos = ingresos>=1000;
        if (comprobarEdad && comprobarIngresos && deudas == false){
            System.out.println("Felicidades, eres elegible para el prestamo!");
            System.out.println("motivos:");
            System.out.printf("Edad entre 21 y 65?: %b\n" +
                    "Ingresos >= 1000?: %b\n" +
                    "Tienes deudas pendientes?: %b\n",comprobarEdad,comprobarIngresos,deudas);
        }else {
            System.out.println("No es elegebile para el prestamo!");
            System.out.println("motivos:");
            System.out.printf("Edad entre 21 y 65?: %b\n" +
                    "Ingresos >= 1000?: %b\n" +
                    "Tienes deudas pendientes?: %b\n",comprobarEdad,comprobarIngresos,deudas);
        }
    }

    public void Ejercicio15(){
        //Crea un programa que calcule el coste de envío de un paquete.
        // Pide: peso del paquete (kg), distancia de envío (km), y si es envío urgente (true/false).
        // Las reglas son: Precio base: 5€. Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional.
        // Si la distancia es mayor de 100km, añadir 10€. Si es envío urgente, multiplicar el precio total por 1.5.
        // Muestra todos los cálculos paso a paso.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el peso del paquete en kg?: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite la distancia del envio en km: ");
        double distancia = entrada.nextDouble();
        System.out.println("El envio es urgente? true/false");
        boolean urgente = entrada.nextBoolean();
        double price = 5;
        double costeExtra = 0;
        double extraDistancia = 0;
        double kgExtra = 0;
        boolean validarPeso = peso>5;
        boolean validarDistancia = distancia > 100;
        if (validarPeso){
            kgExtra = peso-5;
            costeExtra = kgExtra*2;
            if (validarDistancia){
                extraDistancia = 10;
            }
            double subtotal = price + costeExtra + extraDistancia;
            double total = urgente== true ? subtotal*1.5 : subtotal;
            double extraUrgente = total-subtotal;
            System.out.printf("Precio del paquete\n" +
                    "peso: %.1f\n" +
                    "coste adicional: %.1f\n" +
                    "distancia: %.1f\n" +
                    "coste adicional por distancia: %.1f\n" +
                    "subtotal: %.1f\n" +
                    "es envio urgente? %b\n" +
                    "recargo por urgencia? %.1f\n" +
                    "coste total del envio: %.1f\n",peso,costeExtra,distancia,extraDistancia,subtotal,urgente,extraUrgente,total);
        }else {
            System.out.println("el precio es: "+price);
        }
    }
}
