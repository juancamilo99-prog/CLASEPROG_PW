package Ejercicio10;

public class Modulos {
    boolean verificarStock(int cantidad, int stock){
        if (stock<cantidad){
            System.out.println("no hay stock suficiente");
            return false;
        }
        return true;
    }
    public void procesarPedidos(String[] productos, int[] stock, double[] precio){
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            if (stock[i] == 0) {
                continue; // saltamos si no hay cantidad
            }
            if (precio[i] < 0) {
                System.out.println("Error: el precio negativo en "+productos[i]);
                break;
            }
            double subtotal = stock[i] * precio[i];
            double descuento = calcularDescuento(precio[i], stock[i]);
            subtotal -= descuento;
            total += subtotal;
            System.out.printf("%s x %d -> %.2f€\n",productos[i],stock[i],subtotal);

            if (total > 1000){
                System.out.println("el limite de 1000 superado. proceso detenido");
                break;
            }
        }
        System.out.printf("Total final: %.2f",total);
    }

    double calcularDescuento(double precio, int cantidad){
        if (cantidad >= 5){
            return precio*0.20;
        }
        if (cantidad >= 10){
            return precio*0.10;
        }
        return 0;
    }
}
