package beecrowd1013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String linha = sc.nextLine();
			String[] valores = linha.split("\\s");
			
			int a = Integer.parseInt(valores[0]);
			int b = Integer.parseInt(valores[1]);
			int c = Integer.parseInt(valores[2]);
			
			int maiorAB = (a + b + Math.abs(a - b)) / 2;
			
			System.out.println(maiorAB > c ? maiorAB + " eh o maior" : c + " eh o maior");
		}
	}
}
