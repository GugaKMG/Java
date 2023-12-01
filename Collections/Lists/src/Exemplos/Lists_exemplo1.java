package Exemplos;

//Import para usar as Listas ou Lists.
import java.util.ArrayList;

public class Lists_exemplo1 {

	public static void main(String[] args) {
		//Variáveis
		String item1 = "olá";
		String item2 = "tudo bem?";
		
		//A Lista é sempre criada como objeto.
		ArrayList<String> lista = new ArrayList<>();

		//Adicionar elementos dentro das Listas.
		lista.add(item1);
		
		System.out.println(lista);
		
		lista.add(item2);
		
		System.out.println(lista);
		
		//Remover elementos dentro das Listas.
		lista.remove(0);
		
		System.out.println(lista);
	}
}