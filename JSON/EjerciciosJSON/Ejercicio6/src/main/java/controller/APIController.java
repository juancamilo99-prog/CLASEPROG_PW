package controller;

import com.google.gson.Gson;
import model.Preguntas;
import model.Result;

import java.io.IOException;
import java.net.URISyntaxException;

import static conection.APIConection.GetJson;

public class APIController {

    public void obtenerDatos(){
        String urlBase = "https://opentdb.com/api.php?amount=3&type=multiple";
        try{
            Gson gson = new Gson();
            //peticion 1
            String jsonPost = GetJson(urlBase);
            Preguntas preguntas = gson.fromJson(jsonPost, Preguntas.class);
            for(int i = 0; i<preguntas.getResults().length;i++){
                Result result =  preguntas.getResults()[i];
                System.out.printf("Category [%d]: %s\n",i,result.getCategory());
                System.out.printf("Question [%d]: %s\n",i,result.getQuestion());
                System.out.printf("Correct Answer [%d]: %s\n",i,result.getCorrect_answer());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
