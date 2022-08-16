package Exercicios;

import java.util.Scanner;

public class Exerc5Sequencial {

	public static void main(String[] args) {
	      Scanner leia = new Scanner(System.in);

	  double nota1;
	  double nota2;
	  double nota3;   
	  double m_final;
	  
	    System.out.println("Informe a primeira nota: "); 
	nota1 = leia.nextInt();   
	 
	System.out.println("Informe a segunda nota: "); 
	nota2 = leia.nextInt();   
	 
	System.out.println("Informe a terceira nota: "); 
	nota3 = leia.nextInt();   
	 

	m_final= ((nota1*2)+(nota2*3)+(nota3*5))/10;
	 System.out.println("A média final do aluno é " + m_final);
	  }   
	
}