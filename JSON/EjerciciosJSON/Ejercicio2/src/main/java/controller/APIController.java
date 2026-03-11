package controller;

import com.google.gson.Gson;
import model.IdProducto;
import model.Producto;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    String urlBase = "https://dummyjson.com/";
    public void obtenerProductos(String id){
        String urlProducto = urlBase+"products?limit="+id;

        try{
            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlProducto))
                    .GET().build();
            //obteneer la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());
            IdProducto idProducto = gson.fromJson(json.toString(),IdProducto.class);
            for (int i = 0; i < idProducto.getProducts().length; i++) {
                Producto producto = idProducto.getProducts()[i];
                System.out.printf("ID: %s | TITLE: %s | PRICE: %s\n",
                        producto.getId(),
                        producto.getTitle(),
                        producto.getPrice());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
