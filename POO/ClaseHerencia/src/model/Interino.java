package model;

public final class Interino extends Profesor{

    private int aniosExperiencia;

    public Interino() {
    }

    public Interino(String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        //aniosExperiencia = 0;
    }

    public Interino(String nombre, String apellido, int salario, int aniosExperiencia) {
        super(nombre, apellido, salario);
        this.aniosExperiencia = aniosExperiencia;
    }

    public Interino(String nombre, String apellido, int salario, int nHoras, int aniosExperiencia) {
        super(nombre, apellido, salario, nHoras);
        this.aniosExperiencia = aniosExperiencia;
    }

    public void realizarOposicion(){
        System.out.println("vamos a realizar la oposicion para plaza fija");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("aniosExperiencia: " + aniosExperiencia);
    }

    @Override
    public void saludar() {
        super.saludar();
        if (aniosExperiencia > 0) {
            System.out.println("solo tengo unos pocos años de experiencia");
        } else {
            System.out.println("soy novato");
        }

        System.out.println("vamos a ver que tal se da la clase.");
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
