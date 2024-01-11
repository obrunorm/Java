import java.util.ArrayList;

public class Agencia {

    //variaveis
    private String nome;
    private ArrayList<Cliente> clientes;

    //Construtor
    public Agencia(String nome){
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    //Get e Set
    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //Metodos
    public Cliente buscarCliente(String nomeCliente){
        return this.clientes.stream().filter(cliente -> cliente.getNome() == nomeCliente)
                .findFirst().orElse(null);
    }

    public boolean novoCliente(String nomeCliente, double transacao){
        if(buscarCliente(nomeCliente) != null)
            return false;

        this.clientes.add(new Cliente(nomeCliente, transacao));

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double transacao){
        Cliente cliente = buscarCliente(nomeCliente);

        if(cliente == null)
            return false;

        cliente.adicionarTransacao(transacao);

        return true;
    }
}