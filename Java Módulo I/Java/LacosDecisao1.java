package Familia57;

import java.util.Scanner;

public class LacosDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int x,y,z, maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		x = ler.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		y = ler.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		z = ler.nextInt();

		if(x > y) 
		{
		if(x > z) {
			System.out.printf("\nO maior número é: %d",x);
		}
		
		else{
			System.out.printf("\nO maior número é: %d",z);
	}
	}
		else
		{
			if(y > z)
			{
			System.out.printf("\nO maior número é: %d",y);
		}
			else
			{
				System.out.printf("\nO maior número é: %d",z);
			}
	}
}
	}

