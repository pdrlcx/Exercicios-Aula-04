package exercicios.aula04;

import java.util.Scanner;

public class Exercicio03 {

	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.*/
	
		//Exercicio 03
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        //declaração de matrizes
        double[][] N1 = new double[4][6];
        double[][] N2 = new double[4][6];
        double[][] M1 = new double[4][6];
        double[][] M2 = new double[4][6];

        System.out.println("Matriz N1\n");
        for(int l = 0; l < N1.length; l++) {
            for(int c = 0; c < N1[l].length; c++) {
                System.out.printf("Escreva o valor para atribuir na matriz N1 [%d][%d]: ", l,c);
                N1[l][c] = entrada.nextDouble();
            }
            System.out.println();
        }

        System.out.println("Matriz N2\n");
        for(int l = 0; l < N2.length; l++) {
            for(int c = 0; c < N2[l].length; c++) {
                System.out.printf("Escreva o valor para atribuir na matriz N2 [%d][%d]: ", l,c);
                N2[l][c] = entrada.nextDouble();
            }
            System.out.println();
        }

        System.out.println("Matriz M1\n");
        for(int l = 0; l < M1.length; l++) {
            for(int c = 0; c < M1[l].length; c++) {
                M1[l][c] = N1[l][c] + N2[l][c];
                System.out.print(M1[l][c] + " | ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz M2\n");
        for(int l = 0; l < M2.length; l++) {
            for(int c = 0; c < M1[l].length; c++) {
                M2[l][c] = N1[l][c] - N2[l][c];
                System.out.print(M2[l][c] + " | ");
            }
            System.out.println();
        }

        entrada.close();


	}

}
