package uri1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			
			double pesoNotaA = 2;
			double pesoNotaB = 3;
			double pesoNotaC = 5;
			
			double somaPeso = pesoNotaA + pesoNotaB + pesoNotaC;
			
			double media = (A * pesoNotaA + B * pesoNotaB + C * pesoNotaC) / somaPeso;
			
			System.out.printf("MEDIA = %.1f%n", media);
		}
	}
}
