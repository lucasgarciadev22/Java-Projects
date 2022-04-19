package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//offer e add -> adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia! (add gera erro e o offer apenas da resultado falso e n�o adiciona)
		
		fila.offer("Ana");
		fila.add("Robert");
		fila.offer("Linda");
		fila.add("Bruna");
		fila.offer("Herman");
		fila.add("Daniela");
		
		//peek e element -> leitura do pr�ximo elemento da vez na fila (sem remover)
		//Direfen�a � o comportamento quando a fila est� vazia! (peek retorna null e element gera um erro)
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//Outras fun��es
		//fila.size();//retorna o tamanho da fila
		//fila.clear();//limpa a fila
		//fila.isEmpty;//verifica se a fila estpa vazia
		
		
		//poll e remove -> removeo pr�ximo elemento da vez  na fila 
		//Diferen�a � o comportamento que ocorre quando a fila est� vaia! (poll retorna null e remove gera erro)
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
		
		
		
	
	
	}

}
