package beecrowd1070;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int contador = 6;
			
			if (n % 2 != 0) {
				System.out.println(n);
				contador--;
			}
			
			do {				
				n += 1;
				if (n % 2 != 0) {
					System.out.println(n);
					contador--;
				}
			} while (contador != 0);
		}
	}
}
