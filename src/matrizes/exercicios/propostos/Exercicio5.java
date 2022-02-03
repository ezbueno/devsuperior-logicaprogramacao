package matrizes.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada. Depois, 
 * gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais. 
 * Imprimir na tela a matriz gerada.
 * Entrada:
 * A entrada contém os valores de M e N, depois os valores da primeira matriz A, depois os valores da segunda matriz B, 
 * conforme exemplo.
 * Saída:
 * A saída contém os valores da matriz gerada C, conforme exemplo
 */
public class Exercicio5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			int[][] matA = new int[m][n];
			int[][] matB = new int[m][n];
			int[][] matC = new int[m][n];

			for (int i = 0; i < matA.length; i++) {
				for (int j = 0; j < matA[i].length; j++) {
					matA[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < matB.length; i++) {
				for (int j = 0; j < matB[i].length; j++) {
					matB[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < matC.length; i++) {
				for (int j = 0; j < matC[i].length; j++) {
					matC[i][j] = matA[i][j] + matB[i][j];
					System.out.print(matC[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
