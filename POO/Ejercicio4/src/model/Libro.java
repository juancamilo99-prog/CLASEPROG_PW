package model;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    //Constructor sin parametros
    public Libro() {
    }

    //Constructor con 2 variables
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Constructor con 3 variables
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
