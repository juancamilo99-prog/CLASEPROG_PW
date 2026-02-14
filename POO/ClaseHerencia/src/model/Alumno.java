package model;

public final class Alumno extends Persona {
    //getter / setter
    //mostrarDatos
    //saludar
    private int numeroMatricula, cursoMatriculado;

    public Alumno(){}

    public Alumno(String nombre, String apellido, int numeroMatricula) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
    }

    public Alumno(String nombre, String apellido, int numeroMatricula, int cursoMatriculado) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
        this.cursoMatriculado = cursoMatriculado;
    }

    public void realizarExamen() {
        System.out.println("Alumno realizando examen");
        int nota = (int) (Math.random()*11);
        System.out.println("Nota: " + nota);
    }

    @Override
    public void saludar() {
        System.out.println("Saludando alumno");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numero matricula: " + numeroMatricula);
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(int cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
}
