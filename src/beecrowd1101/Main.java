package beecrowd1101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			int min;
			int max;
			int soma = 0;

			while (m > 0 && n > 0) {
				min = Math.min(m, n);
				max = Math.max(m, n);

				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
					soma += i;
				}

				System.out.print("Sum=" + soma + "\n");

				soma = 0;
				m = sc.nextInt();
				n = sc.nextInt();
			}
		}
	}
}
