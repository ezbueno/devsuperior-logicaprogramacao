package beecrowd1117;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int contador = 0;
			double soma = 0.0;
			double media;
			double nota;

			while (contador != 2) {
				nota = sc.nextFloat();
				if (nota >= 0.0 && nota <= 10.0) {
					soma += nota;
					contador++;
				} else {
					System.out.println("nota invalida");
				}
			}
			media = soma / contador;
			System.out.printf("media = %.2f%n", media);
		}
	}
}
