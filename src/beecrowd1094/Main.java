package beecrowd1094;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int quantia;
			char tipo;
			int totalCoelhos = 0;
			int totalRatos = 0;
			int totalSapos = 0;
			int totalCobaias = 0;
			double percentualCoelhos = 0.0;
			double percentualRatos = 0.0;
			double percentualSapos = 0.0;

			for (int i = 0; i < n; i++) {
				quantia = sc.nextInt();
				tipo = sc.next().charAt(0);

				if (tipo == 'C') {
					totalCoelhos += quantia;
				} else if (tipo == 'R') {
					totalRatos += quantia;
				} else {
					totalSapos += quantia;
				}
			}

			totalCobaias = totalCoelhos + totalRatos + totalSapos;

			System.out.println("Total: " + totalCobaias + " cobaias");
			System.out.println("Total de coelhos: " + totalCoelhos);
			System.out.println("Total de ratos: " + totalRatos);
			System.out.println("Total de sapos: " + totalSapos);

			if (totalCobaias != 0) {
				percentualCoelhos = (double) (totalCoelhos * 100) / totalCobaias;
				percentualRatos = (double) (totalRatos * 100) / totalCobaias;
				percentualSapos = (double) (totalSapos * 100) / totalCobaias;
			}

			System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
			System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
			System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);
		}
	}
}
