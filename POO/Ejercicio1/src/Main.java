import model.Persona;

public class Main {
    /*Crea una clase llamada Persona con dos atributos: nombre y edad.
    Define un constructor que inicialice estos atributos.
    En el metodo main, crea un objeto de tipo Persona y muestra sus datos.*/
    static void main(String[] args) {
        Persona persona = new Persona(1,"camilo",26);
        // id = 1 nombre = camilo  edad = 26
        persona.mostrarDatos();
    }
}
