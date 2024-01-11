public class PersonagemGame {

    //Variaveis
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        this.nome = nome;
        this.saudeAtual = saudeAtual;
        setSaudeAtual(saudeAtual);
    }

    //Getters and Setters
    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int value) {
        this.saudeAtual = value;

        if(value > 0)
            this.status = "vivo";
        else
            this.status = "morto";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty())
            this.nome = nome;
    }

    public String getStatus(){
        return this.status;
    }

    //Metodos
    public void tomarDano(int quantidadeDeDano){
        int newSaude = this.saudeAtual - quantidadeDeDano;

        if(newSaude > 0)
            setSaudeAtual(newSaude);
        else
            setSaudeAtual(0);
    }

    public void receberCura(int quantidadeDeCura){
        int newSaude = this.saudeAtual + quantidadeDeCura;

        if(newSaude < 100)
            setSaudeAtual(newSaude);
        else
            setSaudeAtual(100);
    }
}