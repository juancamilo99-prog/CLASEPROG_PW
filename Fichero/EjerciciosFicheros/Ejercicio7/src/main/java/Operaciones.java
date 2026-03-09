import java.io.File;
import java.util.Date;

public class Operaciones {

    public void exploracion(String path){ //-> solicitamos el path al usuario
        File file = new File(path); //lo convertimos en tipo FILE
        //creamos la variable para guardar la ultima modificacion de los documentos
        long modificationTime = file.lastModified();
        Date modificationDate = new Date(modificationTime);
        //preguntamos si file es directorio
        if (file.isDirectory()){
            //si lo es, entra y recorre todos los files que hay dentro
            for (File item: file.listFiles()){
                //volvemos a preguntar, en este caso, si item es directorio.
                if (item.isDirectory()){
                    //si lo es, imprimimos los directorios
                    System.out.printf("[DIRECTORIO] %s - Ultima modificacion: %s:\t\n",item.getName(),modificationDate);
                }else {
                    //si no lo es, salta al else e imprime los archivos.
                    System.out.printf("[ARCHIVO] %s - Ultima modificacion: %s\t\n",item.getName(),modificationDate);
                }
            }
        }
    }
}
