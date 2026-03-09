import java.io.*;
import java.util.Scanner;

public class Operaciones {

    public int buscarPalabra(String path, String palabra){
        File file = new File(path);
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] letra = linea.split("\\W+");
                for (String item : letra){
                    if (item.equals(palabra)){
                        contador++;
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.err.println("Error: Archivo no encontrado");
        } catch (IOException | NullPointerException e) {
            System.err.println("Error: no cuentas con permisos suficientes");
        }
        return contador;
    }
}