package beecrowd1043;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			
			if ((a + b > c) && (a + c > b) && (b + c > a)) {
				float perimetro = a + b + c;
				System.out.println("Perimetro = " + perimetro);
			} else {
				float area = ((a + b) * c) / 2F;
				System.out.println("Area = " + area);
			}
		}
	}
}
