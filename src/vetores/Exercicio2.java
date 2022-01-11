package vetores;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida,
 * mostrar na tela todos os números negativos lidos.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] vet = new int[n];
			
			for (int i = 0; i < n; i++) {
				vet[i] = sc.nextInt();
			}
						
			for (int i = 0; i < n; i++) {
				if (vet[i] < 0) {
					System.out.println(vet[i]);
				}
			}
		}
	}
}
