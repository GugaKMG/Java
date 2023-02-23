package com.ifsc.tds;

import java.util.Scanner; //Tecla de atalho ctrl+shift+o, para importar o Scanner.

public class Principal {
	// ctrlshift+f, identação, alinhar.

	public static void main(String[] args) {
		// System.out.println("Alô mundo!");

		int dia = 0;
		float salario = 150.25f; //Não esquece do f depois dos números.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o dia da semana em números de 1 a 7");
		dia = teclado.nextInt(); //scanf
		
		if(dia == 1) {
			System.out.println("Hoje é domingo.");
		}
		else if(dia == 2) {
			System.out.println("Hoje é segunda.");
		}
		else if(dia == 3) {
			 System.out.println("Hoje é terça.");
		}
		else if(dia == 4) {
			System.out.println("Hoje é quarta.");
		}
		else if(dia == 5) {
			 System.out.println("Hoje é quinta.");
		}
		else if(dia == 6) {
			System.out.println("Hoje é sexta.");
		}
		else if(dia == 7) {
			System.out.println("Hoje é sábado.");
		}
		else {
			System.out.println("Valor inválido.");
		}

	}

}