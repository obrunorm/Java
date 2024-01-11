package exercicios;

import java.util.Scanner;

public class ExercicioJava5 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		double notafinal;
	
		System.out.println("Insira aqui a primeira nota: ");
		nota1 = entrada.nextInt();
		
		System.out.println("Insira aqui a segunda nota: ");
		nota2 = entrada.nextInt();
		
		System.out.println("Insira aqui a terceira nota: ");
		nota3 = entrada.nextInt();
		
		notafinal = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua média final é " + notafinal );
		
		
		entrada.close();

}
}