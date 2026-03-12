import controller.APIController;
import model.Preguntas;

public class Main {
    public static void main(String[] args) {
        APIController apiController = new APIController();
        apiController.obtenerDatos();
    }
}
