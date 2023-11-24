package vetores;

import java.util.Scanner;

public class com_ifsc_tds_vetor_exercicio_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num[] = new int [3];
		int menor = 0; 
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("Digite o %do número: ", i + 1);
			num[i] = teclado.nextInt();
			
			if(num[i] < menor) 
				menor = num[i];
		}
		System.out.printf("Esse é o maior número %d", menor);

		teclado.close();
	}

}
