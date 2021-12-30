package beecrowd1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int n4 = sc.nextInt();
			int n5 = sc.nextInt();
			int par = 0;
			@SuppressWarnings("unused")
			int impar = 0;
			
			if (n1 % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
			if (n2 % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
			if (n3 % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
			if (n4 % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
			if (n5 % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			System.out.println(par + " valores pares");
		}
	}
}
