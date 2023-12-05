/*Maps s�o usados para armazenar algo relacionado � outro, um valor nunca aparecer� sem o outro que o acompanha.
H� tr�s tipos de Maps:
  HashMap: Implementa��o padr�o do Map. N�o h� nenhum tipo de ordena��o.
  LinkedHashMap: Mesmo que HashMap, mas usa a ordem de inser��o e suporta valores nulos (null).
  TreeMap: Sempre usa a ordena��o ascendente, muito usado para dados hier�rquicos. N�o tem suporte para valores nulos (null).*/

package Exemplos;

import java.util.HashMap;
import java.util.Map;

public class Exemplo_HashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//.put(valor 1, valor 2); � usado para colocar valores dentro do Map.
		map.put("Qualquer coisa", 1234);
		map.put("1234", 5678);
		map.put("um dois tr�s", 123);
		
		System.out.println(map);
		
		for(Map.Entry<String, Integer> be : map.entrySet()) {
			System.out.println(be.getKey() + ":");
			System.out.println(be.getValue());
		}
	}

}
