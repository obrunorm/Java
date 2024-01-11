public class Jornal extends Midia{

    private int quantidadeArtigos;

    public Jornal(String nome, int quantidadeArtigos) {
        super(nome);
        this.quantidadeArtigos = quantidadeArtigos;
    }

    public int getQuantidadeArtigos() {
        return quantidadeArtigos;
    }

    //Jornal que é filha de Midia e possui o atributo quantidadeArtigos do tipo int.

}
