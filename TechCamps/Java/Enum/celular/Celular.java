import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Celular {

    private List<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nome){
        return IntStream.range(0, contatos.size())
                .filter(i -> contatos.get(i).getNome() == nome)
                .findFirst().orElse(-1);
    }

    public void adicionarContato(Contato contato) throws IllegalArgumentException{
        if(obterPosicaoContato(contato.getNome()) != -1)
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");

        this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws IllegalArgumentException{
        int posicaoContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        int posicaoNomeNovoContato;

        if(posicaoContatoAntigo == -1)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");

        posicaoNomeNovoContato = obterPosicaoContato(novoContato.getNome());

        if(posicaoNomeNovoContato != -1 && posicaoContatoAntigo != posicaoNomeNovoContato)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");

        this.contatos.set(posicaoContatoAntigo, novoContato);
    }

    public void removerContato(Contato contato) throws IllegalArgumentException{
        int posicaoContato = obterPosicaoContato(contato.getNome());

        if(posicaoContato == -1)
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");

        this.contatos.remove(posicaoContato);
    }

    public void listarContatos(){
        this.contatos.forEach(contato -> {
            System.out.println(contato.getNome() + " -> " + contato.getNumero() + " (" + contato.getTipo() + ")");
        });
    }
}