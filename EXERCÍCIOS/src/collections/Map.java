package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberta");//adiciona ou sbstitui se já existir
		usuarios.put(1, "Ricardo");//nesta situação ele substituiria
		System.out.println(usuarios);
		
		//deste modo ele apenas adiciona pois os codigos de usuario (int) não são iguais.
		usuarios.put(20, "Lucas");
		usuarios.put(18, "Lucas");
		usuarios.put(3, "Lucas");
		usuarios.put(2, "Lucas");
		System.out.println(usuarios);
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet());//exibe apenas Integer que é conjunto de chaves
		System.out.println(usuarios.values());//exibe apenas String que é conjunto dos valores dos nomes
		System.out.println(usuarios.entrySet());//exibe o Map completo (int, str)
		
		System.out.println(usuarios.containsKey(20));//verifica se existe a chave 20 (int) no mapa
		System.out.println(usuarios.containsValue("Ricardo"));//verifica se existe o elemento Ricardo (str) no mapa
		
		//MÉTODOS DE EXIBIÇÃO DE MAPAS COM ESTRUTURAS FOR
		
		//exibe a lista de chaves de usuarios inseridas no mapa
		for (int chaves: usuarios.keySet()) {
			System.out.println(chaves);
		}
		
		//exibe a lista de valores string de usuarios inseridas no mapa
		for (String valores: usuarios.values()) {
					System.out.println(valores);
				}
		//exibe um mapa completo percorrendo por ele com for especial Entry (Map)
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
		//   mapa < key   ,  value > variavel for : mapa. entrySet())	
		
			//exibe key===>usuario
			System.out.print(registro.getKey()+"===>");//imprime key
			System.out.println(registro.getValue());//imprime value
		}
				
	
	
	}
}
