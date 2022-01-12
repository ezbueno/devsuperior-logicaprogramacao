package vetores.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
 * - todos os números pares
 * - a quantidade de números pares
 */
public class Exercicio2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] numeros = new int[n];
			int quantidadePares = 0;
			
			for (int i = 0; i < n; i++) {
				numeros[i] = sc.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
				if (numeros[i] % 2 == 0) {
					System.out.print(numeros[i] + " ");
					quantidadePares++;
				}
			}
			
			System.out.print("\n" + quantidadePares);
		}
	}
}
