package beecrowd1042;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if ((a <= 0) && (a <= b) && (a <= c) && (b <= c)) {
				System.out.println(a + "\n" + b + "\n" + c);
			} else if ((a <= 0) && (a <= b) && (a <= c) && (c <= b)) {
				System.out.println(a + "\n" + c + "\n" + b);
			} else if ((b <= 0) && (b <= a) && (b <= c) && (a <= c)) {
				System.out.println(b + "\n" + a + "\n" + c);
			} else if ((b <= 0) && (b <= a) && (b <= c) && (c <= a)) {
				System.out.println(b + "\n" + c + "\n" + a);
			} else if ((c <= 0) && (c <= a) && (c <= b) && (b <= a)) {
				System.out.println(c + "\n" + b + "\n" + a);
			} else {
				System.out.println(c + "\n" + a + "\n" + b);
			}
			
			System.out.println();
			System.out.println(a + "\n" + b + "\n" + c);
		}
	}
}
