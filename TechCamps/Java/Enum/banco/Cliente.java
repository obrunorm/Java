import java.util.ArrayList;

public class Cliente {

    //variaveis
    private String nome;
    private ArrayList<Double> transacoes;

    //Construtor
    public Cliente(String nome, double transacao){
        this.nome = nome;
        this.transacoes = new ArrayList<Double>();
        this.transacoes.add(transacao);
    }

    //Get
    public String getNome() {
        return nome;
    }

    //Metodos
    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double transacao){
        this.transacoes.add(transacao);
    }
}