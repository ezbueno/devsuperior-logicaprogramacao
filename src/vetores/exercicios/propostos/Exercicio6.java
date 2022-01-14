package vetores.exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome 
 * da pessoa mais velha.
 */
public class Exercicio6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] idades = new int[n];
			int maiorIdade = 0;
			String[] nomes = new String[n];
			String nome = "";
			
			for (int i = 0; i < n; i++) {
				nomes[i] = sc.next();
				idades[i] = sc.nextInt();
				
				if (idades[i] > maiorIdade) {
					maiorIdade = idades[i];
					nome = nomes[i];
				}
			}
			
			System.out.println("Pessoa mais velha: " + nome);
		}
	}
}
