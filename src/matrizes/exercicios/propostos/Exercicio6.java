package matrizes.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
 * a) calcular e imprimir a soma de todos os elementos positivos da matriz.
 * b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
 * c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
 * d) imprimir os elementos da diagonal principal da matriz.
 * e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.
 * Entrada:
 * A entrada contém o número inteiro N, seguido dos valores da matriz com uma casa decimal cada, seguido do índice de 
 * uma linha, seguido do índice de uma coluna, conforma exemplo.
 * Saída:
 * A saída contém os valores de saída de cada ação, com uma casa decimal, na ordem em que foram apresentadas no 
 * enunciado, conforme exemplo.
 */
public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			double[][] mat = new double[n][n];

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextDouble();
				}
			}

			int indiceLinha = sc.nextInt();
			int indiceColuna = sc.nextInt();

			double soma = 0.0;

			System.out.print("SOMA DOS POSITIVOS: ");
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] > 0) {
						soma += mat[i][j];

					}
				}
			}
			System.out.print(soma);

			System.out.print("\nLINHA ESCOLHIDA: ");
			for (int i = indiceLinha; i == indiceLinha; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					System.out.print(mat[i][j] + " ");
				}
			}

			System.out.print("\nCOLUNA ESCOLHIDA: ");
			for (int i = 0; i < mat.length; i++) {
				for (int j = indiceColuna; j < mat[i].length; j++) {
					System.out.print(mat[i][j] + " ");
				}
			}

			System.out.print("\nDIAGONAL PRINCIPAL: ");
			for (int i = 0; i < mat.length; i++) {
				System.out.print(mat[i][i] + " ");
			}

			System.out.println("\nMATRIZ ALTERADA: ");
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] < 0) {
						System.out.print(Math.pow(mat[i][j], 2) + " ");
					} else {
						System.out.print(mat[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
