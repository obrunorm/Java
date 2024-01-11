import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> contatos;

    public ListaTelefonica(){
        this.contatos = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) throws IllegalArgumentException{

        this.contatos.forEach((key, value) -> {
            if(value.contains(telefone))
                if(key == nome)
                    throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
                else
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
        });

        this.contatos.compute(nome, (key, value) -> {
            if(value == null)
                value = new HashSet<Telefone>();

            value.add(telefone);

            return value;
        });

        return this.contatos.get(nome);
    }

    public HashSet<Telefone> buscar(String nome){
        return this.contatos.get(nome);
    }
}