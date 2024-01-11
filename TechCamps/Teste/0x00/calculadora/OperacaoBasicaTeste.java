package calculadora;

public class OperacaoBasicaTeste {

    static OperacaoBasica operacao;

    public static boolean testar_soma() {
        operacao = new OperacaoBasica(5, 3);
        double resultadoEsperado = 8;

        double resultado = operacao.somar();

        if (resultado == resultadoEsperado) {
          return true;
        } else {
            return false;
        }
    }

    public static boolean testar_subtracao() {
        operacao = new OperacaoBasica(5, 3);
        double resultadoEsperado = 2;

        double resultado = operacao.subtrair();

        if (resultado == resultadoEsperado) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean testar_multiplicacao() {
        operacao = new OperacaoBasica(5, 3);
        double resultadoEsperado = 15;

        double resultado = operacao.multiplicar();

        if (resultado == resultadoEsperado) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean testar_divisao() {
        operacao = new OperacaoBasica(9, 3);
        double resultadoEsperado = 3;

        double resultado = operacao.dividir();

        if (resultado == resultadoEsperado) {
            return true;
        } else {
            return false;
        }
    }




}
