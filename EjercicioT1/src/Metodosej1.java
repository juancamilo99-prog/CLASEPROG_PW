import java.util.Scanner;

public class Metodosej1 {
    public void Ejercicio1(){
        //Hágase una aplicación que permita introducir el número de bebidas y bocadillos
        //comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
        //bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
        //€). También se podrá introducir el número de alumnos que realizaron la compra
        //(valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
        //bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
        //redondeada a 2 decimales. (CosteBar)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas bebidas vas a comprar? ");
        int bebidas = entrada.nextInt();
        System.out.println("Cuantos bocadillos vas a comprar? ");
        int bocadillos = entrada.nextInt();
        System.out.println("Cual es el valor de cada bebida? ");
        double valor_bebida = entrada.nextDouble();
        System.out.println("Cual es el valor de cada bocadillo? ");
        double valor_bocata = entrada.nextDouble();
        System.out.println("En cuantos alumnos dividimos la compra? ");
        int cant_alumno = entrada.nextInt();
        double sub_bebidas = bebidas*valor_bebida;
        double sub_bocatas = bocadillos*valor_bocata;
        double total_compra = sub_bebidas+sub_bocatas;
        double div_alumno = total_compra/cant_alumno;
        System.out.printf("FACTURA IMPRESA DE COMPRA\n" +
                "__________________________________________\n" +
                "Subtotal de bebidas: %.2f\n" +
                "Subtotal Bocadillos: %.2f\n" +
                "Cantidad de alumnos: %d\n" +
                "Total a pagar por alumno: %.2f\n" +
                "Total de la compra: %.2f\n", sub_bebidas,sub_bocatas,cant_alumno,div_alumno,total_compra);

    }

    public void Ejercicio2(){
        //Permítase introducir el valor con IVA de una compra con dos decimales (la
        //compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha
        //compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue
        //el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor de la compra con IVA: ");
        double compraIVA = entrada.nextDouble();
        System.out.println("Cuanto es el valor de IVA? ");
        double valorIva = entrada.nextDouble();
        double iva = 1+(valorIva/100);
        double comprasinIva = compraIVA/iva;
        double totalIva = compraIVA-comprasinIva;
        System.out.printf("FACTURA DE COMPRA IVA\n" +
                "___________________________________\n" +
                "Valor de la compra: %.2f\n" +
                "IVA: %.0f\n" +
                "Compra sin iva: %.2f\n" +
                "IVA total: %.2f\n",compraIVA,valorIva,comprasinIva,totalIva);
    }

    public void Ejercicio3(){
        //Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
        //centenas, decenas y unidades), y se obtiene el número correspondiente.
        //(Numero)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        int decenas_mil = num/10000;
        int unidades_mil = (num/1000)%10;
        int centenas = (num/100)%10;
        int decenas = (num/10)%10;
        int unidades = (num/1)%10;
        System.out.printf("DESCOMPONER NUMERO\n" +
                "________________________________\n" +
                "Decenas de mil: %d\n" +
                "Unidades de mil: %d\n" +
                "Centenas: %d\n" +
                "Decenas: %d\n" +
                "Unidades: %d\n",decenas_mil,unidades_mil,centenas,decenas,unidades);
    }

    public void Ejercicio4(){
       //Hágase un programa que convierta segundos en horas, minutos y segundos.
        //(Segundos)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce numero en segundos:");
        int num = entrada.nextInt();
        int minutos = (num%3600)/60;
        int hora = num/3600;
        int segundos = num%60;
        System.out.printf("CONVERSION DE HORAS, MINUTOS Y SEGUNDOS\n" +
                "_____________________________________________________\n" +
                "Horas: %d\n" +
                "Minutos: %d\n" +
                "Segundos: %d\n", hora,minutos,segundos);
    }
}

