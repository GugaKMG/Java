package Exemplos;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exemplo_LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("um", 1);
		map.put("dois", 2);
		map.put("três", 3);
		
		System.out.println(map);
		
		//.get(Valor dentro do Map); usado para pegar o valor digitado dentro dos parâmetros. 
		System.out.println(map.get("um"));
		
		//.size(); como nas Lists e Sets, usado para saber o tamanho do Map.
		System.out.println(map.size());
		
		//.isEmpty(); usado para saber se o Map está vazio.
		System.out.println(map.isEmpty());
		
		//.containsKey(); usado para saber se o valor chave está no Map.
		System.out.println(map.containsKey("dois"));
		
		/*.containsValue(); usado para saber se o valor que não é a chave está no Map.
		Se colocar algum valor chave, ele irá apenas ignorar e continuar o programa.*/
		System.out.println(map.containsValue(5));
		System.out.println(map.containsValue(3 + 2));
		System.out.println("----------");
		
		for(Map.Entry<String, Integer> be : map.entrySet()) {
			System.out.println(be.getKey());
			System.out.println(be.getValue());
			System.out.println("----------");
		}
	}

}
