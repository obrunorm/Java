package exercicios;

import java.util.Scanner;

public class ExercicioJava4 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, d, r, s;
	
		System.out.println("Qual valor de a?: ");
		a = entrada.nextInt();
		
		System.out.println("Qual valor de b?: ");
		b = entrada.nextInt();
		System.out.println("Qual valor de c?: ");
		c = entrada.nextInt();
		
		r = ((a +b) * 2);
		s = ((b +c) * 2);
		d = ((r +s) / 2);
		
		System.out.println(" O resultado é: " + d );
		
		
		entrada.close();

}
}