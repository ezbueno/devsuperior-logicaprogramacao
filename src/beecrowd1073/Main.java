package beecrowd1073;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int quadrado;

			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					quadrado = (int) Math.pow(i, 2);
					System.out.println(i + "^2" + " = " + quadrado);
				}
			}
		}
	}
}
