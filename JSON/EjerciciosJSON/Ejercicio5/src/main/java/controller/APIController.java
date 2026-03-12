package controller;

import com.google.gson.Gson;
import model.Atributos;
import model.Nombre;
import model.Stat;

import java.io.IOException;
import java.net.URISyntaxException;

import static conection.GetJson.getJson;

public class APIController {

    String urlBase = "https://pokeapi.co/api/v2/";
    public void obtenerDatos(String url){
            String urlDatos = urlBase+"pokemon/"+url;
        try{
            Gson gson = new Gson();
            //peticion 1 para el nombre
            String jsonPost = getJson(urlDatos);
            Nombre nombre = gson.fromJson(jsonPost.toString(), Nombre.class);
            System.out.println("Nombre: "+nombre.getName());
            System.out.println("Altura: "+nombre.getHeight());
            System.out.println("Peso: "+nombre.getWeight());
            Atributos atributos = gson.fromJson(jsonPost.toString(), Atributos.class);
            for (int i = 1; i < 4; i++) {
                Stat stat = atributos.getStats()[i];
                System.out.printf("Base Stat [%d]: %d\n",i,stat.getBase_stat());
                System.out.printf("Stat [%d]: %s\n ",i,stat.getStat().getName());
            }
            //peticion 2

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
