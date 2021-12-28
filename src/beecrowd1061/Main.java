package beecrowd1061;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		String s = sc.next();
		int W1 = sc.nextInt();
		int X1 = sc.nextInt();
		s = sc.next();
		int Y1 = sc.nextInt();
		s = sc.next();
		int Z1 = sc.nextInt();
		s = sc.next();
		int W2 = sc.nextInt();
		int X2 = sc.nextInt();
		s = sc.next();
		int Y2 = sc.nextInt();
		s = sc.next();
		int Z2 = sc.nextInt();
		
		int inicio = W1 * 24 * 60 * 60 + X1 * 60 * 60 + Y1 * 60 + Z1;
		int fim = W2 * 24 * 60 * 60 + X2 * 60 * 60 + Y2 * 60 + Z2;
		int duracao = fim - inicio;
		
		int W = duracao / (24 * 60 * 60);
		int resto = duracao % (24 * 60 * 60);
		int X = resto / (60 * 60);
		resto = resto % (60 * 60);
		int Y = resto / 60;
		int Z = resto % 60;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");		
		
		sc.close();
	}
}
