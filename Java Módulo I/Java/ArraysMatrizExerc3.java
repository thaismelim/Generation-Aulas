package Familia57;

import java.util.Scanner;

public class ArraysMatrizExerc3 {

	public static void main(String[] args) {
	
		/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Scanner leia = new Scanner (System.in);
		
		int matriz [] [] = new int [3][3];
		int x,y;
		
		for(x=0; x< matriz.length; x++) {
			for(y=0; y<matriz.length; y++) {
				System.out.printf("Digite o valor matriz[%d] [%d] --> " , x , y);
				 matriz[x] [y] = leia.nextInt();
				
			}
		
		}
		System.out.println();
		System.out.println("Os valores das matrizes maiores que 10 foram: ");

		for(y=0; y< matriz.length;y++) {
			for(x=0; x<matriz.length;x++) {
				if (matriz[x] [y]>10) {
					
					System.out.printf("-->" + matriz [x][y]);
					System.out.println();	
					
					
				}
			}
		}
	}
}

