programa
{
	
	funcao inicio()
	{
		inteiro numero[5], x, maiorP=0


		para (x=0;x<5;x++){
		
		escreva("\nEntre com a Pontuação: ")
		leia(numero[x])
		escreva("\nA pontuação do aluno foi: ",numero[x])

		se(numero[x]>maiorP){
			maiorP = numero[x]
		}
				}
			escreva("\nA maior pontuação do foi: ",maiorP)
}

		}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */