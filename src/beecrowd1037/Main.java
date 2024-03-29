package beecrowd1037;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double valor = sc.nextDouble();
							
			if (valor >= 0 && valor <= 25.0) {
				System.out.println("Intervalo [0,25]");
			} else if (valor >= 25.01 && valor <= 50.0) {
				System.out.println("Intervalo (25,50]");
			} else if (valor >= 50.01 && valor <= 75.0) {
				System.out.println("Intervalo (50,75]");
			} else if (valor >= 75.01 && valor <= 100.0) {
				System.out.println("Intervalo (75,100]");
			} else {
				System.out.println("Fora de intervalo");
			}
		}
	}
}
