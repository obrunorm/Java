import java.util.List;

public class Midia <T> {

       private String nome;

       public Midia(String nome) {
              this.nome = nome;
       }

       @Override
       public String toString(){
              return String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome());
       }

       public String getNome() {
              return nome;
       }


       //Midia que possui o atributo nome, sobrescreva o método toString para retornar:
    // `String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome())`

}
