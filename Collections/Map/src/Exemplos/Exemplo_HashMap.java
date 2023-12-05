/*Maps são usados para armazenar algo relacionado à outro, um valor nunca aparecerá sem o outro que o acompanha.
Há três tipos de Maps:
  HashMap: Implementação padrão do Map. Não há nenhum tipo de ordenação.
  LinkedHashMap: Mesmo que HashMap, mas usa a ordem de inserção e suporta valores nulos (null).
  TreeMap: Sempre usa a ordenação ascendente, muito usado para dados hierárquicos. Não tem suporte para valores nulos (null).*/

package Exemplos;

import java.util.HashMap;
import java.util.Map;

public class Exemplo_HashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//.put(valor 1, valor 2); é usado para colocar valores dentro do Map.
		map.put("Qualquer coisa", 1234);
		map.put("1234", 5678);
		map.put("um dois três", 123);
		
		System.out.println(map);
		
		for(Map.Entry<String, Integer> be : map.entrySet()) {
			System.out.println(be.getKey() + ":");
			System.out.println(be.getValue());
		}
	}

}
