package exercicios;

import java.util.Scanner;

public class Exercicio1 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade,idade1, idade2, anos, meses, dias, totaldedias;
		
		System.out.println("Quantos anos você tem?: ");
		idade = entrada.nextInt();
		
		System.out.println("Quantos meses?: ");
		idade1 = entrada.nextInt();
		
		System.out.println("Quantos dias?: ");
		idade2 = entrada.nextInt();
		
		anos= idade * 365;
		meses= idade1 / 30;
		dias= idade2 + 0;
		totaldedias = anos + meses + dias;
		
		System.out.println("A soma de a com b é igual: " + totaldedias);
		
		entrada.close();

	}

}
