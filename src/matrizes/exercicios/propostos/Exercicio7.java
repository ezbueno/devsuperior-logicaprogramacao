package matrizes.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1, sendo cada fila com a mesma quantidade de 
 * soldados. Por exemplo, a figura abaixo mostra a organização do pelotão em 3 filas com 8 soldados em cada uma.
 * Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste em dizer o número 
 * de uma fila, de modo que os soldados desta fila devem se mover para a direita, e o último soldado da direita vai para a 
 * posição mais à esquerda. Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".
 * Entrada:
 * A entrada consiste em um inteiro M representando o número de filas, um inteiro N representado a quantidade de soldados 
 * por fila, as M filas de soldados (cada soldado é representado por um número inteiro), e o número inteiro para o exercício 
 * "girar fila".
 * Saída:
 * A saída contém a formação do pelotão após a execução do exercício "girar fila".
 */
public class Exercicio7 {

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

			int fila = sc.nextInt();
			fila -= 1;

			int ultimo = mat[fila][n - 1];

			for (int j = n - 1; j > 0; j--) {
				mat[fila][j] = mat[fila][j - 1];
			}

			mat[fila][0] = ultimo;

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
