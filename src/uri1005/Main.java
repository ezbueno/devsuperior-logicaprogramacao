package uri1005;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			
			double pesoNotaA = 3.5;
			double pesoNotaB = 7.5;
			
			double somaPeso = pesoNotaA + pesoNotaB;
			
			double media = (A * pesoNotaA + B * pesoNotaB) / somaPeso;
			
			System.out.printf("MEDIA = %.5f%n", media);
		}
	}
}
