public class TerraMediaPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {

        if(tipo.equals(TipoPersonagem.MAGO)){
            return new Mago(nome,10, 2, 5, 3, 4);
        }else if(tipo.equals(TipoPersonagem.LADRAO)){
            return new Ladrao(nome, 2, 6, 8, 5,10);
        }else{
            return new Guerreiro(nome, 1,8,5,10,6);
        }
    }
}