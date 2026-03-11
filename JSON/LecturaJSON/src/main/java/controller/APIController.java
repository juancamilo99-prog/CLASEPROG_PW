package controller;

import com.google.gson.Gson;
import model.Clasificacion;
import model.Equipo;
import model.Liga;
import model.Team;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlBase = "https://www.thesportsdb.com/api/v1/json/123/";

    public void obtenerLigas(){

        //paso 1. la url de la api
        String urlLigas = urlBase+"all_leagues.php";
        try {
            //lo usamos para mapear
            Gson gson = new Gson();
        //paso 2. abrimos el navegador, cliente para hacer peticion hacia fuera
        HttpClient client = HttpClient.newHttpClient();
        //paso 3. sacar la peticion que vamos hacer
            HttpRequest request = HttpRequest
                    //creo la request
                    .newBuilder()
                    //creo la url de quien le hare la peticion
                    .uri(URI.create(urlLigas))
                    //metodo get para obtener datos
                    .GET().build(); //-> la construimos
        //paso 4. obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //creamos el cuerpo para llamarlo
            JSONObject objectLigas = new JSONObject(response.body());
            //obtenemos un jsonarray del json
            JSONArray arrayLigas = objectLigas.getJSONArray("leagues");
            //recorremos el array
            for (int i = 0; i < arrayLigas.length(); i++) {
                //lo garudamos en una vriable ligajson de cada posicion
                JSONObject ligaJSON = arrayLigas.getJSONObject(i);
                //usamos gson para convertir un objeto de tipo json en un objeto de tipo java
                Liga liga = gson.fromJson(ligaJSON.toString(), Liga.class);
                System.out.println(liga);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void obtenerClasificacion(String id){
        String urlClasificacion = urlBase+"lookuptable.php?l="+id;
        try {
            //lo usamos para mapear
            Gson gson = new Gson();
            //paso 2. abrimos el navegador, cliente para hacer peticion hacia fuera
            HttpClient client = HttpClient.newHttpClient();
            //paso 3. sacar la peticion que vamos hacer
            HttpRequest request = HttpRequest
                    //creo la request
                    .newBuilder()
                    //creo la url de quien le hare la peticion
                    .uri(URI.create(urlClasificacion))
                    //metodo get para obtener datos
                    .GET().build(); //-> la construimos
            //paso 4. obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //creamos el cuerpo para llamarlo obtenemos un objeto
            JSONObject objectClasificacion = new JSONObject(response.body());
            //obtenemos un jsonarray del json
            JSONArray arrayEquipos = objectClasificacion.getJSONArray("table");
            //recorremos el array
            for (int i = 0; i < arrayEquipos.length(); i++) {
                //lo garudamos en una vriable ligajson de cada posicion
                JSONObject equipoJSON = arrayEquipos.getJSONObject(i);
                //usamos gson para convertir un objeto de tipo json en un objeto de tipo java
                Equipo equipo = gson.fromJson(equipoJSON.toString(), Equipo.class);
                System.out.printf("%s - %s - %s - %s - %s\n",
                        equipo.getIntRank(),
                        equipo.getStrTeam(),
                        equipo.getIntWin(),
                        equipo.getIntDraw(),
                        equipo.getIntLoss());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void obtenerClasificacionCompleta(String id){
        String urlClasificacion = urlBase+"lookuptable.php?l="+id;
        try {
            //lo usamos para mapear
            Gson gson = new Gson();
            //paso 2. abrimos el navegador, cliente para hacer peticion hacia fuera
            HttpClient client = HttpClient.newHttpClient();
            //paso 3. sacar la peticion que vamos hacer
            HttpRequest request = HttpRequest
                    //creo la request
                    .newBuilder()
                    //creo la url de quien le hare la peticion
                    .uri(URI.create(urlClasificacion))
                    //metodo get para obtener datos
                    .GET().build(); //-> la construimos
            //paso 4. obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //creamos el cuerpo para llamarlo obtenemos un objeto
            JSONObject objectClasificacion = new JSONObject(response.body());
            //obtenemos un jsonarray del json
            Clasificacion clasificacion = gson.fromJson(objectClasificacion.toString(), Clasificacion.class);
            for (int i = 0; i < clasificacion.getTable().length; i++) {
                Team team = clasificacion.getTable()[i];
                System.out.printf("%s - %s - %s - %s - %s\n",
                        team.getIntRank(),
                        team.getStrTeam(),
                        team.getIntWin(),
                        team.getIntDraw(),
                        team.getIntLoss());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
