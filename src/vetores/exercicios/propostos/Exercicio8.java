package vetores.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
 * - a maior e a menor altura do grupo
 * - a média de altura das mulheres
 * - o número de homens
 */
public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int numeroMulheres = 0;
			int numeroHomens = 0;

			double[] alturas = new double[n];
			double menorAltura = 9.99;
			double maiorAltura = 0.0;
			double soma = 0.0;
			double media = 0.0;

			char[] sexos = new char[n];

			for (int i = 0; i < n; i++) {
				alturas[i] = sc.nextDouble();
				sexos[i] = sc.next().charAt(0);
				
				if (alturas[i] < menorAltura) {
					menorAltura = alturas[i];
				} else if (alturas[i] > maiorAltura) {
					maiorAltura = alturas[i];
				}

				if (sexos[i] == 'F') {
					soma += alturas[i];
					numeroMulheres++;
				} else {
					numeroHomens++;
				}
			}

			if (numeroMulheres > 0) {
				media = soma / numeroMulheres;
			} else {
				System.out.println("Não há nenhuma mulher dentre as pessoas");
			}

			System.out.printf("Menor altura = %.2f%n", menorAltura);
			System.out.printf("Maior altura = %.2f%n", maiorAltura);
			System.out.printf("Média das alturas das mulheres = %.2f%n", media);
			System.out.println("Número de homens = " + numeroHomens);
		}
	}
}
