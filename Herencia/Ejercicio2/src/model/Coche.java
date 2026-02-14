package model;

public class Coche extends Vehiculo {

    private int nPuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, int nPuertas) {
        super(marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public void mostrarVechiulo(){
        System.out.printf("Coche: %s %s, %d puertas\n", getMarca(),getModelo(),getnPuertas());
    }
}
