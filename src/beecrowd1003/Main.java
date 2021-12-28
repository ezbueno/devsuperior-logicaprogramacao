package beecrowd1003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int soma = A + B;
			
			System.out.println("SOMA = " + soma);
		}
	}
}
