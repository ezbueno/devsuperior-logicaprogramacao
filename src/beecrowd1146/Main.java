package beecrowd1146;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();

			while (x != 0) {
				for (int i = 1; i <= x; i++) {
					if (i < x) {
						System.out.print(i + " ");
					} else {
						System.out.println(i);
					}
				}
				x = sc.nextInt();
			}
		}
	}
}
