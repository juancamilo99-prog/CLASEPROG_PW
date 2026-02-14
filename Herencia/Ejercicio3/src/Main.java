import model.Estudiante;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        Estudiante  estudiante1 = new Estudiante("Marta", 20, "2ª de DAM");
        Estudiante estudiante2 = new Estudiante("Carlos",19,"1ª de DAM");
        estudiante1.Estudiar();
        estudiante2.Estudiar();

    }
}
