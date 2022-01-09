package beecrowd1143;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x;
			int y;

			for (int i = 1; i <= n; i++) {
				x = i * i;
				y = i * x;
				System.out.print(i + " " + x + " " + y + "\n");
			}
		}
	}
}
