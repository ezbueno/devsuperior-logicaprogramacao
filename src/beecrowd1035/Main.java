package beecrowd1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			int soma1 = c + d;
			int soma2 = a + b;
			
			if (b > c && d > a && soma1 > soma2 && c >=0 && d >=0 && a % 2 == 0) {
				System.out.println("Valores aceitos");
			} else {
				System.out.println("Valores nao aceitos");
			}
		}
	}
}
