package estrutura.repetitiva;

import java.util.Locale;
import java.util.Scanner;
/**
 * @author Ezandro Bueno
 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
 * digite "s", repetir o programa.
 * Fórmula: F = ((9 * C) / 5) + 32
 * Exemplo:
 * Digite a temperatura em Celsius: 30.0
 * Equivalente em Fahrenheit: 86.0
 * Deseja repetir (s/n)? s
 * Digite a temperatura em Celsius: 21.0
 * Equivalente em Fahrenheit: 69.8
 * Deseja repetir (s/n)? s
 * Digite a temperatura em Celsius: -10.5
 * Equivalente em Fahrenheit: 13.1
 * Deseja repetir (s/n)? n
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double c;
		double f;
		char opcao;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Digite a temperatura em Celsius: ");
				c = sc.nextDouble();
				f = ((9.0 * c) / 5.0) + 32;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
				System.out.print("Deseja repetir (s/n)? ");
				opcao = sc.next().charAt(0);
			} while (opcao == 's');
		}
	}
}
