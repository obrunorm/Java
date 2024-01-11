import java.util.ArrayList;

public class Pedido {

    ArrayList<PedidoCookie> cookies;

    public Pedido(){
        this.cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int total = 0;

        for(PedidoCookie pedidoCookie : this.cookies)
            total += pedidoCookie.getQuantidadeCaixas();

        return total;
    }

    public int removerSabor(String sabor){
        int total = 0;

        for(PedidoCookie pedidoCookie : this.cookies)
            if(pedidoCookie.getSabor().equals(sabor))
                total += pedidoCookie.getQuantidadeCaixas();

        this.cookies.removeIf( pedidoCookie -> pedidoCookie.getSabor().equals(sabor));

        return total;
    }
}