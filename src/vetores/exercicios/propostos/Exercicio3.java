package vetores.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde 
 * cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] vetorA = new int[n];
			int[] vetorB = new int[n];
			int[] vetorC = new int[n];
			
			for (int i = 0; i < n; i++) {
				vetorA[i] = sc.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
				vetorB[i] = sc.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
				vetorC[i] = vetorA[i] + vetorB[i];
				System.out.print(vetorC[i] + " ");
			}
		}
	}
}
