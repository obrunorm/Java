public class PersonagemGame {

    //Variaveis
    private int saudeAtual;
    private String nome;

    //Construtor
    public PersonagemGame() {
    }

    //Metodos
    public void tomarDano(int quantidadeDeDano){
        int newSaude = this.saudeAtual - quantidadeDeDano;

        if(newSaude > 0)
            this.saudeAtual = newSaude;
        else
            this.saudeAtual = 0;
    }

    public void receberCura(int quantidadeDeCura){
        int newSaude = this.saudeAtual + quantidadeDeCura;

        if(newSaude < 100)
            this.saudeAtual = newSaude;
        else
            this.saudeAtual = 100;
    }


    //Getters and Setters
    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}