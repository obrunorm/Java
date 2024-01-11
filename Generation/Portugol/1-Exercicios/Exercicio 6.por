programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()	{

		real x1, x2, y1, y2
		real p1, p2
		real d

		escreva("Digite o valor de x do primeiro ponto: \n")
		leia (x1)

		escreva("Digite o valor de y do primeiro ponto: \n")
		leia (y1)
		
		escreva("Digite o valor de x do segundo ponto: \n")
		leia (x2)

		escreva("Digite o valor de y do segundo ponto: \n")
		leia (y2)

		p1 = mat.potencia((x2-x1), 2.0)
		p2 = mat.potencia((y2-y1), 2.0)
		d = mat.raiz(p1 + p2, 2.0)

		escreva("A distancia entre os pontos é: " + d)
		
	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */