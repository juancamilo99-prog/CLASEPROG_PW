package controller;

import com.google.gson.Gson;
import model.Error;
import model.Producto;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    //String urlBase = "https://dummyjson.com/products";
    public void obtenerDatosporID(String id){
        String urlProducto = "https://dummyjson.com/products/"+id;
        System.out.println(urlProducto);
        try{
            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(new URI(urlProducto))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());
            //System.out.println(response.body());
            if (json.has("message")){
                System.out.println("Mensaje: " + json.getString("message"));
            }else {
                Producto producto = gson.fromJson(json.toString(), Producto.class);
                System.out.printf("ID: %s\n| TITLE: %s\n| DESCRIPCION: %s\n| CATEGORIA: %s\n",
                        producto.getId(),
                        producto.getTitle(),
                        producto.getDescription(),
                        producto.getCategory());
            }
        } catch (URISyntaxException e) {
            System.out.println("URL no existe");
        } catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("No se pudo encontrar el producto");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
