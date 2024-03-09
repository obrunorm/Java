public class Fatoracao {
    // Remova o método main se não for necessário
    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
