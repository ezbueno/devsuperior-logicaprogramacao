package matrizes.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal.
 * Entrada:
 * A entrada contém o valor N, depois os dados da matriz.
 * Saída:
 * A saída contém a soma dos elementos da diagonal principal.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int[][] mat = new int[n][n];
			int soma = 0;
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = i + 1; j < mat[i].length; j++) {
					soma += mat[i][j];
				}
			}
			
			System.out.println(soma);
		}
	}
}
