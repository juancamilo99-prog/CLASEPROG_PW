import utils.ResultadoException;

public class Operaciones {

    public void sumar(int op1, int op2) throws ArithmeticException, ResultadoException {
        int suma = op1 + op2;
        int multiplicacion = op1 * op2;
        int division = op1 / op2;
        int resta = 0;
        try {
            if (op2>op1){
                throw new ResultadoException("El sistema detecta una resta negativa "+(op1-op2));
            }
            resta = op1-op2;
        }catch (ResultadoException e) {
            resta = 0;
        }
        System.out.println("los resultados son:");
        System.out.println("suma: "+suma);
        System.out.println("multiplicacion: "+multiplicacion);
        System.out.println("division: "+division);
        System.out.println("resta: "+resta);
    }
}
