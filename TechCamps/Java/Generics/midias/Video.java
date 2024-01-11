public class Video extends Midia{

    private int duracao;

    public Video(String nome, int duracao) {
        super(nome);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }


    //Video que é filha de Midia e possui o atributo duracao do tipo int.

}
