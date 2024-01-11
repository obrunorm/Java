package ExerciciosLacocondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, quadrado, raiz;
		
		System.out.println("Digite um número:  ");
		n1 = ler.nextInt();
		
		n2 = n1 & 2;
		quadrado = n1 * n1;
		raiz = (int) Math.sqrt(n1);
		
		if (n2 == 0) {
			
			System.out.println("O maior número é par " );
			System.out.println("A raiz quadrada desse número é: " + raiz);
		}
		
		else {
			System.out.println("O número é impar");
			System.out.println("Esse número elevado ao quadrado é:" + quadrado);
		}
		ler.close();
	
	}
	
	
}
	