package ExercicioLacorepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double i;
		
		do {
			System.out.println("Digite um número: ");
			i = in.nextInt();
			if (i % 3 == 0) {
			System.out.println(i);	
			System.out.println(i / 2);
		}
						
			}		while (i != 0);
		in.close();
		
		
		
	}
	
	
}
