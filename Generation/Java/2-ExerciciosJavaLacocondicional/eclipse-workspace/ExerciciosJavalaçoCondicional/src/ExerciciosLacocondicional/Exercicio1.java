package ExerciciosLacocondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite 3 n�meros: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if (n1 >=n2 && n1>= n3) {
			
			System.out.println("O maior n�mero �: " + n1);
		}
		
		else if (n2 >=n3 && n2>= n1) {
			
			System.out.println(" O maior n�mero �: " + n2);
		}
		
		else  {
			
			System.out.println("O maior n�mero �: " + n3);		
			
		}
		ler.close();
			
		}

	}
