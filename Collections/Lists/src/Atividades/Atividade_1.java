package Atividades;

import java.util.ArrayList;

public class Atividade_1 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int num3 = 23;
		int resul = 0;
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(num1);
		lista.add(num2);
		lista.add(num3);
		
		for(int i = 0; i < lista.size(); i++) {
			resul += lista.get(i);
		}
		
		System.out.println(resul);
	}

}
