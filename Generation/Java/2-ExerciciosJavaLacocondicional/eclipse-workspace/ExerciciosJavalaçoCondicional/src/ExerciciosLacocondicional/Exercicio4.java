package ExerciciosLacocondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, quadrado, raiz;
		
		System.out.println("Digite um n�mero:  ");
		n1 = ler.nextInt();
		
		n2 = n1 & 2;
		quadrado = n1 * n1;
		raiz = (int) Math.sqrt(n1);
		
		if (n2 == 0) {
			
			System.out.println("O maior n�mero � par " );
			System.out.println("A raiz quadrada desse n�mero �: " + raiz);
		}
		
		else {
			System.out.println("O n�mero � impar");
			System.out.println("Esse n�mero elevado ao quadrado �:" + quadrado);
		}
		ler.close();
	
	}
	
	
}
	