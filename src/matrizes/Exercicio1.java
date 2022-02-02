package matrizes;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler dois números inteiros positivos M e N, depois ler
 * uma matriz de M linhas e N colunas contendo números inteiros. Em seguida,
 * mostrar na tela a matriz lida conforme exemplo.
 * Entrada:
 * 2 3
 * 6 3 10
 * 8 12 5
 * Saída:
 * 6 3 10
 * 8 12 5
 */
public class Exercicio1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			int[][] mat = new int[m][n];

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
