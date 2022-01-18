package beecrowd1172;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] vet = new int[10];

			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();

				if (vet[i] == 0 || vet[i] < 0) {
					vet[i] = 1;
				}
			}

			for (int i = 0; i < vet.length; i++) {
				System.out.println("X[" + i + "] = " + vet[i]);
			}
		}
	}
}
