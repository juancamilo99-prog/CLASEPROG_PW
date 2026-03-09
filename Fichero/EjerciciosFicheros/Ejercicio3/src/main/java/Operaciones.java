import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Operaciones {

    public void copiaFichero(String origen, String destino) {
        File file_origen = new File(origen);
        File file_destino = new File(destino);

        try {
            if (!file_origen.exists()) {
                System.out.println("El origen no existe");
            } else {
                Files.copy(file_origen.toPath(), file_destino.toPath().resolve("copia_" +file_origen.getName()), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Se copio el archivo correctamente "+file_destino.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al copiar el fichero.");
        }
    }

    public void copiarFicheroenDos(String origen, String destino) {
        File file_origen = new File(origen);
        File carpeta_destino = new File(destino);
        //comprobamos si existe el archivo original
        if (file_origen.exists()) {
            //si existe, continuo. 1. creo un nuevo nombre para el archivo
            //creo el documento con el nuevo nombre
            String nombreCopia = "copia_"+file_origen.getName();
            //se crea el archivo destino nuevo renombrado
            File file_destino = new File(carpeta_destino, nombreCopia);
            //abrimos lo ponemos el archivo origen en modo lectura
            //abrimos y ponemos el archivo destino en modo escritura recurrente
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file_origen));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_destino))){
                String linea; // -> creamos una variable donde se van a guardar las lineas escritas
                //mientras linea sea diferente de null, no terminara
                while ((linea = bufferedReader.readLine()) != null) {
                    //si es diferente de null, entra, escribe la linea
                    bufferedWriter.write(linea);
                    //y actualiza la linea
                    bufferedWriter.newLine();
                }
                System.out.println("Se copio el archivo correctamente");
            } catch (FileNotFoundException e) {
                System.out.println("Error al cargar el fichero.");
            } catch (IOException e) {
                System.out.println("Error en la lectura el fichero.");
            }
        }
    }
}
