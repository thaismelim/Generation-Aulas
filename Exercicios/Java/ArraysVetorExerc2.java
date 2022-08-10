package Familia57;

import java.util.Scanner;

public class ArraysVetorExerc2 {

	public static void main(String[] args) {
		
		/*- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.*/

		Scanner leia = new  Scanner(System.in);
		
		int [] numero = new int [6];
		int soma=0, quantimp=0;
		
		for ( int  i = 0 ; i <= 5 ; i ++) {
			System.out.printf("Digite um valor: ");
			numero [ i ] = leia. nextInt ();

			if (numero[i]% 2 == 0 ){
				soma += numero [i];
			} else { quantimp ++;}}
		
			System.out.printf("\nNúmeros Pares: " );
			
			for ( int  i = 0 ; i <= 5 ; i ++) {
				if (numero [i]% 2 == 0){
					System.out.printf("|%d|" ,numero[i]);}}
			
			System.out.printf("\nNúmeros ímpares: " );
			
			for ( int  i = 0 ; i <= 5 ; i ++) {
				if (numero[i]% 2 != 0 ) {System.out.printf( "|%d|" , numero[i]);}}
			
			System.out.printf( "\nA Soma dos números pares: %d" , soma );
			System.out.printf( "\nA Quantidade de números ímpares: %d" , quantimp );
	}
}

		





	     

	    			 
	    		 
	    	 
	     
	

