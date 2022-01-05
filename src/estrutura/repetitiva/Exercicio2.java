package estrutura.repetitiva;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem
 * "impossível calcular".
 * Exemplos:
 * Entrada:
 * 31
 * 27
 * 46
 * -5
 * Saída:
 * 34.67
 * Entrada:
 * -10
 * Saída:
 * impossível calcular
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int contador = 0;
		double soma = 0.0;
		double media;

		try (Scanner sc = new Scanner(System.in)) {
			int idade = sc.nextInt();

			while (idade >= 0) {
				soma += idade;
				contador++;
				idade = sc.nextInt();
			}

			if (contador > 0) {
				media = soma / contador;
				System.out.printf("%.2f%n", media);
			} else {
				System.out.println("impossível calcular");
			}
		}
	}
}
