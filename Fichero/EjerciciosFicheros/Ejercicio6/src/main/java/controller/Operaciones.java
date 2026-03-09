package controller;

import model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {
    private List<Usuario> lista;
    private Operaciones operaciones;

    public Operaciones(){
        lista = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario){
        this.lista.add(usuario);
        System.out.println("usuario agregado con exito");
    }

    public void listarUsuarios(){
        //con un foreach listamos los usuarios del metodo mostrar.
        this.lista.forEach(Usuario::mostrar);
    }

    public void exportarDocumentos(){
        lista.forEach(this::archivocsv);
    }

    public void archivocsv(Usuario usuario){
        File file =  new File("src/main/java/documentos/usuarios.csv");
        PrintWriter pw = null;
        try {
            if (!file.exists()){
                //si no existe, creamos el archivo
                file.createNewFile();
                // lo ponemos en modo escritura y un append para linea nueva si existe
                pw = new PrintWriter(new FileWriter(file,true));
                //escribimos la primera linea del documento.
                pw.println("Nombre, Edad, Calificacion");
                pw.close();
                //retornamos el metodo es decir, que vuelva a empezar
                archivocsv(usuario);
            } else { //si existe
                //lo ponemos en modo escritura
                pw = new PrintWriter(new FileWriter(file,true));
                // escribimos el usuario
                pw.println(usuario);
                pw.close();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        } finally {
            try {
                pw.close();
            }catch (Exception e){
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}
