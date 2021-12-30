package beecrowd1047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int horaInicial = sc.nextInt();
			int minutoInicial = sc.nextInt();
			int horaFinal = sc.nextInt();
			int minutoFinal = sc.nextInt();

			int duracao = 0;
			int duracaoHoras = 0;
			int duracaoMinutos = 0;

			int instanteInicial = (horaInicial * 60) + minutoInicial;
			int instanteFinal = (horaFinal * 60) + minutoFinal;

			if (instanteInicial < instanteFinal) {
				duracao = instanteFinal - instanteInicial;
			} else {
				duracao = ((24 * 60) - instanteInicial) + instanteFinal;
			}

			duracaoHoras = duracao / 60;
			duracaoMinutos = duracao % 60;

			System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
		}
	}
}
