package Exemplos;

import java.util.ArrayList;

public class Lists_exemplo2 {

	public static void main(String[] args) {
		
		// ------------- Acessando elementos dentro das Listas. -------------
		//Vamos utilizar dos mesmas variáveis anteriores. 
		
		String item1 = "olá";
		String item2 = "tudo bem?";
		
		//Criação da Lista.
		ArrayList<String> lista = new ArrayList();
		
		//Adicionando dentro da Lista.
		lista.add(item1);
		lista.add(item2);
		
		String elemento1 = lista.get(0);
				
		System.out.println(elemento1);
				
		//.get(index) é usado para pegar o elemento dentro da Lista correspondente ao index colocado nos parâmetros.
		//É possível usar destas duas formas.
				
		System.out.println(lista.get(0));
		System.out.println("\n------- For -------\n");
				
		//Com o .get(index) é possível pegar o elemento sem os colchetes []. 
				
		//Dentro da Lista pode haver vários elementos, para pegar todos eles fazemos um for desta forma.
		//Para facilitar e deixar o código mais fácil de modificar, usamos o .size(), onde ele mostrará o tamanho da Lista.
		//Para mostrar melhor, vamos adicionar mais uma variável na Lista.
				
		String item3 = "Tudo e você?";
				
		lista.add(item3);
				
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
