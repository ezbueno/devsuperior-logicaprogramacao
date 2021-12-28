package uri1040;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			float nota1 = sc.nextFloat();
			float nota2 = sc.nextFloat();
			float nota3 = sc.nextFloat();
			float nota4 = sc.nextFloat();
			
			float peso2 = 2F;
			float peso3 = 3F;
			float peso4 = 4F;
			float peso1 = 1F;
			
			float somaPeso = peso2 + peso3 + peso4 + peso1;
			
			float media = ((nota1 * peso2) + (nota2 * peso3) + (nota3 * peso4) + (nota4 * peso1)) / somaPeso;
			
			if (media >= 7.0) {
				System.out.printf("Media: %.1f%n", media);
				System.out.println("Aluno aprovado.");
			} else if (media < 5.0) {
				System.out.printf("Media: %.1f%n", media);
				System.out.println("Aluno reprovado.");
			} else if (media >= 5.0 && media <= 6.9) {
				System.out.printf("Media: %.1f%n", media);
				System.out.println("Aluno em exame.");
				float notaExame = sc.nextFloat();
				System.out.println("Nota do exame: " + notaExame);
				media = (media + notaExame) / 2F;
				
				if (media >= 5.0) {
					System.out.println("Aluno aprovado.");
					System.out.printf("Media final: %.1f%n", media);
				} else {
					System.out.println("Aluno reprovado.");
					System.out.printf("Media final: %.1f%n", media);
				}
			}
		}
	}
}
