package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa que leia N números reais e armazene-os em um vetor.
 * Em seguida:
 * Imprimir todos os elementos do vetor
 * Mostrar na tela a soma e a média dos elementos do vetor
 */
public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			double[] vet = new double[n];
			double soma = 0.0;
			double media;
			
			for (int i = 0; i < n; i++) {
				vet[i] = sc.nextDouble();
			}
			
			for (int i = 0; i < n; i++) {
				System.out.print(vet[i] + " ");
			}
			
			for (int i = 0; i < n; i++) {
				soma += vet[i];
			}
			
			System.out.printf("%n%.2f%n", soma);
			
			media = soma / n;
			System.out.printf("%.2f%n", media);
		}
	}
}
