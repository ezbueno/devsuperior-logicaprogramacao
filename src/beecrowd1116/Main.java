package beecrowd1116;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x;
			int y;
			double resultadoDivisao;

			for (int i = 0; i < n; i++) {
				x = sc.nextInt();
				y = sc.nextInt();

				if (y == 0) {
					System.out.println("divisao impossivel");
				} else {
					resultadoDivisao = (double) x / y;
					System.out.printf("%.1f%n", resultadoDivisao);
				}
			}
		}
	}
}
