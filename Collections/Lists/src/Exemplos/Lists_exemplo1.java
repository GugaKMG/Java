package Exemplos;

//Import para usar as Listas ou Lists.
import java.util.ArrayList;

public class Lists_exemplo1 {

	public static void main(String[] args) {
		//Vari�veis
		String item1 = "ol�";
		String item2 = "tudo bem?";
		
		//A Lista � sempre criada como objeto.
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