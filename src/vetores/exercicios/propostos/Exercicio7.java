package vetores.exercicios.propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. 
 * Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, 
 * considerando aprovados aqueles cuja média das notas seja maior ou igual a seis.
 */
public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			String[] nomes = new String[n];
			
			double[] notasPrimeiroSemestre = new double[n];
			double[] notasSegundoSemestre = new double[n];
			double media;
			
			for (int i = 0; i < n; i++) {
				nomes[i] = sc.next();
				notasPrimeiroSemestre[i] = sc.nextDouble();
				notasSegundoSemestre[i] = sc.nextDouble();
			}
			
			System.out.println("Alunos aprovados:");
			for (int i = 0; i < n; i++) {
				media = 0.0;
				media = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2.0;
				
				if (media >= 6.0) {
					System.out.println(nomes[i]);
				}
			}
		}
	}
}
