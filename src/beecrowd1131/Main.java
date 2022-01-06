package beecrowd1131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int opcao = 1;
			int quantidadePartidas = 0;
			int golsMarcadosInter;
			int numVitoriasInter = 0;
			int golsMarcadosGremio = 0;
			int numVitoriasGremio = 0;
			int empates = 0;

			while (opcao == 1) {
				golsMarcadosInter = sc.nextInt();
				golsMarcadosGremio = sc.nextInt();

				if (golsMarcadosInter > golsMarcadosGremio) {
					numVitoriasInter++;
				} else if (golsMarcadosInter < golsMarcadosGremio) {
					numVitoriasGremio++;
				} else {
					empates++;
				}

				quantidadePartidas++;

				System.out.println("Novo grenal (1-sim 2-nao)");
				opcao = sc.nextInt();

				if (opcao == 2) {
					String mensagem = numVitoriasInter > numVitoriasGremio ? "Inter venceu mais" : "Gremio venceu mais";

					System.out.println(quantidadePartidas + " grenais");
					System.out.println("Inter:" + numVitoriasInter);
					System.out.println("Gremio:" + numVitoriasGremio);
					System.out.println("Empates:" + empates);
					System.out.println(mensagem);
				}
			}
		}
	}
}
