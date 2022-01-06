package estrutura.repetitiva;

import java.util.Scanner;

/**
 * @author Ezandro Bueno 
 * Fazer um programa que lê um valor inteiro N e depois N números inteiros. 
 * Ao final, mostre a soma dos N números lidos.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n  = sc.nextInt();
			int x;
			int soma = 0;

			for (int i = 0; i < n; i++) {
				x = sc.nextInt();
				soma += x;
			}

			System.out.println(soma);
		}
	}
}
