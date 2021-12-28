package estrutura.condicional;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um
 * dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).
 * Escrever na tela o dia da semana correspondente, conforme exemplos:
 * Entrada:
 * 1
 * Saída:
 * Dia da semana: domingo
 * Entrada:
 * 4
 * Saída:
 * Dia da semana: quarta
 * Entrada:
 * 9
 * Saída:
 * Dia da semana: valor inválido
 */
public class Exercicio4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int diaSemana = sc.nextInt();

			switch (diaSemana) {
			case 1:
				System.out.println("Dia da semana: domingo");
				break;
			case 2:
				System.out.println("Dia da semana: segunda");
				break;
			case 3:
				System.out.println("Dia da semana: terça");
				break;
			case 4:
				System.out.println("Dia da semana: quarta");
				break;
			case 5:
				System.out.println("Dia da semana: quinta");
				break;
			case 6:
				System.out.println("Dia da semana: sexta");
				break;
			case 7:
				System.out.println("Dia da semana: sábado");
				break;
			default:
				System.out.println("Dia da semana: valor inválido");
			}
		}
	}
}
