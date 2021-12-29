package beecrowd1045;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			float aux;

			if (b > a && b > c) {
				aux = a;
				a = b;
				b = aux;
			} else if (c > a) {
				aux = a;
				a = c;
				c = aux;
			}

			if (a >= b + c) {
				System.out.println("NAO FORMA TRIANGULO");
			} else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			} else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");

				if (a == b && a == c) {
					System.out.println("TRIANGULO EQUILATERO");
				} else if ((a == b) || (a == c) || (b == c)) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			} else if ((Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2))) {
				System.out.println("TRIANGULO ACUTANGULO");

				if (a == b && a == c) {
					System.out.println("TRIANGULO EQUILATERO");
				} else if ((a == b) || (a == c) || (b == c)) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}
	}
}
