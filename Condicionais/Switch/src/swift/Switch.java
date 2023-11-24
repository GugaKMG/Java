package swift;

import java.util.Scanner;

/**
 * feito no ifsc
 * @author GugaKMG-Gustavo Krüger de Mira
 * @since 23/02/2023
 * */

public class Switch {

	public static void main(String[] args) {
		int dia;
		
		System.out.println("Digite o dia da semana em números:");
		
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
			System.out.println("Terça");
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
			System.out.println("Sábado");
			break;
		}
		teclado.close(); //não esquecer de fechar o scanner.

	}

}
