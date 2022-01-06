package beecrowd1159;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int numero = sc.nextInt();
			int contador;
			int soma;

			while (numero != 0) {
				contador = 1;
				soma = 0;
				while (contador <= 5) {
					if (numero % 2 == 0) {
						soma += numero;
						contador++;
					}
					numero++;
				}
				System.out.println(soma);
				numero = sc.nextInt();
			}
		}
	}
}
