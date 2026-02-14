import model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        /*
        * REPASO
        * PPO -> Programacion orientada a objetos
        * Clase -> public cass Alumno(){} -> molde de lo que sera un objeto
        * Atributos -> cualifican al objeto, siempre privados.
        * Constructores -> minimo -> 1, el "vacio", con firmas diferentes.
        * metodos -> funcionalidad al futuro objeto -> podriamos crear varios con diferentes firmas.
        * metodo - > public void nombreMetodo(parametro){}
        * metodos especiales -> getter y setter -> acceder a las variables / modificar el valor de una variable
        *Clase - >
        *   Main -> Alumno borja = new Alumno();
        *       borja.Acceder a todos los metodos que haya dentro de la clase
        *
        *---------------------------------------------------------------------------
        *
        * Herencia -> obtener "algo" de alguien
        *           Padre -> hijo -> hijos2
        * lo unico que no se hereda son los constructores -> heredarlos manualmente -> mediante la palabra reservada super()
        * superclase: clase de la cual hereda otra clase, utilizando una palabra reservada. extends
        * Abtractas ->
        * las variables o metodos privados -> no se heredan
        * Clase A
        * private atributoA, atributoB
        * constructor(int, int)
        * metodo1()
        * metodo2()
        * getter()
        * setter()
        *
        * claseB contenga todo lo de la claseA.
        *
        * main(){
        *   ClaseA objeto1 = new ClaseA();
        *   objeto1.metodo2()
        * }
        *
        *  polimorfismo -> capacidad de "vestir" un elemento
        *
        *
        *
        * */


        //Persona juan = new Persona("juan", "montero");
        Alumno borja = new Alumno("borja", "martin", 1234);
        Alumno borja2 = new Alumno("camilo", "juan", 12345);
        Alumno borja3 = new Alumno("jose", "david", 123456);
        Persona alumno2 = new Alumno("maria", "lopez", 12345);
        Interino interino1 = new Interino("juan", "gomez", 10000, 7);
        Interino interino2 = new Interino("jose", "lopez", 10500, 6);
        Interino interino3 = new Interino("borja", "martin", 2000, 10);
        Fijo fijo1 = new Fijo("Celia", "gomez", 2000, 12);
        Fijo fijo2 = new Fijo("Julia", "martin", 3000, 15);
        Director director1 = new Director("seymour", "ramon");

        fijo2.mostrarDatos();
        fijo2.pedirAumento(1000);
        fijo2.mostrarDatos();

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(borja);
        listaPersonas.add(borja2);
        listaPersonas.add(borja3);
        listaPersonas.add(borja3);
        listaPersonas.add(interino1);
        listaPersonas.add(interino2);
        listaPersonas.add(fijo2);
        listaPersonas.add(fijo1);
        listaPersonas.add(director1);

        for (Persona persona : listaPersonas) {
            if (persona instanceof Inspector) {
                ((Inspector) persona).realizarInspeccion();
            }
        }
        /*for (Persona persona : listaPersonas) {
            persona.saludar();
            persona.mostrarDatos();
            if (persona instanceof Alumno) {
                //solo podria llamarse desde un alumno
                ((Alumno) persona).realizarExamen();

            } else if (persona instanceof Profesor) {
                //solo podria llamarse profesor
                ((Profesor) persona).corregirExamen();

            }

        }*/
    }
}
