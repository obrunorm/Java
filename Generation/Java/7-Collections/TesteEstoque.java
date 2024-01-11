package Exercicios.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstoque {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		ArrayList<Estoque> estoques = new ArrayList <>();
		
		System.out.println("Digite quantos produtos você quer adicionar ao estoque: ");
		int numeroEstoque = leia.nextInt();
		
		for(int i = 0; i < numeroEstoque; i++) {
			System.out.println("Digite o código do produto: ");
			int cb = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Digite a quantidade do produto: ");
			int quant = leia.nextInt();
			leia.nextLine();
			
			estoques.add(new Estoque(cb, quant, quant));
				}
	
		for (var estoque : estoques) {
			System.out.println("\n" + estoque);
		}
		
		leia.close();

	}
	

}
