package Atividades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		try {
		
		int nota = 0, maior = 0;
		String aluno = "";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i <
				3; i ++) {
			System.out.println("Qual o nome do " + (i + 1) + " aluno?");
			aluno = s.next();
			System.out.println("Qual foi a sua nota?");
			nota = s.nextInt();
			
			map.put(aluno, nota);
		}
		for(Map.Entry<String, Integer> be : map.entrySet()) {
			if(maior < be.getValue()) {
				maior = be.getValue();
				aluno = be.getKey();
			}
		}
		System.out.println("Este é o aluno com a maior nota da turma: " + aluno + " com uma nota de: " + maior);
		s.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
