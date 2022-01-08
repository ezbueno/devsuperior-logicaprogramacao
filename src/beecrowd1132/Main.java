package beecrowd1132;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int min = Math.min(x, y);
			int max = Math.max(x, y);
			int soma = 0;

			for (int i = min; i <= max; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
			System.out.println(soma);
		}
	}
}
