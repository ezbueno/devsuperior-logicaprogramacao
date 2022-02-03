package matrizes.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver 
 * empates.
 * Entrada:
 * A entrada contém o número N, depois os dados da matriz.
 * Saída:
 * A saída contém os números representando o maior elemento de cada linha da matriz
 */
public class Exercicio3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[][] mat = new int[n][n];
			int[] maior = new int[n];

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] > maior[i]) {
						maior[i] = mat[i][j];
					}
				}
			}

			for (int i = 0; i < maior.length; i++) {
				System.out.println(maior[i]);
			}
		}
	}
}
