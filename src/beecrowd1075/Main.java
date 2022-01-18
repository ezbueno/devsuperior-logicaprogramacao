package beecrowd1075;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int i = 1; i <= 10000; i++) {
				if (i % n == 2) {
					System.out.println(i);
				}
			}
		}
	}
}
