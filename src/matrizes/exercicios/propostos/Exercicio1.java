package matrizes.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar 
 * na tela somente os números negativos da matriz.
 * Entrada:
 * A entrada contém os números M e N na mesma linha, depois os dados da matriz.
 * Saída:
 * A saída contém uma mensagem e depois os números negativos da matriz, conforme exemplo.
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

			System.out.println("VALORES NEGATIVOS:");
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] < 0) {
						System.out.println(mat[i][j]);
					}
				}
			}
		}
	}
}
