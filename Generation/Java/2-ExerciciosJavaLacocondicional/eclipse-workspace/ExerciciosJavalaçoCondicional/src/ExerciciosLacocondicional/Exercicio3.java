package ExerciciosLacocondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i1;
		
		System.out.println("Digite a idade do atleta: ");
		i1 = ler.nextInt();
		
		
		if(i1 >=10 && i1 <=14) {
			
			System.out.println("Categoria infantil. ");
		}
		
		else if (i1 >=15 && i1 <=17) {
			
			System.out.println("Categoria juvenil. ");
		}
		
		else if (i1 >=17 && i1 <=25) {
			
			System.out.println("Categoria adulta. ");
		}
		
		else  {
			
			System.out.println("A idade não faz parte das categorias ");		
			
		}
		ler.close();
			
		}

	}
