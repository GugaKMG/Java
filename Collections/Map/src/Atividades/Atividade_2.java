package Atividades;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		try {
		
		int verif;
		String srt1, srt2;
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantas verificações você deseja?");
		verif = s.nextInt();
		
		for(int i = 0; i < verif; i++) {
			System.out.println("Digite duas diferentes palavras: ");
			srt1 = s.next();
			srt2 = s.next();
			
			if(map.containsKey(srt1) || map.containsValue(srt2)) {
				System.out.println("Não digite valores iguais. Tente novamente");
				i--;
			}
			else {
				map.put(srt1, srt2);
			}
		}
		
		for(Map.Entry<String, String> be : map.entrySet()) {
			if(be.getKey().length() == be.getValue().length()) {
				System.out.println("A palavra " + be.getKey() + " tem o mesmo número de letras da palavra " + be.getValue());
				System.out.println("----------");
			}
			else{
				System.out.println("A palavra " + be.getKey() + " não tem o mesmo número de letras da palavra " + be.getValue());
				System.out.println("----------");
			}
		}
		s.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
