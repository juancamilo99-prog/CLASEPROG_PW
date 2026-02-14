package model;

public class Gerente extends Empleado{

    private  double bonus;

    public Gerente() {
    }

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void calcularSalarioTotal(){
        double salarioTotal = getSalarioBase() + bonus;
        System.out.println("Salario Total: " + salarioTotal);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Puesto: Gerente");
        System.out.println("Bonus: " + bonus);
        calcularSalarioTotal();
    }
}
