package beecrowd1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			String linha = sc.nextLine();
			String[] valores = linha.split("\\s");
			
			@SuppressWarnings("unused")
			int codigoPecaLinha1 = Integer.parseInt(valores[0]);
			int numPecasLinha1 = Integer.parseInt(valores[1]);
			double valorUnitarioPecaLinha1 = Double.parseDouble(valores[2]);
			
			linha = sc.nextLine();
			valores = linha.split("\\s");
			
			@SuppressWarnings("unused")
			int codigoPecaLinha2 = Integer.parseInt(valores[0]);
			int numPecasLinha2 = Integer.parseInt(valores[1]);
			double valorUnitarioPecaLinha2 = Double.parseDouble(valores[2]);
			
			double valorTotal = numPecasLinha1 * valorUnitarioPecaLinha1 + numPecasLinha2 * valorUnitarioPecaLinha2;
			
			System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		}
	}
}
