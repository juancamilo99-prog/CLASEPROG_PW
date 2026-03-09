import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Operaciones {

    public void leerFichero(String path) {
        //creamos el fichero
        File file = new File(path);
        // lo ponemos en modo lectura
        FileReader fr = null; // -> lo igualamos a null

        try {
            fr = new FileReader(file); //creamos la estancia del archivo
            int codigo = fr.read(); // -> creamos una variable que cogera cada numero cifrado
            while (codigo != -1) { // -> mientras codigo sea distinto de -1 se seguira ejecutando
                //muestra el caracter leido
                System.out.printf("%c", codigo); // -> mientras se cumpla , se mostrara cada caracter de codigo = fr
                // lee el siguiente caracter
                codigo = fr.read(); // -> fr.read : devuelve un numero entero que representa un caracter en ASCII y llega a -1 cuando llega al final del archivo
                //entonces si codigo != 1 -> todavia hay caracteres por leer
                // codigo == 1 -> se termino el archivo y el bucle se detiene
            }
        }catch (FileNotFoundException e) {
            System.err.println("el fichero que intentas leer no existe");
        } catch (IOException | NullPointerException e) {
            System.err.println("no cuentas con permisos suficientes");
        }finally {
            try {
                fr.close(); // cerramos el file
            }catch (IOException | NullPointerException e) {
                System.err.println("Error en el cerrado");
            }
        }
    }

}
