package br.com.capgemini.questions;

public class Question1 {
	
	//Função para questão 1 que recebe como parâmetro um inteiro 
	public void createLadder(int numLadder) {
		//Validação do tamanho do número, para que não sejam informados números menores ou igual a zero
		if(numLadder >= 1) {
			//Laço de repetição inicial de 1 até o o valor do parâmetro
			for(int i = 1; i <= numLadder; i++) {
				//Laço de repetição decrescebte do tamanho do parâmetro até 1
				//Necessário para ir preenchendo a linha de saída inserindo espaços ou asteriscos de acordo com o if
				for(int j = numLadder; j > 0; j--) {
					
					/* Verificar se o valor de j no laço está igual ao valor de i,
					 * caso esteja, significa que deve 'printar' um asteriscos, caso contrário, espaços.
					 * 
					 * Neste caso, a variável i do laço principal, funciona como indicador da quantidade de vezes que
					 * um asteriscos aparece na linha atual, já que ele controla a quantidade de linhas da escada e 
					 * todas as linhas tem a mesma quantidade de caracteres (incluindo espaços), que é o tamanho do parâmetro.
					 * */
					if(j <= i) {
						System.out.print("*");									
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(""); //Quebra de linha
			}			
		} else {
			System.out.println("Por favor, insira um numero inteiro maior que zero.");
		}
	}
}
