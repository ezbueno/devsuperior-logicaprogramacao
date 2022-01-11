package beecrowd1158;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int contador = 1;
			int i;
			int soma;

			while (contador <= n) {
				i = 1;
				soma = 0;
				int x = sc.nextInt();
				int y = sc.nextInt();

				while (i <= y) {
					if (x % 2 != 0) {
						soma += x;
						i++;
					}
					x++;
				}
				System.out.println(soma);
				contador++;
			}
		}
	}
}
