package beecrowd1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		
		try (Scanner sc = new Scanner(System.in)) {
			String linha = sc.nextLine();
			String[] valores = linha.split("\\s");
			
			double A = Double.parseDouble(valores[0]);
			double B = Double.parseDouble(valores[1]);
			double C = Double.parseDouble(valores[2]);
			
			double triangulo = (A * C) / 2;
			double circulo = pi * Math.pow(C, 2);
			double trapezio = ((A + B) * C) / 2;
			double quadrado = Math.pow(B, 2);
			double retangulo = A * B;
			
			System.out.printf("TRIANGULO: %.3f%n", triangulo);
			System.out.printf("CIRCULO: %.3f%n", circulo);
			System.out.printf("TRAPEZIO: %.3f%n", trapezio);
			System.out.printf("QUADRADO: %.3f%n", quadrado);
			System.out.printf("RETANGULO: %.3f%n", retangulo);
		}
	}
}
