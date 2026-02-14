package model;

public class Persona {
    //variables
    private int id;
    private String nombre;
    private int edad;

    //constructores
    //constructor por defecto o vacio.
    public Persona() {
    }
    //constructor con variables iniciadas.
    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo para mostrar datos
    public void mostrarDatos(){
        System.out.println("los datos de la persona "+id+" se ha encontrado");
        System.out.println("su nombre es "+nombre);
        System.out.println("su edad es "+edad);
    }

    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
