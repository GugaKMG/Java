package swift;

import java.util.Scanner;

/**
 * feito no ifsc
 * @author GugaKMG-Gustavo Kr�ger de Mira
 * @since 23/02/2023
 * */

public class Switch {

	public static void main(String[] args) {
		int dia;
		
		System.out.println("Digite o dia da semana em n�meros:");
		
		Scanner teclado = new Scanner(System.in);
		dia=teclado.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		}
		teclado.close(); //n�o esquecer de fechar o scanner.

	}

}
