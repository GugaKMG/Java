package Principal;

import java.util.Scanner;

public class Com_ifsc_tds_exercicio_1 {

/**
 * Feito no ifsc
 * @author Gustavo Kr�ger de Mira
 * @since 01/03/2023
 * github: GugaKMG
 * */
	public static void main(String[] args) {
		double n, soma=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite suas notas: ");
		
		for(int i=0;i<3;i++) {
			n=teclado.nextDouble(); //n�o esquecer que n�o � necessario vetor.
			soma=soma+n;
		}	
		System.out.println("M�dia: "+ soma/3);
	}
}
