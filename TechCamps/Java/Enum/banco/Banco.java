import java.util.ArrayList;
import java.util.stream.IntStream;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome){
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nomeAgencia){
        return this.agencias.stream().filter(agencia -> agencia.getNome() == nomeAgencia)
                .findFirst().orElse(null);
    }

    public boolean adicionarAgencia(String nomeAgencia){
        if(buscarAgencia(nomeAgencia) != null)
            return false;

        this.agencias.add(new Agencia(nomeAgencia));

        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacao){
        Agencia agencia = buscarAgencia(nomeAgencia);

        if(agencia == null)
            return false;

        return agencia.novoCliente(nomeCliente, transacao);
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao){
        Agencia agencia = buscarAgencia(nomeAgencia);

        if(agencia == null)
            return false;

        return agencia.adicionarTransacaoCliente(nomeCliente, transacao);
    }

    public boolean listarClientes(String nomeAgencia, boolean printTransacoes){
        Agencia agencia = buscarAgencia(nomeAgencia);

        if(agencia == null)
            return false;

        IntStream.range(0, agencia.getClientes().size())
                .forEach(i -> {
                    System.out.println("Cliente: " + agencia.getClientes().get(i).getNome() + " [" + (i+1) + "]");

                    if(printTransacoes)
                        IntStream.range(0, agencia.getClientes().get(i).getTransacoes().size())
                                .forEach(j -> {
                                    System.out.println("  [" + (j+1) + "]" + " valor " + String.format("%.2f", agencia.getClientes().get(i).getTransacoes().get(j)));
                                });
                });


        return true;
    }

}