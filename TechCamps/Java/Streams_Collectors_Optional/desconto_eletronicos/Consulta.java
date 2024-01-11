import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterLivrosDoPedido(Pedido pedido){

        return pedido.getProdutos().stream()
                .filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        return produtos.stream().sorted(Comparator.comparingDouble(Produto::getPreco)).collect(Collectors.toList()).get(2);
    }

    static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMin){
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMin).collect(Collectors.toList());
    }

    static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){
        return pedidos.stream().filter(pedido -> {
            return pedido.getProdutos().stream().anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO));
        }).collect(Collectors.toList());
    }

    static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos){
        return produtos.stream().peek(produto ->  {
            if(produto.getCategoria().equals(CategoriaProduto.ELETRONICO)){
                produto.setPreco(produto.getPreco() - (produto.getPreco() * 0.15));
            }
        }).collect(Collectors.toList());
    }
}