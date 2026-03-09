import controller.Operaciones;

public class Main {
    public static void main(String[] args) {
        /*File fichero = new File("src/main/java/resources/analisis-secundario.txt");
        // fichero logico y fisico
        System.out.println("Informacion del fichero");
        if (fichero.exists()) {
            System.out.println("su ruta absoluta es: "+fichero.getAbsolutePath());
            System.out.println("Puede escribir? "+fichero.canWrite());
            System.out.println("tamaño "+fichero.length());
        }else {
            try {
                fichero.createNewFile();
                System.out.println("Fichero creada exitosamente");
            } catch (IOException e) {
                System.out.println("Error al crear el fichero");
                System.out.println(e.getMessage());
                //solucion -> indica otra ruta para crear el fichero
            }
        }*/

        /*File carpeta = new File("src/main/java/resources/carpeta1");*/
        /*if (carpeta.isDirectory()) {
            for (String item : carpeta.list()) {
                System.out.println(item);
            }

        }*/
        /*if (carpeta.isDirectory()) {
            for (File item : carpeta.listFiles()) {
                System.out.println(item.getName());
                System.out.println(item.isDirectory());
                //sacar los ficheros de una subcarpeta
                if (item.isDirectory()){
                    for (File data : item.listFiles()) {
                        System.out.println("\t"+data.getName());
                        if (data.isDirectory()){
                            for (File data1 : data.listFiles()) {
                                System.out.println("\t\t"+data1.getName());
                            }
                        }
                    }
                }
            }
        }*/


        /*File listaFicheros = new File("/Users/camilo/Documents");
        System.out.println("Informacion de los ficheros");
        if (listaFicheros.exists()) {
            System.out.println("Ficheros existentes en el archivo");
            System.out.println("su ruta es: "+listaFicheros.getAbsolutePath());
            System.out.println("tamaño de los ficheros: "+listaFicheros.length());
        }

        int contador = 0;
        if (listaFicheros.isDirectory()) {
            for (File item : listaFicheros.listFiles()) {
                System.out.println(" ".repeat(+1)+"|-"+item.getName());
                if (item.isDirectory()) {
                    for (File data :  item.listFiles()) {
                        contador++;
                        System.out.println(" ".repeat(contador)+"|--"+data.getName());
                    }
                }
            }
        }*/

        /*File fichero = new File("/Users/camilo/Documents");
        File[] carpetas = fichero.listFiles();

        int contador = 0;
        if (carpetas != null) {
            for (File file : carpetas) {
                if (file.isDirectory()){
                    System.out.println("└──"+file.getName());
                    if (file.isDirectory()){
                        for (File fichero1 : file.listFiles()) {
                            contador++;
                            System.out.println(" ".repeat(contador)+"├──"+fichero1.getName());
                        }
                    }
                }
            }
        }*/

        Operaciones operaciones = new Operaciones();
        //operaciones.leerContenidoFichero("src/main/java/resources/analisis.txt");
        //operaciones.leerContenidoFicheroLineas("src/main/java/resources/analisis.txt");
        //operaciones.descifrarContenidoFichero("src/main/java/resources/carpeta1/lectura.txt");
        //operaciones.descifrarContenidoFichero("src/main/java/resources/carpeta1/escritura.txt");
        //operaciones.escrituraFichero("src/main/java/resources/carpeta1/escritura.txt");
        //operaciones.escrituraSalto("src/main/java/resources/carpeta1/ejemplo_salto.txt");
        operaciones.escribirObjeto("src/main/java/resources/objetos.dat");

    }
}

