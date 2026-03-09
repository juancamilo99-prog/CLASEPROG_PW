package controller;

import model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Operaciones {

    public void exportarUsuario(Usuario usuario){
        File file = new File("/Users/camilo/Documents/CLASEPROG_PW/Fichero/EjerciciosFicheros/Ejercicio9/src/main/java/baseDatos/usuarios.csv");
        PrintWriter pw = null;
        try{
            if(!file.exists()){
                file.createNewFile();
                pw = new PrintWriter(new FileWriter(file, true));
                pw.println("Nombre, Apellido, DNI");
                pw.close();
                exportarUsuario(usuario);
            } else {
                pw = new PrintWriter(new FileWriter(file, true));
                pw.println(usuario);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }finally {
            try{
                pw.close();
            }catch (Exception e){
                System.err.println("error en el cerrado del fichero");
            }
        }
    }
}
