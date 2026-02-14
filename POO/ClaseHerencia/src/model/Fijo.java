package model;

public final class Fijo extends Profesor implements Inspector{

    private int hCotizadas;

    public Fijo() {
    }

    public Fijo(String nombre, String apellido, int salario, int hCotizadas) {
        super(nombre, apellido, salario);
        this.hCotizadas = hCotizadas;
    }

    public Fijo(String nombre, String apellido, int salario, int nHoras, int hCotizadas) {
        super(nombre, apellido, salario, nHoras);
        this.hCotizadas = hCotizadas;
    }

    public void pedirAumento(int aumentar){
        setSalario(getSalario()+aumentar);
        System.out.println("aumentas salario en: "+aumentar);
    }

    @Override
    public void realizarInspeccion() {
        System.out.println("yo tambien inspecciono pero pasare cosas por alto");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nHoras cotizadas: "+hCotizadas);
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("soy un profesor fijo, doy la clase genial");
        System.out.println("mi puesto no me lo quita nadie");
    }

    public int gethCotizadas() {
        return hCotizadas;
    }

    public void sethCotizadas(int hCotizadas) {
        this.hCotizadas = hCotizadas;
    }
}
