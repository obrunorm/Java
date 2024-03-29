public class Pessoa implements Comparable<Pessoa> {

    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
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

    @Override
    public String toString(){
        return "[" + this.codigo + "] " + this.nome + " " + this.cargo + " " + this.idade + " R$ " + String.format("%.6f", this.salario);
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }
}