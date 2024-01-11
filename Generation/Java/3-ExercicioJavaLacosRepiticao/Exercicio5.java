package ExercicioLacorepeticao;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			i = in.nextInt();
			soma = i + soma;
						
			}		while (i != 0);
		in.close();
		
		System.out.println("A soma dos números é: " + soma);
		
		
	}
	
	
}


