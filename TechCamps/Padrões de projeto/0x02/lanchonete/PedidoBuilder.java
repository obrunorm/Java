public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.LANCHE, tipo.name()));
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.BATATA, tamanho.name()));
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.BRINDE, tipo.name()));
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        pedido.adicionarItemForaCaixa(new ItemPedido(TipoItemPedido.BEBIDA, tipo.name()));
    }

    public Pedido build(){
        return this.pedido;
    }


}