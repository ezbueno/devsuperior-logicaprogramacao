package beecrowd1154;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int quantidade = 0;
		int soma = 0;
		double media;

		try (Scanner sc = new Scanner(System.in)) {
			int numero = sc.nextInt();

			while (numero >= 0) {
				soma += numero;
				quantidade++;
				numero = sc.nextInt();
			}

			if (quantidade > 0) {
				media = (double) soma / quantidade;
				System.out.printf("%.2f%n", media);
			}
		}
	}
}
