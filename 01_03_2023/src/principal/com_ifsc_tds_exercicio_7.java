package principal;

import java.util.Scanner;

public class Com_ifsc_tds_exercicio_7 {

/**
 * Feito no ifsc
 * @author Gustavo Krüger de Mira
 * @since 01/03/2023
 * github: GugaKMG
 * */
	public static void main(String[] args) {
		int macas;
		double duzia=1, soma, naoduzia=1.30;
		
		System.out.println("Digite quantas maçãs você comprou: ");
		
		Scanner teclado = new Scanner(System.in);
		macas=teclado.nextInt();
		
		if(macas >= 12) {
			soma=duzia*macas;
			System.out.print("Você irá pagar \n"+soma);
		}else {
			soma=naoduzia*macas;
			System.out.print("Você irá pagar \n"+soma);
		}

	}

}
