package vetores.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar 
 * um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um 
 * programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
 * - lucro < 10%
 * - 10% ≤ lucro ≤ 20%
 * lucro > 20%
 * Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
 */
public class Exercicio9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int contAbaixoDe10 = 0;
			int contEntre10E20 = 0;
			int contAcimaDe20 = 0;
			
			String[] nomes = new String[n];
			
			double[] precosCompra = new double[n];
			double[] precosVenda = new double[n];
			double lucro;
			double porcentagemLucro;
			double totalCompra = 0.0;
			double totalVenda = 0.0;
			double totalLucro;
			
			for (int i = 0; i < n; i++) {
				nomes[i] = sc.next();
				precosCompra[i] = sc.nextDouble();
				precosVenda[i] = sc.nextDouble();
			}
			
			for (int i = 0; i < n; i++) {
				lucro = 0.0;
				lucro = precosVenda[i] - precosCompra[i];
				
				porcentagemLucro = (lucro / precosCompra[i]) * 100.0;
				
				if (porcentagemLucro < 10.0) {
					contAbaixoDe10++;
				} else if (porcentagemLucro <= 20.0) {
					contEntre10E20++;
				} else {
					contAcimaDe20++;
				}
			}
			
			System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10++);
			System.out.println("Lucro entre 10% e 20%: " + contEntre10E20++);
			System.out.println("Lucro acima de 20%: " + contAcimaDe20++);
			
			for (int i = 0; i < n; i++) {
				totalCompra += precosCompra[i];
				totalVenda += precosVenda[i];
			}
			
			totalLucro = totalVenda - totalCompra;
			
			System.out.printf("Valor total de compra: %.2f%n", totalCompra);
			System.out.printf("Valor total de venda: %.2f%n", totalVenda);
			System.out.printf("Lucro total: %.2f%n", totalLucro);
		}
	}
}
