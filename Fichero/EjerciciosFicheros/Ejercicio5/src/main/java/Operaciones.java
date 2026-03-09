import java.io.*;

public class Operaciones {

    public void contarLineas(String path){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int contador = 0;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea =  bufferedReader.readLine();
            while (linea != null){
                contador++;
                linea = bufferedReader.readLine();
            }
            System.out.printf("El archivo contiene %d lineas",contador);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}
