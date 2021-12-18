package uri1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int PROD = x * y;
			
			System.out.println("PROD = " + PROD);
		}
	}
}
