package br.com.capgemini;
import java.util.Scanner;

import br.com.capgemini.questions.Question1;
import br.com.capgemini.questions.Question2;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Question1 questOne = new Question1();
		Question2 questTwo = new Question2();
		
		
		System.out.println("Desafio Capgemini!");
		
		System.out.print("1º - Informe o número de degraus da escada de *: ");
		questOne.createLadder(scan.nextInt());
		
		System.out.print("\n2º - Informe a senha: ");
		questTwo.analyzePassword(scan.next());
	}

}
