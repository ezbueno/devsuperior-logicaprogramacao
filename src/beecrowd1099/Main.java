package beecrowd1099;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int min;
			int max;
			int soma;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				min = Math.min(x, y);
				max = Math.max(x, y);

				soma = 0;

				for (int j = min + 1; j < max; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}

				System.out.println(soma);
			}
		}
	}
}
