public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal(){
        if(tamanhoImpressao.equals(TamanhoImpressao.A3) && ehFrenteVerso){
            double total;
            total = paginasColoridas * 0.25;
            total = total + ((paginasTotais - paginasColoridas)*0.15);
            return total;
        }else if(tamanhoImpressao.equals(TamanhoImpressao.A3) && ehFrenteVerso == false){
            double total;
            total = paginasColoridas * 0.30;
            total = total + ((paginasTotais - paginasColoridas)*0.20);
            return total;
        }else if(tamanhoImpressao.equals(TamanhoImpressao.A2) && ehFrenteVerso){
            double total;
            total = paginasColoridas * 0.28;
            total = total + ((paginasTotais - paginasColoridas)*0.18);
            return total;
        }else if(tamanhoImpressao.equals(TamanhoImpressao.A2) && ehFrenteVerso == false){
            double total;
            total = paginasColoridas * 0.32;
            total = total + ((paginasTotais - paginasColoridas)*0.22);
            return total;
        }else if(tamanhoImpressao.equals(TamanhoImpressao.A4) && ehFrenteVerso){
            double total;
            total = paginasColoridas * 0.20;
            total = total + ((paginasTotais - paginasColoridas)*0.10);
            return total;
        }else if(tamanhoImpressao.equals(TamanhoImpressao.A4) && ehFrenteVerso == false){
            double total;
            total = paginasColoridas * 0.25;
            total = total + ((paginasTotais - paginasColoridas)*0.15);
            return total;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "total de paginas: " + paginasTotais +
                ", total coloridas: " + paginasColoridas +
                ", total preto e branco: " + (paginasTotais - paginasColoridas) +
                ", " + (ehFrenteVerso == true ? "frente e verso." : "frente apenas.") +
                " total: R$ "+ String.format("%.2f",calcularTotal());
    }
}