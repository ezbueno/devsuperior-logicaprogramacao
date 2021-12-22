package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
 * segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final
 * que o aluno obteve no ano juntamente com o texto explicativo. Caso a nota
 * final do aluno seja inferior a 60.0, mostrar a mensagem "REPROVADO", conforme
 * exemplos. Todos os valores devem ter um casa decimal.
 * Exemplos:
 * Entrada:
 * 45.5
 * 31.3
 * Saída:
 * NOTA FINAL = 76.8
 * Entrada:
 * 34.0
 * 23.5
 * Saída:
 * NOTA FINAL = 57.5
 * REPROVADO
 * 
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			double notaFinal = nota1 + nota2;
			
			if (notaFinal < 60.0)  {
				System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
				System.out.println("REPROVADO");
			} else {
				System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			}
		}
	}
}
