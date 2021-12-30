package beecrowd1049;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			String str3 = sc.nextLine();
			
			if (str1.equals("vertebrado") && str2.equals("ave") && str3.equals("carnivoro")) {
				System.out.println("aguia");
			} else if (str1.equals("vertebrado") && str2.equals("ave") && str3.equals("onivoro")) {
				System.out.println("pomba");
			} else if (str1.equals("vertebrado") && str2.equals("mamifero") && str3.equals("onivoro")) {
				System.out.println("homem");
			} else if (str1.equals("vertebrado") && str2.equals("mamifero") && str3.equals("herbivoro")) {
				System.out.println("vaca");
			} else if (str1.equals("invertebrado") && str2.equals("inseto") && str3.equals("hematofago") ) {
				System.out.println("pulga");
			} else if (str1.equals("invertebrado") && str2.equals("inseto") && str3.equals("herbivoro")) {
				System.out.println("lagarta");
			} else if (str1.equals("invertebrado") && str2.equals("anelideo") && str3.equals("hematofago") ) {
				System.out.println("sanguessuga");
			} else {
				System.out.println("minhoca");
			}
		}
	}
}
