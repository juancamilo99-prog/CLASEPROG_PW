package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class Asignatura {
    //atributos
    private int id;
    private double calificacion;

    //constructor

    public Asignatura(int id) {
        this.id = id;
    }

    public void mostrarDatos() {
        System.out.println("id: "+getId());
    }
}
