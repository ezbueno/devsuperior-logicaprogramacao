package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um número N, depois nome (apenas uma palavra sem espaços),
 * idade e altura de N pessoas, conforme exemplo.
 * Depois, mostrar na tela a altura média das pessoas e mostrar também a porcentagem de
 * pessoas com menos de 16 anos.
 * Exemplo:
 * Entrada:
 * 5
 * João 15 1.82
 * Maria 16 1.60
 * Teresa 14 1.58
 * Carlos 21 1.65
 * Paulo 17 1.78
 * Saída:
 * Altura média: 1.69
 * Pessoas com menos de 16 anos: 40.0%
 * 
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
					
		int quantidade = 0;
		double soma = 0.0;
		double media;
		double porcentagem;
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			String[] nomes = new String[n];
			int[] idades = new int[n];
			double[] alturas = new double[n];
			
			for (int i = 0; i < n; i++) {
				nomes[i] = sc.next();
				idades[i] = sc.nextInt();
				alturas[i] = sc.nextDouble();
			}
			
			for (int i = 0; i < n; i++) {
				soma += alturas[i];
			}
			
			media = soma / n;
			System.out.printf("Altura média: %.2f%n", media);
			
			for (int i = 0; i < n; i++) {
				if (idades[i] < 16) {
					quantidade++;
				}
			}
			
			porcentagem = (quantidade * 100.0) / n;
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		}
	}
}
