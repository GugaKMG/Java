package Principal;

import java.util.Scanner;

public class com_ifsc_tds_exercicio_1 {

	public static void main(String[] args) {
		int n, cont = 0, maior = 0, menor = 0;
		
		System.out.println("Digite 10 n�meros: ");
		
		Scanner teclado = new Scanner(System.in);
		
		while(cont < 10) {
			n=teclado.nextInt();
			
			if(n > maior) {
				maior = n;
			}if(n < menor) {
				menor = n;
			}
			cont++;
		}
		System.out.println("Este foi o menor n�mero digitado "+ menor);
		System.out.println("Este foi o maior "+ maior);


	}

}
