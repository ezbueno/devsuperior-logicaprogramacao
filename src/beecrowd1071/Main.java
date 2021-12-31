package beecrowd1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int soma = 0;
			int min;
			int max;

			min = Math.min(x, y);
			max = Math.max(x, y);

			for (int i = min + 1; i < max; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}

			System.out.println(soma);
		}
	}
}
