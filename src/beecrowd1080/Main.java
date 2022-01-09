package beecrowd1080;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int maior = 0;
		int posicao = 0;

		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 1; i <= 100; i++) {
				n = sc.nextInt();

				if (n > maior) {
					maior = n;
					posicao = i;
				}
			}

			System.out.println(maior);
			System.out.println(posicao);
		}
	}
}
