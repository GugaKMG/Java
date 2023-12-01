package Atividades;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
	try {
		int item = 0, procura = 0, sucesso = 0;
		
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite cinco n�meros: ");
		
		for(int i = 0; i < 5; i++) {
			item = teclado.nextInt();
			lista.add(item);
		}
		
		System.out.println("Qual elemento deseja procurar?\n");
		
		procura = teclado.nextInt();
		
		for(Integer itens : lista) {
			if(itens == procura) {
				sucesso++;
			}
			
		}
		
		if(sucesso > 0) {
			System.out.println("O n�mero " + procura + " est� na lista e apareceu " + sucesso + " vezes.");
		}
		else {
			System.out.println("O n�mero " + procura + " n�o est� na lista.");
		}
		teclado.close();
		
	  } catch(InputMismatchException e) {
		   System.out.println("Erro; N�o digite letras, reinicie o programa e tente novamente.");
		   e.printStackTrace();
	  } catch(Exception e) {
		  e.printStackTrace();
	    }
     }
  }