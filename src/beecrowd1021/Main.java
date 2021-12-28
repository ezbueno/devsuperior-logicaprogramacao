package beecrowd1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			double N;
			int quociente;
			int resto;
			int nota;
			int moeda;
			
			N = sc.nextDouble();
			
			/*
			Vamos multiplicar N por 100 e forçar a conversão para int.
			Desse modo, por exemplo, 576.73 vai se tornar 57673

			Vamos também somar 0.5 antes de converter, para assegurar 
			que o número seja devidamente arredondado, pois o tipo double
			às vezes dá problema de arredondamento (por exemplo: se digitarmos
			576.81 e multiplicarmos por 100, o resultado será 57680.99999999,
			daí o casting resultaria em 57680 e não 57681 como desejado)
			*/

			resto = (int) (N * 100.0 + 0.5);
			
			System.out.println("NOTAS:");

			/*
			Como multiplicamos o valor por 100 acima, o valor de cada nota
			também deverá ser multiplicado por 100 a seguir
			*/
			
			nota = 100;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		    resto = resto % (nota * 100);

			nota = 50;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		    resto = resto % (nota * 100);

			nota = 20;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		    resto = resto % (nota * 100);

			nota = 10;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		    resto = resto % (nota * 100);

			nota = 5;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		    resto = resto % (nota * 100);

			nota = 2;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		    resto = resto % (nota * 100);

		    System.out.println("MOEDAS:");

		    /*
		    O valor de cada moeda deverá ser representado em centavos
		    */
		    
			moeda = 100;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 1.00");
		    resto = resto % moeda;

			moeda = 50;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.50");
		    resto = resto % moeda;

			moeda = 25;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.25");
		    resto = resto % moeda;

			moeda = 10;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.10");
		    resto = resto % moeda;

			moeda = 5;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.05");
		    resto = resto % moeda;

			System.out.println(resto + " moeda(s) de R$ 0.01");
		}
	}
}
