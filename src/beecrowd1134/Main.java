package beecrowd1134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int codigo = sc.nextInt();
			int tipoCombustivelAlcool = 0;
			int tipoCombustivelGasolina = 0;
			int tipoCombustivelDiesel = 0;

			while (codigo < 1 || codigo > 4) {
				codigo = sc.nextInt();
			}

			while (codigo >= 1 && codigo <= 4) {
				if (codigo == 1) {
					tipoCombustivelAlcool++;
				} else if (codigo == 2) {
					tipoCombustivelGasolina++;
				} else if (codigo == 3) {
					tipoCombustivelDiesel++;
				} else if (codigo == 4) {
					break;
				}

				codigo = sc.nextInt();

				while (codigo < 1 || codigo > 4) {
					codigo = sc.nextInt();
				}
			}

			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + tipoCombustivelAlcool);
			System.out.println("Gasolina: " + tipoCombustivelGasolina);
			System.out.println("Diesel: " + tipoCombustivelDiesel);
		}
	}
}
