package beecrowd1145;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int linha = x;
			int contador = 1;

			for (int i = 1; i <= y; i++) {
				System.out.print(i);

				if (contador < linha) {
					System.out.print(" ");
					contador++;
				} else {
					contador = 1;
					System.out.print("\n");
				}
			}
		}
	}
}
