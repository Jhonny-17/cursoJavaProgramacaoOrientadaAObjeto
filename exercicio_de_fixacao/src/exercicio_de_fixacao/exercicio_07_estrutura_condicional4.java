package exercicio_de_fixacao;

import java.util.Scanner;

public class exercicio_07_estrutura_condicional4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}

}
