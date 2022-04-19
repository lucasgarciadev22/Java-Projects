package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.peek());//busca sempre o primeiro livro da pilha
		
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
		//exibe pilha completa
		for (String livrospilha: livros) {
			
			System.out.println(livros.peek());
			
		}

		
		
	}

}
