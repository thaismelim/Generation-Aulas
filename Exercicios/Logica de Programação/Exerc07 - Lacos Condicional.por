programa
{
	
	funcao inicio()
	{

		/* Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/
		
		real altura, base, area
		escreva("\nEntre com o valor de Altura: ")
		leia(altura)
		escreva("\nEntre com o valor de Base: ")
		leia(base)
		se(altura > 0 e base > 0){
			area = base * (altura/2.0)
			escreva("A area do triangulo é: ",area)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */