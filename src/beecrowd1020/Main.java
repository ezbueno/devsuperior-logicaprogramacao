package beecrowd1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			int anos = N / 365;
			int meses = (N % 365) / 30;
			int dias = (N % 365) % 30;
			
			System.out.println(anos + " ano(s)");
			System.out.println(meses + " mes(es)");
			System.out.println(dias + " dia(s)");
		}
	}
}
