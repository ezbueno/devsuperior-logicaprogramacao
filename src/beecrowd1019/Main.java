package beecrowd1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			int horas = N / 3600;
			int minutos = (N % 3600) / 60;
			int segundos = N % 60;
			
			System.out.println(horas + ":" + minutos + ":" + segundos);
		}
	}
}
