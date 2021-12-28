package beecrowd1044;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
					
			if (a > b) {
				String mensagem = a % b == 0 ? "Sao Multiplos" : "Nao sao Multiplos";
				System.out.println(mensagem);
				
			} else {
				String mensagem = b % a == 0 ? "Sao Multiplos" : "Nao sao Multiplos";
				System.out.println(mensagem);
			}
			
		}
	}
}
