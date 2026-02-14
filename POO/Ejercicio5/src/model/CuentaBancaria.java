package model;

public class CuentaBancaria {
    private int id;
    private String titular;
    private double cantidad;

    public CuentaBancaria() {
    }
    public CuentaBancaria(int id, String titular, double cantidad) {
        this.id = id;
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id=" + id +
                ", titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
