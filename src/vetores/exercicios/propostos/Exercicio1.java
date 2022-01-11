package vetores.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número 
 * do vetor (supor não haver empates). Mostrar também a posição do maior elemento.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			double[] numeros = new double[n];
			double maiorNumero = 0.0;
			int posicao = 0;
			
			for (int i = 0; i < n; i++) {
				numeros[i] = sc.nextDouble();
				
				if (numeros[i] > maiorNumero) {
					maiorNumero = numeros[i];
					posicao = i;
				}
			}
			
			System.out.println(maiorNumero);
			System.out.println(posicao);
		}
	}
}
