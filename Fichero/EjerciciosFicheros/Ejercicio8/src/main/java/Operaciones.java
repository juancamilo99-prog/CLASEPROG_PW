import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    public void contarPalabras(String path){
        File file = new File(path);
        //leemos el archivo linea por linea
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            //creamos dos variables tipo List para guardar las palabras y las repetidas
            List<String> palabrasGuardar = new ArrayList<>();
            List<Integer> palabrasrepetidas = new ArrayList<>(); // -> guarda cuantas veces se repita una palabra
            //creamos una variable donde se guardaran las lineas de las palabras
            String linea;
            int contador = 0; // -> variable para contar las palabras.
            //mientras linea sea distinto de null, seguira.
            while((linea = bufferedReader.readLine()) != null){
                //convertimos la linea en un array de palabras donde las separamos
                String[] palabras = linea.split(" ");
                //recorremos cada palabra
                for (String item : palabras){
                    if (!item.trim().isEmpty()){
                        contador++;
                        item = item.toLowerCase();
                        //si la palabra existe en la lista
                        if (palabrasGuardar.contains(item)){
                            //aumentamos su contador
                            int posicion = palabrasGuardar.indexOf(item);
                            palabrasrepetidas.set(posicion, palabrasrepetidas.get(posicion) + 1);
                        }else {
                            //si no existe la añadimos
                            palabrasGuardar.add(item);
                            palabrasrepetidas.add(1);
                        }
                    }
                }
            }
            //imprimimos los datos
            System.out.println("Archivo: "+ file.getAbsolutePath());
            System.out.println("Numero de palabras: " + contador);
            System.out.println("Las 5 palabras mas frecuentes: ");
            //bucle para mostrar las 5 mas repetidas
            for(int i = 0; i < 5 && i < palabrasGuardar.size(); i++){
                int max = 0; // -> para guardar el numero mas grande de repeticiones
                int indiceMax =0; // -> guardar la posicion donde esta ese numero
                //recorremos todas las repeticiones
                for(int j = 0; j < palabrasrepetidas.size(); j++){
                    //preguntamos si las repeticiones son mayores o es el numero mas grande
                    if(palabrasrepetidas.get(j) > max){
                        //si lo es, obtnemos el numero de repeticiones en esa posicion
                        max = palabrasrepetidas.get(j); // max -> guarda el numero mayor encontrado hasta el momento
                        indiceMax = j; // -> guardamos la posicion del maximo
                    }
                }
                //imprimimos
                System.out.println(palabrasGuardar.get(indiceMax) + " -> " + max +" veces");
                palabrasrepetidas.set(indiceMax, -1);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("error al leer el archivo");
        }
    }
}
