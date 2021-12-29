package beecrowd1046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int horaInicial = sc.nextInt();
			int horaFinal = sc.nextInt();
			int horaMaxima = 24;
			
			if (horaInicial > horaFinal) {
				System.out.println("O JOGO DUROU " + (horaMaxima - (horaInicial - horaFinal)) + " HORA(S)");
			} else if (horaInicial < horaFinal) {
				System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
			} else {
				System.out.println("O JOGO DUROU " + horaMaxima + " HORA(S)");
			}
		}
	}
}
