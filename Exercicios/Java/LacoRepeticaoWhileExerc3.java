package Familia57;

import java.util.Scanner;

public class LacoRepeticaoWhileExerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  idade = 0, menos21 = 0;
		int  mais50 = 0;
		
		Scanner  leia = new  Scanner (System.in);
		
		
		while (idade != -99) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt ();
			
			if (idade > 0 && idade < 21 ) {
				menos21 ++;
			} else  if (idade > 50) {
				mais50 ++;
			}
					
		}
		System.out.println ("\nPessoas que tem menos de 21 anos são:" + menos21 + " e pessoas que tem mais de 50 anos são: " + mais50 );

		
		
	}

}
