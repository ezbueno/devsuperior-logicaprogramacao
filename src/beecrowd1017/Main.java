package beecrowd1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double tempoGasto = sc.nextDouble();
			double velocidadeMedia = sc.nextDouble();
			
			double distanciaPercorrida = tempoGasto * velocidadeMedia;
			double litros = distanciaPercorrida / 12;
			
			System.out.printf("%.3f%n", litros);
		}
	}
}
