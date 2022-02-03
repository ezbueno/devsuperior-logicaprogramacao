package matrizes.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, mostrar na tela a soma dos 
 * elementos de cada linha da matriz.
 * Entrada:
 * A entrada contém o número N, depois os dados da matriz.
 * Saída:
 * A saída contém os números representando a soma dos elementos de cada linha da matriz
 */
public class Exercicio2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[][] mat = new int[n][n];
			int[] soma = new int[n];

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < mat.length; i++) {
				soma[i] = 0;
				for (int j = 0; j < mat[i].length; j++) {
					soma[i] += mat[i][j];
				}
			}

			for (int i = 0; i < soma.length; i++) {
				System.out.println(soma[i]);
			}
		}
	}
}
