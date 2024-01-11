public class Tarefa {

    private String descricao;
    private boolean estahFeita = false;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void concluirTarefa() {
        this.estahFeita = true;
    }

    public void desfazerTarefa(){
        this.estahFeita = false;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void modificarDescricao(String descricao) throws IllegalArgumentException{
        if(descricao == null || descricao.isEmpty())
            throw new IllegalArgumentException("Descricao de tarefa invalida");

        this.descricao = descricao;
    }
}