package vetores;

import java.util.Scanner;

public final class com_ifsc_tds_vetor_exemplo {

/**
 * IFSC
 * @author Prof. Alexandre
 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n = 10; // tamanho do vetor v.
		int v[] = new int[n]; // declaração do vetor.
		int i; // índice.
		
		for(i = 0; i < n; i++) {
			System.out.printf("Informe %2do valor de %d: ", (i + 1), n);
			v[i] = teclado.nextInt();
		}
		
		int soma = 0;
		int menor = v[0]; // v[0] = primeiro valor do vetor, nenhuma variavel pode ficar sem valor na declaração
		int maior = v[0];
		
		//Processamento: somar, descobrir maior e menor.
		for(i = 0; i < n; i++) {
			soma = soma + v[i];
			if(v[i] < menor) {
				menor = v[i];
			}
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		
		//Saída de dados.
		System.out.println("\n");
		for(i = 0; i < n; i++) {// pode-se usar v.lenght para não precisar da variável n
			
			if(v[i] == menor)
				System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
			
			else if(v[i] == maior)
				System.out.printf("v[%d] = %2d <--- maior valor\n",  i, v[i]);
			
			else
				System.out.printf("v[%d] = %2d\n", i, v[i]);

		}
		System.out.printf("\nSoma = %d\n", soma);
		
		teclado.close();

	}

}
