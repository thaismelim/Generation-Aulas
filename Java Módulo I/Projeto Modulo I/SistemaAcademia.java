package com.academia.sistema;

import java.util.Scanner;

import com.academia.sistema.model.DadosAlune;



public class SistemaAcademia {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int op = 0;
		DadosAlune c1primeiroAcesso = new DadosAlune();
		DadosAlune c2login = new DadosAlune();
		
		System.out.println("***********************************");
		System.out.println("BEM - VINDE! ");
		System.out.println("***********************************");
		System.out.println("Digite (1) para se cadastrar em nosso programa");
		
		op = leia.nextInt();
		if (op == 1) {
			c1primeiroAcesso.primeiroAcesso();
		}
		

	}

}
