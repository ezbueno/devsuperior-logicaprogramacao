package uri1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final String FORMATADOR = "Total: R$ %.2f%n";
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int codigo = sc.nextInt();
			int quantidade = sc.nextInt();
			
			double preco = 0.0;
			
			if (codigo == 1) {
				preco = 4.0;
				double valor = quantidade * preco;
				System.out.printf(FORMATADOR, valor);
			} else if (codigo == 2) {
				preco = 4.5;
				double valor = quantidade * preco;
				System.out.printf(FORMATADOR, valor);
			} else if (codigo == 3) {
				preco = 5.0;
				double valor = quantidade * preco;
				System.out.printf(FORMATADOR, valor);
			} else if (codigo == 4) {
				preco = 2.0;
				double valor = quantidade * preco;
				System.out.printf(FORMATADOR, valor);
			} else {
				preco = 1.5;
				double valor = quantidade * preco;
				System.out.printf(FORMATADOR, valor);
			}
		}
	}
}
