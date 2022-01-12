package vetores.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos 
 * elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			double[] vet = new double[n];
			double soma = 0.0;
			double media;
			
			for (int i = 0; i < n; i++) {
				vet[i] = sc.nextDouble();
				soma += vet[i];
			}
			
			media = soma / n;
			
			System.out.println(media);
			
			for (int i = 0; i < n; i++) {
				if (vet[i] < media) {
					System.out.println(vet[i]);
				}
			}
		}
	}
}
