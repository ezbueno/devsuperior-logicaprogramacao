package beecrowd1144;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.print(i + " " + (i * i) + " " + (i * i * i) + "\n");
				System.out.print(i + " " + ((i * i) + 1) + " " + ((i * i * i) + 1) + "\n");
			}
		}
	}
}
