package beecrowd1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			int nota = 100;
			int quociente = N / 100;
			int resto = N % nota;

			System.out.println(N);
			System.out.println(quociente + " nota(s) de R$ " + nota + ",00");

			nota = 50;
			quociente = resto / nota;
			resto = resto % nota;

			System.out.println(quociente + " nota(s) de R$ " + nota + ",00");

			nota = 20;
			quociente = resto / nota;
			resto = resto % nota;

			System.out.println(quociente + " nota(s) de R$ " + nota + ",00");

			nota = 10;
			quociente = resto / nota;
			resto = resto % nota;

			System.out.println(quociente + " nota(s) de R$ " + nota + ",00");

			nota = 5;
			quociente = resto / nota;
			resto = resto % nota;

			System.out.println(quociente + " nota(s) de R$ " + nota + ",00");

			nota = 2;
			quociente = resto / nota;
			resto = resto % nota;

			System.out.println(quociente + " nota(s) de R$ " + nota + ",00");

			nota = 1;
			quociente = resto / nota;
			resto = resto % nota;

			System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		}
	}
}
