package exercicios.aula04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o.*/
		
		//Exercicio 02
		
		Scanner leia = new Scanner(System.in);
		
		int valor[] = new int[10], maiorValor= 0, contador = 0;
		double soma = 0.0, media = 0.0;
		
		for(int limitador = 0; limitador < 10; limitador++) {
			System.out.print((limitador + 1) + "� Valor do lan�amento do dado: ");
			valor[limitador] = leia.nextInt();
			
			soma = soma + valor[limitador];
			media = soma / valor.length;
			
			if(valor[limitador] > maiorValor) {
				maiorValor = valor[limitador];
			}
		}
		for(int limitador = 0; limitador < 5; limitador++) {
			if(valor[limitador] == maiorValor) {
			contador++;
			}
			
		}
		
		
		System.out.println("Valor soma: " + soma);
		System.out.println("Valor m�dia: " + media);
		System.out.println("O maior valor foi " + maiorValor + " e ele apareceu " + contador + " vezes");
	
		leia.close();
	}

}
