public enum CategoriaPlato {
    entrada("sopa","ensalada","agua"), principal("paella", "arroz al horno", "arroz negro"),
    postre("helado", "torta galleta", "quesadilla"), bebida("coca-cola", "fanta", "aquarius");

    String opcion1, opcion2, opcion3;
    CategoriaPlato(String opcionP1, String opcionP2, String opcionP3){
        opcion1 = opcionP1;
        opcion2 = opcionP2;
        opcion3 = opcionP3;
    }
}
