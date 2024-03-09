// Classe base para operações matemáticas
abstract class Operacao {
    public abstract double calcular(double a, double b);
}

// Subclasse para operação de adição
class Adicao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}

// Subclasse para operação de subtração
class Subtracao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}

// Subclasse para operação de multiplicação
class Multiplicacao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}

// Subclasse para operação de divisão
class Divisao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divisão por zero!");
        }
    }
}

// Classe principal
public class Calculadora {
    public static void main(String[] args) {
        // Exemplo de uso da calculadora
        Operacao operacao = new Adicao(); // Pode ser alterada para qualquer outra operação
        double resultado = operacao.calcular(10, 5);
        System.out.println("Resultado: " + resultado);
    }
}

