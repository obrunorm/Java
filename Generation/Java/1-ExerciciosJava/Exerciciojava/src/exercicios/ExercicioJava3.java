package exercicios;

import java.util.Scanner;

public class ExercicioJava3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double horas, minutos, segundos;
		
		System.out.println("Quanto tempo demorou o evento?(Em horas)");
		horas = entrada.nextInt();
		
		minutos = horas * 60;
		segundos = minutos * 60;
		
		System.out.println(" Seu evento durou um total de " + horas + " horas " );
		System.out.println(" Seu evento durou um total de " + minutos + " minutos " );
		System.out.println(" Seu evento durou um total de " + segundos + " segundos " );
		
		entrada.close();
	}

}
