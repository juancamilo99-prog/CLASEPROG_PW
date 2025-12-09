package Ejercicio6;

import java.util.concurrent.RecursiveTask;

public class Features {
    public String procesarTareas(String[] tareas){
        //recorremos el array para encontrar la palabra URGENTE
        for (String item : tareas) {
            //usamos el metodo contains para saber si la palabra existe dentro del string
            if (item.contains("URGENTE")){
                // en cuanto encuentre la primera tarea con urgencia, retornamos el string
                return item;
            }
        }
        return "no hay tareas urgentes";
    }
}
