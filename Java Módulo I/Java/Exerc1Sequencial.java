package Exercicios;

import java.util.Scanner;

public class Exerc1Sequencial {
	
	public static void main(String[] args) {
		

		double anos, meses, dias, total=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos você tem?" );
		anos = leia.nextDouble(); 
		System.out.println("\nQuantos meses você tem?" );
		meses = leia.nextDouble(); 
		System.out.println("\nQuantos dias você tem?" );
		dias = leia.nextDouble();
		
		dias += (anos * 365) + (meses * 30);
		System.out.printf("\nO Total em dias é = " + dias);
		
	
	}
}



