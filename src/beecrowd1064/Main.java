package beecrowd1064;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double n4 = sc.nextDouble();
			double n5 = sc.nextDouble();
			double n6 = sc.nextDouble();
			int contador = 0;
			double soma = 0.0;
			double media = 0.0;
			int positivo = 0;
			@SuppressWarnings("unused")
			int negativo = 0;

			if (n1 >= 0.0) {
				positivo++;
				contador++;
				soma += n1;
			} else {
				negativo++;
			}

			if (n2 >= 0.0) {
				positivo++;
				contador++;
				soma += n2;
			} else {
				negativo++;
			}

			if (n3 >= 0.0) {
				positivo++;
				contador++;
				soma += n3;
			} else {
				negativo++;
			}

			if (n4 >= 0.0) {
				positivo++;
				contador++;
				soma += n4;
			} else {
				negativo++;
			}

			if (n5 >= 0.0) {
				positivo++;
				contador++;
				soma += n5;
			} else {
				negativo++;
			}

			if (n6 >= 0.0) {
				positivo++;
				contador++;
				soma += n6;
			} else {
				negativo++;
			}
			
			if (contador != 0) {
				media = soma / contador;
				System.out.println(positivo + " valores positivos");
				System.out.printf("%.1f%n", media);
			}
		}
	}
}
