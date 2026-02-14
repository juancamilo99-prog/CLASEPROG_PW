import model.Libro;

public class Main {
    static void main(String[] args) {
        /*Crea una clase Libro con atributos titulo, autor y paginas.
        Implementa tres constructores: uno sin parámetros (valores por defecto),
        uno con título y autor, y otro con los tres parámetros.
        Crea tres objetos usando cada constructor y muestra sus datos.*/

        Libro libro1 = new Libro("Sin titulo", "Desconocido");
        Libro libro2 = new Libro("Don Quijote", "Miguel de cervantes");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 471);

        //libro 1
        System.out.println("Libro 1: " + libro1.getTitulo() + ", Autor: "+ libro1.getAutor()+", "+ libro1.getPaginas()+" Paginas.");
        //libro 2
        System.out.println("Libro 2: " + libro2.getTitulo() + ", Autor: "+ libro2.getAutor()+", "+ libro2.getPaginas()+" Paginas.");
        //libro 3
        System.out.println("Libro 3: " + libro3.getTitulo() + ", Autor: "+ libro3.getAutor()+", "+ libro3.getPaginas()+" Paginas.");
    }
}
