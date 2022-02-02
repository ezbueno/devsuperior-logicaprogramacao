package matrizes;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um númro inteiro N e uma matriz quadrada de ordem N
 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
 * de valores negativos da matriz.
 * Exemplo:
 * Entrada:
 * 3
 * 5 -3 10
 * 15 8 2
 * 7 9 -4
 * Saída:
 * DIAGONAL PRINCIPAL:
 * 5 8 -4
 * QUANTIDADE DE NEGATIVOS = 2
 */
public class Exercicio2 {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[][] mat = new int[n][n];
			int quantidadeValoresNegativos = 0;
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
					
					if (mat[i][j] < 0) {
						quantidadeValoresNegativos++;
					}
				}
			}
			
			System.out.println("DIAGONAL PRINCIPAL:");
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (i == j) {
						System.out.print(mat[i][j] + " ");
					}
				}
			}
			
			System.out.println();
			System.out.println("QUANTIDADE DE NEGATIVOS = " + quantidadeValoresNegativos);
		}
	}
}
