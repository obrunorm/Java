import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    List<Tarefa> tarefa;

    public ListaTodo() {
        this.tarefa = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        if (this.tarefa.stream().filter((Tarefa t) -> t.getIdentificador() == tarefa.getIdentificador()).count() != 0)
            throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");

        this.tarefa.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        boolean found = false;

        for (int i = 0; i < this.tarefa.size(); i++)
            if (this.tarefa.get(i).getIdentificador() == identificador) {
                this.tarefa.get(i).concluirTarefa();
                found = true;
                break;
            }

        return found;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean found = false;

        for (int i = 0; i < this.tarefa.size(); i++)
            if (this.tarefa.get(i).getIdentificador() == identificador) {
                this.tarefa.get(i).desfazerTarefa();
                found = true;
                break;
            }

        return found;
    }

    public void desfazerTodas() {
        this.tarefa.forEach(tarefa -> tarefa.desfazerTarefa());
    }

    public void fazerTodas() {
        this.tarefa.forEach(tarefa -> tarefa.concluirTarefa());
    }

    public void listarTarefas() {
        this.tarefa.forEach(tarefa -> {
            if (tarefa.isEstahFeita())
                System.out.println("[X]  " + "Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            else
                System.out.println("[ ]  " + "Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
        });
    }
}