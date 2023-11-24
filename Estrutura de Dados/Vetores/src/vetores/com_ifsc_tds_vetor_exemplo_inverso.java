package vetores;

import java.util.Scanner;

public class com_ifsc_tds_vetor_exemplo_inverso {

/**
 * IFSC
 * @author Prof. Alexandre
 * */
	public static void main(String[] args) {
		int vetor[] = new int [10];
		int soma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o número" + (i + 1) + ": ");
			vetor[i] = teclado.nextInt();
		}
		// 10-1=9, há nove índices no vetor já que começa de 0. i > -1 ou seja 0.
		for(int i = vetor.length - 1; i > -1; i--) {
			System.out.println("Número digitado " + (i + 1) + ": " + vetor[i]);
			soma = soma + vetor[i];
		}
		System.out.println("Total: " + soma);

		teclado.close();
	}

}
