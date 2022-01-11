package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número inteiro positivo N, depois ler N números
 * quaisquer e armazená-los em um vetor. Em seguida, mostrar na tela todos os 
 * elementos do vetor.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double[] vet;
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			vet = new double[n];
			
			for (int i = 0; i < n; i++) {
				vet[i] = sc.nextDouble();
			}
			
			System.out.println("---------");
			
			for (int i = 0; i < n; i++) {
				System.out.printf("%.2f%n", vet[i]);
			}
		}
	}
}
