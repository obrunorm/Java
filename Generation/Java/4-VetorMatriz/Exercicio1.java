package ExercicioVetorMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] notas = new double[5];
		double maior = 0;
		
		int i;
		System.out.println("Digite às Notas: ");
		for(i = 0; i <= 4; i++) {
			notas[i] = ler.nextDouble();
		if (notas[i] > maior) {
			  maior = notas[i];
			}
			}
			System.out.println(maior);
			ler.close();
			}
			
}