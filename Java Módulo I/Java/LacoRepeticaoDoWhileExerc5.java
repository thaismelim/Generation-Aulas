package Familia57;

import java.util.Scanner;

public class LacoRepeticaoDoWhileExerc5 {

	public static void main(String[] args) {
		
		int num=0; int soma = 0;
	
		Scanner  leia = new  Scanner (System.in);
		do
		{
			System.out.println("\nDigite qualquer número: ");
			num = leia.nextInt();
			soma = soma + num;
			
		}while(num!=0);

		System.out.println("\nA soma dos números digitados é: " + soma);
		
	}			
	}
	

		
	

	
