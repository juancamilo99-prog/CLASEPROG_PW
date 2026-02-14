package model;

public class Perro extends Animal{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre()+" hace: Guau guau");
    }

    public void mostrarPerro(){
        System.out.println("Animal: "+getNombre());
        System.out.println("Edad: "+getEdad());
        hacerSonido();
    }
}
