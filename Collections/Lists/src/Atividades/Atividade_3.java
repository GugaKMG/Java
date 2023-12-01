package Atividades;

import java.util.ArrayList;

public class Atividade_3 {

	public static void main(String[] args) {
		double nota1 = 7.5;
		double nota2 = 5.1;
		double nota3 = 9;
		double soma = 0;
		
		ArrayList<Double> lista = new ArrayList<>();
		
		lista.add(nota1);
		lista.add(nota2);
		lista.add(nota3);
		
		for(int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		
		System.out.println(soma/lista.size());
	}

}
