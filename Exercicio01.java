package exercicios.aula04;

import java.util.Scanner;

public class Exercicio01 {

	
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	
	//Exercicio 1
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int maiorPont = 0; // esse vai colher o maior numero digitado
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a " + (i+1) + "° valor: ");
			vetor[i] = leia.nextInt();
			
			if(vetor[i] > maiorPont) {
				maiorPont = vetor[i];
			}
			
		}
		System.out.println("A maior pontuação é: " + maiorPont);
		
		leia.close();
	}

}
