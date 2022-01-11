package vetores;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um valor N e depois o nome de N pessoas.
 * Em seguida, mostrar os nomes lidos.
 * Exemplo:
 * Entrada:
 * 3
 * Maria
 * Joaquim
 * Ana
 * Saída:
 * Nomes lidos:
 * Maria
 * Joaquim
 * Ana
 */
public class Exercicio5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String[] nomes = new String[n];
			
			for (int i = 0; i < n; i++) {
				nomes[i] = sc.next();
			}
			
			System.out.println("Nomes lidos:");
			for (String nome : nomes) {
				System.out.println(nome);
			}
		}
	}
}
