package Ejercicio6;

public class Main {
    static void main(String[] args) {
        //creamos un array con diferentes tareas
        String[] tarea1 = {"proyecto", "tarea programacion URGENTE", "ir gimnasio URGENTE", "llamar a la abuela"};
        String[] tarea2 = {"preparar la comida", "ir al medico", "leer", "clase de matematicas URGENTE"};
        //llamamos al metodo
        Features features = new Features();
        System.out.println(features.procesarTareas(tarea1));
        System.out.println(features.procesarTareas(tarea2));

    }
}
