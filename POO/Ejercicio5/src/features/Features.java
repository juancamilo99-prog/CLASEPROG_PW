package features;

import com.sun.tools.javac.Main;
import model.CuentaBancaria;
import java.util.Scanner;

public class Features {
    Scanner sc = new Scanner(System.in);
    CuentaBancaria cuentaBancaria = new CuentaBancaria();
    CuentaBancaria cuenta1 = new CuentaBancaria(10, "Juan Garcia", 1500);
    CuentaBancaria cuenta2 = new CuentaBancaria(2, "Maria Lopez", 800);
    CuentaBancaria cuenta3 = new CuentaBancaria(3, "Pedro martin", 1200);
    CuentaBancaria[] cuentas = {cuenta1, cuenta2, cuenta3};
    private int cantidadDinero;

    public void menuBanco(){
        System.out.println("---MENU---");
        System.out.println("Seleccion una opcion");
        System.out.println("1. Depositar en cuenta");
        System.out.println("2. Retirar en cuenta");
        System.out.println("3. Mostrar usuarios");
        int op = sc.nextInt();
        switch (op){
            case 1 -> depositarDinero(cuentas);
            case 2 -> retirarDinero(cuentas);
            case 3 -> {
                mostrarUsuarios(cuenta1);
                mostrarUsuarios(cuenta2);
                mostrarUsuarios(cuenta3);
            }
            default -> System.out.println("error");
        }
    }

    public void depositarDinero(CuentaBancaria[] cuenta){
        System.out.println("Ingrese el id de cuenta");
        int idCuentaBancaria = sc.nextInt();
        boolean encontrar = false;
        for (CuentaBancaria bancaria : cuenta) {
            if (idCuentaBancaria == bancaria.getId()) {
                System.out.println("Usuario encontrado con nombre: "+bancaria.getTitular());
                System.out.println("Cuanto dinero desea depositar?");
                cantidadDinero = sc.nextInt();
                bancaria.setCantidad(bancaria.getCantidad() + cantidadDinero);
                System.out.println("Has ingresado en cuenta: "+cantidadDinero);
                System.out.println("El nuevo saldo es: "+bancaria.getCantidad());
                System.out.println("Ingreso Exitoso!.");
                encontrar = true;
                break;
            }
        }

        if (!encontrar) {
            System.out.println("cuenta no encontrada.");
        }
    }

    public void retirarDinero(CuentaBancaria[] cuenta){
        System.out.println("Ingrese el id de cuenta");
        int idCuentaBancaria = sc.nextInt();
        boolean encontrar = false;
        for (CuentaBancaria bancaria : cuenta) {
            if (idCuentaBancaria == bancaria.getId()) {
                System.out.println("Usuario encontrado con nombre: "+bancaria.getTitular());
                System.out.println("Cuanto dinero desea depositar?");
                cantidadDinero = sc.nextInt();
                bancaria.setCantidad(bancaria.getCantidad() - cantidadDinero);
                System.out.println("Has ingresado en cuenta: "+cantidadDinero);
                System.out.println("El nuevo saldo es: "+bancaria.getCantidad());
                System.out.println("Retiro Exitoso!.");
                encontrar = true;
                break;
            }
        }

        if (!encontrar) {
            System.out.println("cuenta no encontrada.");
        }
    }

    public void mostrarUsuarios(CuentaBancaria cuentaBancaria){
        System.out.println(cuentaBancaria);
    }
}
