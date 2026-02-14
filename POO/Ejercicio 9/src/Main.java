import model.Empleado;

public class Main {
    static void main(String[] args) {
        /*Crea una clase Empleado con atributos nombre, puesto y salario.
        En el metodo main, crea un array de 5 empleados,
        inicialízalos con datos y luego muestra: todos los empleados,
        el empleado con mayor salario y el salario promedio.*/

        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado("Ana Perez" , "Desarrolladora", 35000);
        empleados[1] = new Empleado("Luis Garcia" , "Diseñador", 28000);
        empleados[2] = new Empleado("Maria Torres" , "Project Manager", 42000);
        empleados[3] = new Empleado("Jorge Diaz" , "Analista", 32000);
        empleados[4] = new Empleado("Laura Sanchez" , "Tester", 26000);

        //lista de empleados

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        //el empleado con mayor salario
        Empleado mayorSalario = empleados[0];
        double salario = 0;
        for (Empleado empleado : empleados) {
            salario += empleado.getSalario();
            if (empleado.getSalario() > mayorSalario.getSalario()) {
                mayorSalario = empleado;
            }
        }

        System.out.println("el empleado con mayor salario es: " + mayorSalario);

        //salario promedio

        double salarioPromedio = salario / empleados.length;
        System.out.println("el salario promedio es: " + salarioPromedio);

    }
}
