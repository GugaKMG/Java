package com.ifsc.tds;

import java.util.Scanner;

public class meidanota {

	public static void main(String[] args) {
		
		byte nota;
		
		System.out.println("Digite a nota do aluno: ");
		
		Scanner teclado = new Scanner(System.in);
		nota = teclado.nextByte();
		
		if(nota >= 60) {
			System.out.println("O aluno est� aprovado.");
		} else if (nota < 20) {
			System.out.println("O aluno est� reprovado.");
		} else if (nota < 60){
			System.out.println("O aluno est� em recupera��o.");
		} else {
			System.out.println("Valor inv�lido.");
		}

	}

}
