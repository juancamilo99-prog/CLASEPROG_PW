import java.util.Random;

public class obtenerEstadoActual {
    //retornamos el enum EstadoPedido
    public EstadoPedido obtenerEstado(){
        //creamos un array con nombre estados y lo devolvemos con el values
        EstadoPedido[] estados = EstadoPedido.values();
        //creamos el metodo para tomar datos aleatorios
        Random random = new Random();
        //el enum se nombre como estado es igual a estados nombre del metodo random
        //leyendo enteros y la cantidad de elementos que hay del array
        EstadoPedido estado = estados[random.nextInt(estados.length)];
        //imprimimos el numero aleatorio
        System.out.println(estado);
        //retornamos estado
        return estado;
    }
}
