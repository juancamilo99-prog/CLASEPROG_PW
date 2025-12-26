import model.Alumno;
import model.Asignatura;
import model.Profesor;


public class Main {

    public static void main(String[] args) {
        Asignatura programacion = new Asignatura();
        //caracteristicas, id=0, calificacion=0.0;
        Asignatura sistemas = new Asignatura(4);
        Asignatura entornos = new Asignatura(5);

        Alumno alumno = new Alumno();
        Alumno maria = new Alumno(programacion, sistemas, entornos);
        Alumno celia = new Alumno(1,2,3);

        Profesor profesor = new Profesor();
        alumno.mostrarDatos();
        profesor.ponerNotas(maria);

    }
}
