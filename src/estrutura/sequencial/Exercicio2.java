package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler medidas da largura e comprimento de um terreno retangular
 * com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais.
 * Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do
 * terreno, ambos com duas casas decimais, conforme exemplo.
 * Exemplo:
 * Entrada:
 * 10.0
 * 30.0
 * 200.0
 * Saída:
 * Área = 300.00
 * Preço = 60000.00
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double largura = sc.nextDouble();
			double comprimento = sc.nextDouble();
			double metroQuadrado = sc.nextDouble();
			
			double area = largura * comprimento;
			double preco = area * metroQuadrado;
			
			System.out.printf("Área = %.2f%n", area);
			System.out.printf("Preço = %.2f%n", preco);
		}
	}
}
