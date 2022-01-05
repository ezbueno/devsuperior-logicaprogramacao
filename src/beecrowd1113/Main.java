package beecrowd1113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			while (x != y) {
				if (x < y) {
					System.out.println("Crescente");
				} else {
					System.out.println("Decrescente");
				}
				
				x = sc.nextInt();
				y = sc.nextInt();
			}
		}
	}
}
