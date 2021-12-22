package estrutura.condicional;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler três números inteiros. Em seguida, mostrar
 * qual o menor dentre os três números lidos. Em caso de empate, mostrar
 * apenas uma vez.
 * Exemplos:
 * Entrada:
 * 7 3 8
 * Saída:
 * MENOR = 3
 * Entrada:
 * 5 12 5
 * Saída:
 * MENOR = 5
 * Entrada:
 * 9 9 9
 * Saída:
 * MENOR = 9
 */
public class Exercicio2 {
	
	private static final String MENOR = "MENOR = ";

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a < b && a < c) {
				System.out.println(MENOR + a);
			} else if (b < c) {
				System.out.println(MENOR + b);
			} else {
				System.out.println(MENOR + c);
			}
		}
	}
}
