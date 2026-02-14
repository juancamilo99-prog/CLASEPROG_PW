package model;

public class Libro {

    private String titulo;
    private int isbn;
    private String autor;
    private boolean disponible;


    public Libro() {
    }

    public Libro(String titulo, int isbn, String autor, boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = disponible;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("-------------------------");
    }
}
