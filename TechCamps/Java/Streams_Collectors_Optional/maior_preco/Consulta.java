import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterLivrosDoPedido(Pedido pedido){

        return pedido.getProdutos().stream()
                .filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        return produtos.stream().sorted(Comparator.comparingDouble(Produto::getPreco)).collect(Collectors.toList()).get(2);
    }


}