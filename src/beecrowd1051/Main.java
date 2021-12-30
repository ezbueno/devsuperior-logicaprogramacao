package beecrowd1051;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double salario = sc.nextDouble();
			double imposto;
			
			if (salario <= 2000.0) {
				imposto = 0.0;
			} else if (salario <= 3000.0) {
				imposto = (salario - 2000.0) * 0.08;
			} else if (salario <= 4500.0) {
				imposto = ((salario - 3000) * 0.18) + (0.08 * 1000.0);
			} else {
				imposto = ((salario - 4500) * 0.28) + (0.18 * 1500.0) + (0.08 * 1000.0);
			}
			
			if (imposto == 0.0) {
				System.out.println("Isento");
			} else {
				System.out.printf("R$ %.2f%n", imposto);
			}
		}
	}
}
