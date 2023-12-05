package Exemplos;

import java.util.Map;
import java.util.TreeMap;

public class Exemplo_TreeMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("arvore", 1);
		map.put("arbusto", 14);
		map.put("Pinheiro", 2);
		
		//É possível fazer desta forma o for, for(String key : treeMap.keySet()){}
		//Está forma abaixo é a mais adequada para iterar Maps.
		for(Map.Entry<String, Integer> be : map.entrySet()) {
			System.out.println(be.getKey());
			System.out.println(be.getValue());
		}
	}

}
