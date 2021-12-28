package beecrowd1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int quantidadeHoras = sc.nextInt();
			double valorHora = sc.nextDouble();
			
			double salario = quantidadeHoras * valorHora;
			
			System.out.println("NUMBER = " + num);
			System.out.printf("SALARY = U$ %.2f%n", salario);
		}
	}
}
