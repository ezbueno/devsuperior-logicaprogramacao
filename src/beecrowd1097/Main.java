package beecrowd1097;

public class Main {

	public static void main(String[] args) {
		int contador = 1;
		int x = 7;

		for (int i = 1; i <= 9; i += 2) {
			for (int j = x; contador <= 3; j--, contador++) {
				System.out.println("I=" + i + " " + "J=" + j);
			}
			contador = 1;
			x += 2;
		}
	}
}
