import java.util.List;

public class Pessoa implements Comparable<Pessoa> {

    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }

    public String getCargo(){
        return this.cargo;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getSalario(){
        return this.salario;
    }

    public List<String> getHobbies(){
        return this.hobbies;
    }

    @Override
    public String toString(){
        return "[" + this.codigo + "] " + this.nome + " " + this.cargo + " " + this.idade + " R$ " + String.format("%.6f", this.salario);
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }
}