package uri1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			String nome = sc.next();
			double salario = sc.nextDouble();
			double totalVendas = sc.nextDouble();
			
			double totalAReceber = (totalVendas * 0.15) + salario;
			
			System.out.printf("TOTAL = R$ %.2f%n", totalAReceber);
		}
	}
}
