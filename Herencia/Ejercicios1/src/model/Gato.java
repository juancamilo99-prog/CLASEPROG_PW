package model;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre()+" hace: Miau miau");
    }

    public void mostrarGato(){
        System.out.println("Animal: "+getNombre());
        System.out.println("Edad: "+getEdad());
        hacerSonido();
    }
}
