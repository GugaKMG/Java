package com.ifsc.tds;

import java.util.Scanner; //Tecla de atalho ctrl+shift+o, para importar o Scanner.

public class Principal {
	// ctrlshift+f, identa��o, alinhar.

	public static void main(String[] args) {
		// System.out.println("Al� mundo!");

		int dia = 0;
		float salario = 150.25f; //N�o esquece do f depois dos n�meros.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o dia da semana em n�meros de 1 a 7");
		dia = teclado.nextInt(); //scanf
		
		if(dia == 1) {
			System.out.println("Hoje � domingo.");
		}
		else if(dia == 2) {
			System.out.println("Hoje � segunda.");
		}
		else if(dia == 3) {
			 System.out.println("Hoje � ter�a.");
		}
		else if(dia == 4) {
			System.out.println("Hoje � quarta.");
		}
		else if(dia == 5) {
			 System.out.println("Hoje � quinta.");
		}
		else if(dia == 6) {
			System.out.println("Hoje � sexta.");
		}
		else if(dia == 7) {
			System.out.println("Hoje � s�bado.");
		}
		else {
			System.out.println("Valor inv�lido.");
		}

	}

}