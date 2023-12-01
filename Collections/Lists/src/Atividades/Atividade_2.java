package Atividades;

import java.util.ArrayList;

public class Atividade_2 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 11;
		int num3 = 34;
		int num4 = 51;
		int maior = 0;;//Pode ser usado com Array também.
		//int maior[];
		
		//Lista
		ArrayList<Integer> lista = new ArrayList<>();
		
		//Adicionando elementos.
		lista.add(num1);
		lista.add(num2);
		lista.add(num3);
		lista.add(num4);
		
		for(int i = 0; i < lista.size(); i++) {
			if(maior < lista.get(i)) {
				maior = lista.get(i);
			}
		}
		System.out.println(maior);
	}

}
