import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, int value){
        return list.indexOf(value);
    }

    public static List<Integer> adicionarNumero(List<Integer> list, int value){
        if(buscarPosicaoNumero(list, value) != -1)
            throw new IllegalArgumentException("Numero jah contido na lista");

        list.add(value);

        return list;
    }

    public static List<Integer> removerNumero(List<Integer> list, int value){

        int posicao = buscarPosicaoNumero(list, value);

        if(posicao == -1)
            throw new IllegalArgumentException("Numero nao encontrado na lista");

        list.remove(posicao);

        return list;
    }

    public static List<Integer> substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto){

        int posicao = buscarPosicaoNumero(list, numeroSubstituir);

        if(posicao == -1)
            list.add(numeroSubstituto);
        else
            list.set(posicao, numeroSubstituto);

        return list;
    }
}