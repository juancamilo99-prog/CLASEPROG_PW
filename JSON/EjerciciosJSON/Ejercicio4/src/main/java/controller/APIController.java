package controller;

import com.google.gson.Gson;
import conection.GetJson;
import model.Address;
import model.Titulo;
import model.Usuario;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static conection.GetJson.getJson;

public class APIController {

    String urlBase = "https://jsonplaceholder.typicode.com/";
    public void obtenerDatos(String url) {
        String urlDatos = urlBase+"posts/"+url;

        try {
            Gson gson = new Gson();
            //peticion 1
            String jsonPost = getJson(urlDatos);
            Titulo titulo = gson.fromJson(jsonPost.toString(), Titulo.class);
            System.out.println("USER ID: "+titulo.getUserId());
            System.out.println("TITULO: "+titulo.getTitle());
            // peticion 2
            String urlUsuario = urlBase+"users/"+titulo.getUserId();
            String jsonUsuario = getJson(urlUsuario);
            Usuario usuario = gson.fromJson(jsonUsuario.toString(), Usuario.class);
            System.out.println("NOMBRE USUARIO: "+usuario.getName());
            System.out.println("CIUDAD: "+usuario.getAddress().getCity());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
