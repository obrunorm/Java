public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPginas, int quantidadePaginasColoridas, boolean ehFrenteVerso){
        Impressao impressao = new Impressao();
        impressao.setPaginasTotais(totalPginas);
        impressao.setPaginasColoridas(quantidadePaginasColoridas);
        impressao.setEhFrenteVerso(ehFrenteVerso);
        impressao.setTamanhoImpressao(tamanhoImpressao);
        return impressao;
    }
}