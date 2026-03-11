package controller;

import com.google.gson.Gson;
import model.Name;
import model.Persona;
import model.Result;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIcontroller {

    private String urlBase = "https://randomuser.me/api/";
    public void obtenerDatos(String id){
        String urlDatos = urlBase+"?resultados="+id;
        try {
            Gson gson = new Gson();
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(new URI(urlDatos))
                    .GET().build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());
            Persona persona = gson.fromJson(json.toString(), Persona.class);
            for (int i = 0; i < persona.getResults().length; i++) {
                Name name = persona.getResults()[i].getName();
                Result result = persona.getResults()[i];
                System.out.printf("nombre: %s - %s - %s | Email: %s | Pais: %s\n",
                        name.getTitle(),
                        name.getFirst(),
                        name.getLast(),
                        result.getEmail(),
                        result.getNat());

            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
