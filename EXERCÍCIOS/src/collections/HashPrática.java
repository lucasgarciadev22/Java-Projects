package collections;

import java.util.HashSet;

public class HashPrática {
	
	public static void main(String[] args) {
		//neste programa implementamos a classe anteriormente criada Usuario dentro de um HashCode válido para testar
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Lucas"));
		
		boolean resultado = usuarios.contains(new Usuario ("Lucas"));//verifica se existe Lucas no HashCode
		System.out.println(resultado);//resultado true > HashCode implementado com sucesso... 
		
	}

}
