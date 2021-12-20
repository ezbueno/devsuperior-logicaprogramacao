package uri1015;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			String linha = sc.nextLine();
			String[] valores = linha.split("\\s");
			
			double x1 = Double.parseDouble(valores[0]);
			double y1 = Double.parseDouble(valores[1]);
			
			linha = sc.nextLine();
			valores = linha.split("\\s");
			
			double x2 = Double.parseDouble(valores[0]);
			double y2 = Double.parseDouble(valores[1]);
			
			double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			
			System.out.printf("%.4f%n", distancia);
		}
	}
}
