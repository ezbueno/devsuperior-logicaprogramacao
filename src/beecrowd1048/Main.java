package beecrowd1048;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	private static final String NOVO_SALARIO = "Novo salario: %.2f%n";
	private static final String REAJUSTE = "Reajuste ganho: %.2f%n";
	private static final String PERCENTUAL = "Em percentual: ";

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double salario = sc.nextDouble();
			double novoSalario = 0.0;
			double reajuste = 0.0;
			double percentual = 0.0;
			
			if (salario >= 0.0 && salario <= 400.0) {
				percentual = 0.15;
				reajuste = (salario * percentual);
				novoSalario = salario + reajuste;
				System.out.printf(NOVO_SALARIO, novoSalario);
				System.out.printf(REAJUSTE, reajuste);
				System.out.println(PERCENTUAL + (int) (percentual * 100) + " %");
			} else if (salario >= 400.01 && salario <= 800.0) {
				percentual = 0.12;
				reajuste = (salario * percentual);
				novoSalario = salario + reajuste;
				System.out.printf(NOVO_SALARIO, novoSalario);
				System.out.printf(REAJUSTE, reajuste);
				System.out.println(PERCENTUAL + (int) (percentual * 100) + " %");
			} else if (salario >= 800.01 && salario <= 1200.0) {
				percentual = 0.10;
				reajuste = (salario * percentual);
				novoSalario = salario + reajuste;
				System.out.printf(NOVO_SALARIO, novoSalario);
				System.out.printf(REAJUSTE, reajuste);
				System.out.println(PERCENTUAL + (int) (percentual * 100) + " %");
			} else if (salario >= 1200.01 && salario <= 2000.0) {
				percentual = 0.07;
				reajuste = (salario * percentual);
				novoSalario = salario + reajuste;
				System.out.printf(NOVO_SALARIO, novoSalario);
				System.out.printf(REAJUSTE, reajuste);
				System.out.println(PERCENTUAL + (int) (percentual * 100) + " %");
			} else {
				percentual = 0.04;
				reajuste = (salario * percentual);
				novoSalario = salario + reajuste;
				System.out.printf(NOVO_SALARIO, novoSalario);
				System.out.printf(REAJUSTE, reajuste);
				System.out.println(PERCENTUAL + (int) (percentual * 100) + " %");
			}
		}
	}
}
