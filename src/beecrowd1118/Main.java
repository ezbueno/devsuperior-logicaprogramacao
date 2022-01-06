package beecrowd1118;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int opcao = 1;
			double media;
			double nota1;
			double nota2;

			while (opcao == 1) {
				nota1 = sc.nextDouble();

				while (nota1 < 0 || nota1 > 10) {
					System.out.println("nota invalida");
					nota1 = sc.nextDouble();
				}

				nota2 = sc.nextDouble();

				while (nota2 < 0 || nota2 > 10) {
					System.out.println("nota invalida");
					nota2 = sc.nextDouble();
				}

				media = (nota1 + nota2) / 2.0;
				System.out.printf("media = %.2f%n", media);

				System.out.println("novo calculo (1-sim 2-nao)");
				opcao = sc.nextInt();

				while (opcao < 1 || opcao > 2) {
					System.out.println("novo calculo (1-sim 2-nao)");
					opcao = sc.nextInt();
				}
			}
		}
	}
}
