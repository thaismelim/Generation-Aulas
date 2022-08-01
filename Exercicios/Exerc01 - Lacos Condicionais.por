programa
{
	
	funcao inicio()
	{
			/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/
			

	
		inteiro peso, excesso, multa = 0
		escreva("Entre com o peso total dos tomates: ")
		leia(peso)
		se (peso > 50){
			excesso = peso -50
			multa = excesso * 4
			escreva("\nSeu excesso foi de ", excesso, "quilos, a multa eh de: R$", multa, ",00")
			
		}
		senao
			multa = 0
			excesso = 0
			escreva("\n Peso Total ", peso, " quilos, Voce nao teve excessos, e nao tera multas!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 */