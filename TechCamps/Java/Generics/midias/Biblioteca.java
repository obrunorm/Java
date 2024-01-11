import java.util.ArrayList;
import java.util.List;

public class Biblioteca <E extends Midia>{

    private List<E> biblioteca;

    public Biblioteca(){
        this.biblioteca = new ArrayList<E>();
    }

    public void adicionarMidia(E midia){
        this.biblioteca.add(midia);
    }

    public List<E> obterListaMidias(){
        return this.biblioteca;
    }
}


    //Biblioteca que é uma classe genérica que possui uma lista de valores do tipo genérico, deve-se obrigar
    // que o tipo genérico seja obrigatoriamente algum filho de Midia e possui os métodos:

    //adicionarMidia: que recebe um valor do tipo genérico e adiciona o elemento na lista.
    //obterListaMidias: que retorna a lista de elementos.

