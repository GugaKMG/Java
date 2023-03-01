package Principal;

import java.util.Scanner;

public class Com_ifsc_tds_exercicio_3 {

/**
 * Feito no ifsc
 * @author Gustavo Krüger de Mira
 * @since 01/03/2023
 * github: GugaKMG
 * */
	public static void main(String[] args) {
		float preco, soma=0;
		
		System.out.println("Digite o valor dos itens.");
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			preco=teclado.nextFloat();
			soma=soma+preco;
		}
		System.out.println("Este é o valor a pagar "+ String.format("%.2f", soma));

	}

}
