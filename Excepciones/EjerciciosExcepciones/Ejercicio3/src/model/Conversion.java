package model;

public class Conversion {

    public void numeroAtexto(int numero) throws NumberFormatException{
        try{
            //ponemos la solucion del metodo
            System.out.println("has introducido un numero correcto: "+numero);
        }catch (NumberFormatException e){
            System.err.println("sigue intentandolo..");
            System.out.println();
        }
    }
}
