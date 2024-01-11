import java.text.DecimalFormat;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.println("Valor: R$ " + new DecimalFormat("#,###.00").format(valor));
        System.out.println("Taxa: " + String.format("%.2f", taxa) + "%");
    }
}