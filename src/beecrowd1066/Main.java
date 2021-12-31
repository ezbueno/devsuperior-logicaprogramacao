package beecrowd1066;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			int par = 0;
			int impar = 0;
			int positivo = 0;
			int negativo = 0;

			for (int i = 0; i < 5; i++) {
				n = sc.nextInt();

				if (n % 2 == 0) {
					par++;
				} else {
					impar++;
				}

				if (n > 0) {
					positivo++;
				} else if (n == 0) {
					positivo += 0;
				} else {
					negativo++;
				}
			}
			System.out.println(par + " valor(es) par(es)");
			System.out.println(impar + " valor(es) impar(es)");
			System.out.println(positivo + " valor(es) positivo(s)");
			System.out.println(negativo + " valor(es) negativo(s)");
		}
	}
}
