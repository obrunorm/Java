import java.util.ArrayList;

public class BasicSyntax {
    public static void main(String[] args) {
        // int idade = 22;
        int salario;
        salario = 400;

        //Só vai existir dentro do escopo do metodod on de ela foi declarada
        //Quando utilizar o "var", logo em seguida deve inferir o tipo de variavel para ele atribuir o valor
        var nome = "Bruno";

        //8 tipos primitivos e 4 deles são para inteiros
        //byte, short, int e long;
        //double e float
        //char (para caracteres)
        //boolean
        //String não é um tipo primitivo - é uma classe auxiliar dentro do java

        double altura = 1.80;
        if (altura > 1.90) {
            System.out.println("Gigante");
        } else if (altura == 1.80) {
            System.out.println("Normal");
        } else {
            System.out.println("Pequeno");
        }


        int[] idades = {2, 4, 5, 6, 7};
        System.out.println(idades[0]);
        idades[0] = 15;
        System.out.println(idades[0]);

        int[] alunos = new int[2];
        alunos[0] = 10;
        alunos[1] = 20;

        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(10);
        notas.add(5);
        notas.add(3);
        notas.remove(0);
        notas.get(1);

        notas.size();


        int materias = 5;
        for(var i = 0; i < materias; i++){
            System.out.println("oi");
        }

        int comida = 5;
        int i = 0;
        while (i < comida){
            System.out.println("tchau");
            i++;
        }

        //Casting implicito
        int idade1 = 28;
        double idade2 = idade1;

        //Casting explicito
        idade1 = (int) idade2;

        char letra = 'a';
        String nomeLetra = String.valueOf(letra);
        letra = nome.charAt(0);
    }

}