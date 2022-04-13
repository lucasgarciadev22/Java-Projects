package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		//hashset desordenado
		Set<String> lista = new HashSet<String>();//cria um conjuntos de strings ( HashSet <>) também da certo
		lista.add("Ana");
		lista.add("Lucas");
		lista.add("Bartolomeu");
		lista.add("Erick");
		
		for (String candidato: lista) { //insere conjunto lista dentro do objeto candidato
			System.out.println(candidato);
		}
		
		//treeset ordenada
		SortedSet<String> listaOrdenada = new TreeSet<>();//cria um conjuntos de strings ( HashSet <>) também da certo
		listaOrdenada.add("Ana");
		listaOrdenada.add("Lucas");
		listaOrdenada.add("Bartolomeu");
		listaOrdenada.add("Erick");
		
		for (String candidatoOrdenado: listaOrdenada) { //insere conjunto lista dentro do objeto candidato
			System.out.println(candidatoOrdenado);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		//fazendo autobox dentro da estrutura for
		for(int n: nums) {
			System.out.println(n);//ele converte objeto n em tipo primitivo ao gravar os valores nele
		}
	
	}
}
