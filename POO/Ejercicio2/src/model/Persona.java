package model;

import javax.swing.*;
import javax.xml.namespace.QName;

public class Persona {
    private int  id;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo
    public void mostrarDatos(){
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    //metodo modificar

    public void modificarDatos(String name, int edad){
       setNombre(name);
       setEdad(edad);
    }

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
