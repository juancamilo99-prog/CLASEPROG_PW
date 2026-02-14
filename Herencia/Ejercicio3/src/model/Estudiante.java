package model;

public final class Estudiante extends Persona{

    private String curso;

    public Estudiante(){
    }

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void Estudiar(){
        super.presentarse();
        System.out.printf("Estoy estudiando %s\n", curso);
    }
}
