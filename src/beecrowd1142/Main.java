package beecrowd1142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x = 1;
			int y = 2;
			int z = 3;

			for (int i = 1; i <= n; i++) {
				System.out.print(x + " " + y + " " + z + " PUM\n");
				x += 4;
				y += 4;
				z += 4;
			}
		}
	}
}
