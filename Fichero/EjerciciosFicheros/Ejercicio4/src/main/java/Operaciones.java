import java.io.File;
import java.util.Date;

public class Operaciones {

    public void obtenerInformacion(String ruta){
        File file = new File(ruta);
        System.out.println("Informacion del archivo: " + file.getAbsolutePath());
        if (file.isFile()){
            //tamaño archivo
            long tamanio = file.length();
            // ultima modificacion
            long modificado = file.lastModified();
            Date fecha = new Date(modificado);

            // permisos
            boolean lectura = file.canRead();
            boolean escritura = file.canWrite();
            boolean ejecucion = file.canExecute();

            //archivos ocultos
            boolean oculto = file.isHidden();

            //ruta absoluta
            String rutaAbsoluta = file.getAbsolutePath();

            System.out.printf("Tamaño: %d\n" +
                    "Ultima modificacion: %s\n" +
                    "Permisos: Lectura(%b), Escritura(%b), Ejecucion(%b)\n" +
                    "Archivo oculto: %b\n" +
                    "Ruta Absoluta: %s",tamanio,fecha,lectura,escritura,ejecucion,oculto,rutaAbsoluta);

        }
    }
}
