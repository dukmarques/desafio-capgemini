package br.com.capgemini.questions;

import java.util.Random;

public class Question2 {
	Random generator = new Random();

	public void analyzePassword(String password) {
		//Variáveis para verificação
		boolean containsNumber = false;
		boolean constinsUpper = false;
		boolean containsLower = false;
		boolean containsSpecial = false;
		
		String suggestion = "";
		
		System.out.println("Para ter uma senha forte, ela deve possuir as seguintes características: ");
		System.out.println("- Possuir no mínimo 6 caracteres");
		System.out.println("- Conter no mínimo 1 digito");
		System.out.println("- Conter no mínimo 1 letra em minúsculo");
		System.out.println("- Conter no mínimo 1 letra em maiúsculo");
		System.out.println("- Conter no mínimo 1 caractere especial, sendo eles: !@#$%^&*()-+ ");
		
		System.out.println("\nAnalisando sua senha: \n");
		
		//Percorre a senha verificando cada caractere e definindo o seu tipo de acordo com a regra
		for(char c : password.toCharArray()) {
			if(c >= '0' && c <= '9') {
				containsNumber = true;
			} else if(c >= 'A' && c<= 'Z') {
				constinsUpper = true;
			} else if (c >= 'a' && c <= 'z') {
				containsLower = true;
			} else {
				containsSpecial = true;
			}
		}
		
		//Caso a senha siga todas as regras, é informado ao usuário
		if(password.length() >= 6 && containsNumber && constinsUpper && containsLower && containsSpecial) {
			System.out.println("\nSua senha é forte e respeita todas as regras!");
			return;
		}
		
		/* Realiza verificações para cada uma das regras para a senha forte
		 * Caso não siga a regra, exibe uma mensagem ao usuário e adiciona um caracter referente a regra para sugestão
		 * O caractere inserido de sugestão é obtido através de randomização e tabela ASCII
		 * Sorteia-se o número referente ao caracter e utiliza parser (char) para o converter em caracter, de acordo com os limites na tabela ascii
		 * */
		
		if(password.length() < 6) {
			System.out.println("Sua senha é menor que 6 caracteres.");
		}
		
		if(!containsNumber) {
			System.out.println("Sua senha não contém número");
			suggestion += this.generator.nextInt(10);
		}
		if(!constinsUpper) {
			System.out.println("Sua senha não contém letra maiúscula");
			suggestion += (char)(this.generator.nextInt(25) + 65);
		}
		if(!containsLower) {
			System.out.println("Sua senha não contém letra minúscula");
			suggestion += (char)(this.generator.nextInt(25) + 97);
		}
		
		/* Para caracteres especiais, cria-se uma string com os caracteres permitidos, sorteia-se um número entre 0 e 12 (tamanho da string)
		 * e por fim, recupera o caracter especial pelo indice utilizando o método de strings charAt();
		 * */
		if(!containsSpecial) {
			System.out.println("Sua senha não contém caractere especial");
			String specialSimbols = "!@#$%^&*()-+";
			suggestion += specialSimbols.charAt(this.generator.nextInt(12));
		}
		
		// Concatena a senha com a sugestão
		password += suggestion;
		
		/*Verifica se após a análise, a string continua menor que 6 caracteres, caso verdadeiro, chama o método addCaracter
		 *  que recebe a senha concatenada e a quantidade de caracteres restantes para 6
		 */
		if(password.length() < 6) {
			password = this.addCaracter(password, (6 - password.length()) );
		}
		
		System.out.println("\nSugerismo a seguinte adição para que sua senha se torne forte: " + password);
	}
	
	/*
	 * Recebe um texto e um inteiro informando a quantidade faltante de caracteres
	 * Utiliza um laço para gerar um caractere novo e concatenar ao texto, até q alcance a quantidade faltante
	 */
	public String addCaracter(String text, int num) {
		for (int i = 0; i < num; i++) {
			text += (char)(this.generator.nextInt(25) + 97);
		}
		return text;
	}
}
