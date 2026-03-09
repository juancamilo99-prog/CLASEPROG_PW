package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

    public void leerFichero(String path){
        File file = new File(path);
        System.out.println(file.getName());
        if (file.isDirectory()){
            for (File item : file.listFiles()){
                leerFichero(item.getAbsolutePath());

            }
        }
    }

    /*BIT A BIT*/
    public void leerContenidoFichero(String path){
        // File -> FileReader : poner en modo lectura
        File file = new File(path);
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            int codigo = fr.read();
            while (codigo != -1) {
                System.out.printf("%d - %s\n", codigo, ((char) codigo));
                codigo = fr.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existe");
        } catch (IOException e ){
            System.out.println("no cuentas con permisos suficientes");
            System.out.println("ponte en contacto con tu administrador");
        }finally {
            try {
                fr.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado!");
            }
        }
    }

    /*LINEA A LINEA*/
    public void leerContenidoFicheroLineas(String path){
        // File -> FileReader -> BufferedReader
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file); // -> modo lectura
            bufferedReader = new BufferedReader(fileReader); // -> modo lectura recurrente
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("La ruta es incorrecta");
        } catch (IOException e) {
            System.out.println("no cuentas con los permisos suficientes");
        }
    }

    public void descifrarContenidoFichero(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;
        Scanner scanner = new Scanner(System.in);
        try{
            bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println("dime la clave de cifrado:");
            int clave = scanner.nextInt();
            String line = bufferedReader.readLine();
            String[] numeros = line.split(" ");
            for (String item : numeros) {
                int codigo = Integer.parseInt(item);
                System.out.print((char) (codigo/clave));
            }
        }catch (FileNotFoundException e){
            System.out.println("La ruta es incorrecta");
        } catch (IOException e) {
            System.out.println("no cuentas con los permisos suficientes");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado!");
            }
        }
    }

    public void escrituraFichero(String path){
        File file = new File(path);
        FileWriter fileWriter = null; // -> poner el fichero en tipo de escritura;
        Scanner scanner = new Scanner(System.in);
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("dime con que clave quieres cifrar?");
            int clave = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("dime que quieres guardar en el fichero:");
            String mensaje = scanner.nextLine();
            for (int i=0; i<mensaje.length(); i++){
                char letra = mensaje.charAt(i);
                int codigo = (int)letra;
                fileWriter.write(String.valueOf(codigo*clave));
                fileWriter.write(" ");
            }
        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException  | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }

    public void escrituraSalto(String path){
        File file = new File(path);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.println("1Me imprime la linea del fichero y luego salto de linea");
            printWriter.println("2Me imprime la linea del fichero y luego salto de linea");
            printWriter.println("3Me imprime la linea del fichero y luego salto de linea");
            printWriter.println("4Me imprime la linea del fichero y luego salto de linea");
        } catch (IOException e) {
            System.err.println("Error en el proceso de escritura del fichero");
        } finally {
            try {
                printWriter.close();
            }catch (Exception e){
                System.err.println("Error en el cerrado del fichero");
            }
        }

    }

    public void exportarUsuario(Usuario usuario){
        //me das un usuario y lo escribo en la ruta de exportacion
        File file = new File("src/main/java/resources/usuarios.csv");
        PrintWriter printWriter = null;
            //el fichero no esta
                //lo creas y escribes una linea
                //escribe el usuario
            //el fichero si esta
                //escribe el usuario
        try{
            if (!file.exists()){ // si no esta
                file.createNewFile(); //creamos el ficheroo
                printWriter = new PrintWriter(new FileWriter(file, true)); // -> pongo el fichero en modo escritura,
                // append, es para marcar que existe y hace una linea nueva
                printWriter.println("Nombre, Apellido, DNI"); // -> creamos una linea con nombre, apellido y dni
                // TODO que pasa si el primero no existe?
                exportarUsuario(usuario);
            } else {
                printWriter = new PrintWriter(new FileWriter(file, true));
                printWriter.println(usuario);
            }
        }catch (IOException e){
            System.err.println("Error en el cerrado del fichero");
        }finally {
            try {
                printWriter.close();
            }catch (Exception e){
                System.err.println("Error en el cerrado del fichero");
            }
        }

    }

    public List<Usuario> importarUsuario(){
        File file = new File("src/main/java/resources/usuarios.csv");
        BufferedReader bufferedReader = null;
        List<Usuario> lista = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
            while ((linea = bufferedReader.readLine()) != null){
                //System.out.println(linea); // quiero pasarla a -> split -> usuario
                String[] items =  linea.split(",");
                Usuario usuario = new Usuario(items[0],items[1],items[2]); //pasamos el string a objeto
                lista.add(usuario);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Ruta incorrecta");
            //dime otra ruta importarUsuario(String)
        } catch (IOException e) {
            System.err.println("Error en la lectura del fichero");
        }
        return lista;
    }

    public void escribirObjeto(String path){
        File file = new File(path);
        ObjectOutputStream objectOutputStream = null;
        try {
            // lo inicializamos
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));// ->convertimos el fichero en modo salimos que vamos a usar y le damos de objeto saliente
            //objectOutputStream.writeInt(76);
            objectOutputStream.writeObject(new Usuario("juan", "montero", "123424"));
        } catch (IOException e) {
            System.err.println("Error en la escritura del fichero");
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException | NullPointerException e) {
                System.err.println("Error en el cerrado del fichero");
            }
        }

    }
}


