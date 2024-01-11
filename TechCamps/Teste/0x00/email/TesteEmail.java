package email;

public class TesteEmail {
    static Pessoa pessoa;

    public static boolean testar_email_com_arroba(){
        String resultadoEsperado = "email_teste@dominio.com.br";

        String resultado = String.valueOf(Pessoa.emailValid(resultadoEsperado));

        if (resultado == resultadoEsperado){
            return false;
        }else {
            return true;
        }
    }

    public static boolean testar_email_sem_arroba(){
        String resultadoEsperado = "email_testedominio.com.br";

        String resultado = String.valueOf(pessoa.emailValid(resultadoEsperado));

        if (resultado == resultadoEsperado){
            return false;
        }else {
            return true;
        }
}
    public static boolean testar_email_mais_50_caracteres() {
        String resultadoEsperado = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        String resultado = String.valueOf(pessoa.emailValid(resultadoEsperado));

        if (resultado == resultadoEsperado) {
            return false;
        } else {
            return true;
        }
    }
}
