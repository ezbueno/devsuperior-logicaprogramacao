package vetores.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente 
 * dos números pares lidos.
 */
public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] vet = new int[n];
			int soma = 0;
			int contador = 0;
			
			double media;
			
			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}
			
			for (int i = 0; i < vet.length; i++) {
				if (vet[i] % 2 == 0) {
					soma += vet[i];
					contador++;
				}
			}
			
			if (contador > 0) {
				media = (double) soma / contador;
				System.out.printf("%.1f%n", media);
			}
		}
	}
}
