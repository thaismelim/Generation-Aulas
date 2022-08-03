programa
{
	
	funcao inicio()
	{
		inteiro numeros [3][3],somaNumeros=0,linha,coluna, soma, somacolunaPrincipal=0	/*vetor tem 1 dimensao(linha), matriz tem 2 dimensoes (linha/coluna)*/

		para (linha=0;linha<3;linha++)
	{
		para(coluna=0;coluna<3;coluna++)
		{
			escreva("\nEntre com um numero: ")
				leia(numeros[linha][coluna])
				somaNumeros += numeros[linha][coluna]
					escreva("\nNúmero atual: "+numeros[linha][coluna])
			

				se(linha==coluna){
					somacolunaPrincipal+=numeros[linha][coluna]
				}
		}
	}
			escreva("\nA soma total dos valores é de: "+somaNumeros)
			escreva("\nA soma dos valores da diagonal principal é de: "+somacolunaPrincipal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */