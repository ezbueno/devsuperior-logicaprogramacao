package beecrowd1114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int senha = sc.nextInt();
			
			if (senha == 2002) {
				System.out.println("Acesso Permitido");
			}
			
			while (senha != 2002) {
				System.out.println("Senha Invalida");
				senha = sc.nextInt();
				
				if (senha == 2002) {
					System.out.println("Acesso Permitido");
					break;
				}
			}
		}
	}
}
