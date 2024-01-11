import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private Double preco;

    private double percentualMarkUp;

    Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkUp);
    private double percentualMarkup;
    Consumer<Double> atualizarMarkup = valor ->  this.percentualMarkup = (valor / 100);

    public Produto(Double preco, String nome) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 0.10;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

}