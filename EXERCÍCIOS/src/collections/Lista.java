package collections;

import java.util.ArrayList;

public class Lista {

	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		//metodo 1 de adicionar na lista
		Usuario u1= new Usuario ("Ana");
		lista.add(u1);
		//outr metodo de adicionar usuario
		lista.add(new Usuario ("Lucas"));
		lista.add(new Usuario ("Ronaldo"));
		lista.add(new Usuario ("Gilbras"));
		lista.add(new Usuario ("Arnaldo"));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);//mostra so os nomes da lista
		}
		
		
	//para mostrar a frase ' Meu nome é "+ (nome) conforme o método da classe use apenas o objeto 	u	
		
		for (Usuario u: lista) {
			System.out.println(u);
		}
		
		// pode também usar comando get para obter um elemento da lista
		
		System.out.println(lista.get(1)); 
	}
}
