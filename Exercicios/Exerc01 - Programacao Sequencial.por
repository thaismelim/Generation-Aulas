programa
{
	
	funcao inicio()
	{

	/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
		
		inteiro anos, meses, dias, total
		escreva("\nQuantos anos você tem? ")
		leia(anos)
		escreva("\nQuantos meses você tem? ")
		leia(meses)
		escreva("\nQuantos dias você tem? ")
		leia(dias)
		total = (dias+(anos*365)+(meses/30))
		escreva("\nO Total de dias é = " , total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */