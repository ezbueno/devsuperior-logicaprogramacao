package uri1016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {		
			int km = sc.nextInt();
			
			int minutos = (60 * km) / 30;
			
			System.out.println(minutos + " minutos");
		}
	}
}
