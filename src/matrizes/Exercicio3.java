package matrizes;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
 * de M linhas e N colunas, contendo números double. Gerar um vetor de modo que cada
 * elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
 * Mostrar o vetor gerado.
 * Exemplo:
 * Entrada:
 * 2 3
 * 7.0 8.0 10.0
 * 2.0 3.0 5.0
 * Saída:
 * 25.0
 * 10.0
 */
public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			double[][] mat = new double[m][n];
			double[] vet = new double[m];

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextDouble();
				}
			}

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					vet[i] += mat[i][j];
				}
			}

			for (int i = 0; i < vet.length; i++) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}
	}
}
