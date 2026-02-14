package model;

public abstract class Profesor extends Persona{

    private int salario;
    private int nHoras;

    public Profesor(){}

    public Profesor(String nombre, String apellido, int salario) {
        super(nombre, apellido);
        this.salario = salario;
    }

    public Profesor(String nombre, String apellido, int salario, int nHoras) {
        super(nombre, apellido);
        this.salario = salario;
        this.nHoras = nHoras;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public void saludar() {
        // TODO escribir el contenido del metodo
        System.out.println("soy profesor y vamos a impartir clases");
    }

    public void corregirExamen(){
        System.out.println("Corregando Examen");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario: "+salario);
        System.out.println("N horas: "+nHoras);
    }
}
