package com.ifsc.tds;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		byte idade;
		
		System.out.println("Digite a sua idade.");
		
		Scanner teclado = new Scanner(System.in);
		idade = teclado.nextByte();
		
		System.out.println("Digite a sua idade.");
		
		if(idade >= 18) {
			System.out.println("Você é maior de 18 anos.");
		} else {
			System.out.println("Você não é maior de 18 anos.");
		}

	}

}
