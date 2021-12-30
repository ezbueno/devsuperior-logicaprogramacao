package beecrowd1060;

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
			int positivo = 0;
			@SuppressWarnings("unused")
			int negativo = 0;

			if (n1 >= 0.0) {
				positivo++;
			} else {
				negativo++;
			}

			if (n2 >= 0.0) {
				positivo++;
			} else {
				negativo++;
			}

			if (n3 >= 0.0) {
				positivo++;
			} else {
				negativo++;
			}

			if (n4 >= 0.0) {
				positivo++;
			} else {
				negativo++;
			}

			if (n5 >= 0.0) {
				positivo++;
			} else {
				negativo++;
			}

			if (n6 >= 0.0) {
				positivo++;
			} else {
				negativo++;
			}
			System.out.println(positivo + " valores positivos");
		}
	}
}
