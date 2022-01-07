package beecrowd1079;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			double peso1 = 2.0;
			double peso2 = 3.0;
			double peso3 = 5.0;
			double somaPeso = peso1 + peso2 + peso3;
			double n1 = 0.0;
			double n2 = 0.0;
			double n3 = 0.0;
			double media;

			for (int i = 1; i <= n; i++) {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();
				media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / somaPeso;
				System.out.printf("%.1f%n", media);
			}
		}
	}
}
