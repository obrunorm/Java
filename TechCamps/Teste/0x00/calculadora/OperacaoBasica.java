package calculadora;

public class OperacaoBasica {

    public double a;
    public double b;

    public OperacaoBasica(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double somar(){
        return a + b;
    }

    public double subtrair(){
        return a - b;
    }

    public double multiplicar(){
        return a * b;
    }

    public double dividir(){
        return a / b;
    }
}
