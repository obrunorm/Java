import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> contatos;

    public ListaTelefonica(){
        this.contatos = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        this.contatos.compute(nome, (key, value) -> {
            if(value == null)
                value = new ArrayList<Telefone>();

            value.add(telefone);
            return value;
        });
    }

    public ArrayList<Telefone> buscar(String nome){
        return this.contatos.get(nome);
    }
}