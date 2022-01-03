package estrutura.repetitiva;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa que lê números inteiros até que zero seja lido.
 * Ao final, mostre a soma dos números lidos.
 * Entrada:
 * 5
 * 2
 * 4
 * 0
 * Saída:
 * 11
 */
public class Exercicio1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int soma = 0;
			
			while (n != 0) {
				soma += n;
				n = sc.nextInt();
			}
			
			System.out.println(soma);
		}
	}
}
